package com.example.flowershop.controller;

import com.example.flowershop.model.dto.DeliveryDto;
import com.example.flowershop.model.dto.DeliveryReturnDto;
import com.example.flowershop.model.dto.DeliveryUpdateDto;
import com.example.flowershop.service.DeliveriesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/deliveries")
@RequiredArgsConstructor
public class DeliveriesController {

    private final DeliveriesService deliveriesService;

    @GetMapping
    public String getDeliveries(Model model, Pageable pageable){
       List<DeliveryReturnDto> deliveries = deliveriesService.findAll();
       model.addAttribute("deliveries",deliveries);
       model.addAttribute("deliveryDto", new DeliveryDto());
        return "deliveries";
    }

    @PostMapping
    public String createDelivery(@ModelAttribute("deliveryDto") @Valid DeliveryDto deliveryDto,
                                 BindingResult bindingResult,
                                 Model model) {
        model.addAttribute("deliveryDto", new DeliveryDto());
        deliveriesService.create(deliveryDto);
        return "redirect:/deliveries";
    }

    @GetMapping("/update-form/{id}")
    public String updateDeliveryForm(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("oldDelivery", deliveriesService.findById(id));
        model.addAttribute("deliveryUpdateDto", new DeliveryUpdateDto());
        return "deliveries/updateForm";
    }

    @PostMapping("/update")
    public String updateDelivery(@ModelAttribute @Valid DeliveryUpdateDto deliveryUpdateDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("oldDelivery", deliveriesService.findById(deliveryUpdateDto.getId()));
            return "deliveries/updateForm";
        }
        deliveriesService.update(deliveryUpdateDto);
        return "redirect:/deliveries";
    }

    @GetMapping("/delete/{id}")
    public String deleteDelivery(@PathVariable("id") Integer id){
        deliveriesService.deleteDelivery(id);
        return "redirect:/deliveries";
    }

}
