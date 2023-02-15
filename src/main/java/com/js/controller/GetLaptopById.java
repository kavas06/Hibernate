package com.js.controller;


import com.js.dao.LaptopCRUD;
import com.js.dto.Laptop;

public class GetLaptopById {
	public static void main(String[] args) {
		LaptopCRUD lc=new LaptopCRUD();
		Laptop l =lc.getLaptopById(3);
		if (l != null) {
System.out.println(l);
		} else {
			System.out.println("NO LAPTOP WITH GIVEN ID");
		}
	}

}
