var number_of_roses =0;
var orderMessage_roses;

var number_of_gerbera = 0;
var orderMessage_gerbera;

var number_of_tulips = 0;
var orderMessage_tulips;

var number_of_bluepoppy = 0;
var orderMessage_bluepoppy;

var number_of_daylily = 0;
var orderMessage_daylily;

var number_of_orchid = 0;
var orderMessage_orchid;


function order_roses() {
    number_of_roses = parseFloat(document.getElementById("first1").value);
    orderMessage_roses = "Total number of ordered roses is: " + number_of_roses + " " + "buc";

}



function order_gerbera() {
    number_of_gerbera = parseFloat(document.getElementById("first2").value);
    orderMessage_gerbera = "Total number of ordered gerbera is: " + number_of_gerbera + " " + "buc";

}


function order_tulips() {
    number_of_tulips = parseFloat(document.getElementById("first3").value);
    orderMessage_tulips = "Total number of ordered tulips is: " + number_of_tulips + " " + "buc";

}


function order_bluepoppy() {
    number_of_bluepoppy = parseFloat(document.getElementById("first4").value);
    orderMessage_bluepoppy = "Total number of ordered blue poppy is: " + number_of_bluepoppy + " " + "buc";

}


function order_daylily() {
	
    number_of_daylily = parseFloat(document.getElementById("first5").value);
    orderMessage_daylily = "Total number of ordered daylily is: " + number_of_daylily + " " + "buc";

}


function order_orchid() {
	number_of_orchid = parseFloat(document.getElementById("first6").value);
    orderMessage_orchid = "Total number of ordered orchids is: " + number_of_orchid;

	
}




function total_order() {
    var orderMessage_total = "Your order is: " + "\n" + "\n" + 
                             "- Roses: " + number_of_roses + " buc " + " x " + " 25 ron " + " = "+ (number_of_roses * 25 ) + " ron " + "\n" +
                             "- Gerbera: " + number_of_gerbera + " buc " + " x " + " 15 ron " + " = "+ (number_of_gerbera * 15 ) + " ron " +"\n" +
							 "- Tulips: " + number_of_tulips + " buc " + " x " + " 15 ron " + " = "+ (number_of_tulips * 15 ) + " ron " +"\n" +
							 "- Blue Poppy: " + number_of_bluepoppy + " buc " + " x " + " 30 ron " + " = "+ (number_of_bluepoppy * 30 ) + " ron " +"\n" +
							 "- Daylily: " + number_of_daylily + " buc " + " x " + " 20 ron " + " = "+ (number_of_daylily * 20 ) + " ron " +"\n" +
							 "- Orchid: " + number_of_orchid + " buc " + " x " + " 60 ron " + " = "+ (number_of_orchid * 60 ) + " ron " +"\n" + "\n" + 	 
							 "Total of ordered flowers: " + (number_of_roses + number_of_gerbera + number_of_tulips + number_of_bluepoppy + number_of_daylily + number_of_orchid) + " " + " buc "+ "\n" + 
							 "Total amount to pay: " + (number_of_roses * 25 + number_of_gerbera * 15 + number_of_tulips * 15 + number_of_bluepoppy * 30 + number_of_daylily * 20 + number_of_orchid * 60)+" " + " ron "
							 
     alert(orderMessage_total);
	
}