package com.example.flowershop.controller;

import com.example.flowershop.service.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserDataController {

  final UserDataService userDataService;

 // @GetMapping("")
 // public String showUsers(@RequestParam(required = false) Integer id, Model model) {
 //   userDataService.populateUsersModel(model, id);
//    return "users/view";
//  }
//
//  @PostMapping("/add")
//  public String addUser(
//      @RequestParam String firstName,
//      @RequestParam String lastName, @RequestParam String email) {
//    userDataService.addUser(firstName, lastName, email);
//    return "redirect:/users";
//  }
//
//  @PostMapping("/update")
//  public String updateUser(
//      @RequestParam int id, @RequestParam String firstName,
//      @RequestParam String lastName, @RequestParam String email) {
//    userDataService.updateUser(id, firstName, lastName, email);
//    return "redirect:/users";
//  }
//
//  @GetMapping("/delete/{id}")
//  public String deleteUser(@PathVariable int id) {
//    userDataService.deleteUser(id);
//    return "redirect:/users";
//  }
}