package com.js.controller;

import java.util.List;

import com.js.dao.LaptopCRUD;
import com.js.dto.Laptop;

public class getAllLaptops {
	public static void main(String[] args) {
		LaptopCRUD lc = new LaptopCRUD();
		List<Laptop> laptops = lc.getAllLaptops();
		if (laptops.size() > 0) {
			for (Laptop l : laptops) {
				System.out.println(l);
			}

		} else {
			System.out.println("No Laptops In Database");
		}
	}
}
