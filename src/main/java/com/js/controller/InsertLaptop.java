package com.js.controller;

import com.js.dao.LaptopCRUD;
import com.js.dto.Laptop;

public class InsertLaptop {
public static void main(String[] args) {
	Laptop l=new Laptop();
	l.setPrice(175999.0);
	l.setBrand("MAC");
	l.setProcessor("macos");
	l.setRam_gb(64);
	LaptopCRUD lc =new LaptopCRUD();
	if(lc.insert(l)==true) {
		System.out.println("LAPTOP INSERTED SUCESSFULLY");
		
	}else {
		System.out.println("FAILED TO INSERT");
	}
}
}
