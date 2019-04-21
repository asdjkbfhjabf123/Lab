package com.geekzila.lab;

import java.util.List;

import com.geekzila.lab.model.Lab;
import com.geekzila.lab.service.LabService;
import com.geekzila.lab.service.impl.LabServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LabService labService = new LabServiceImpl();
		List<Lab> labs = labService.findAll();

		for (int i = 0; i < labs.size(); i++) {
			Lab lab = labs.get(i);
			System.out.println("Name: " + lab.getName());
		}
	}
}
