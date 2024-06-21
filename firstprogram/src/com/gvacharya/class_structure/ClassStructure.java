package com.gvacharya.class_structure;

public class ClassStructure {

	//instance variable
	int price;
	int barcode;
	String brandname;
	
	//default constructor
	public ClassStructure () {
		
	}
	
	//parameterized constructor
	public ClassStructure(int newPrice, int newBarcode, String newBrandname) {
		price = newPrice;
		barcode = newBarcode;
		brandname = newBrandname;
	}
	
	//behaviors or methods
	
	
	      //set price
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	
	      //set barcode
	public void setBarcode(int newBarcode) {
		barcode = newBarcode;
	}
	
	      //set Brandname
	public void setBrandname(String newBrandname) {
		brandname = newBrandname;
	}
	
	
		 //get price
	public int getPrice() {
		return price;
	}

	     //get Barcode
	public int getBarcode() {
		return barcode;
	}
	
		 //get Brandname
	public String getBrandname() {
		return brandname;
	}

}