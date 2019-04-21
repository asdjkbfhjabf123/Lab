package com.geekzila.lab.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.lab.model.Lab;
import com.geekzila.lab.service.LabService;

public class LabServiceImpl implements LabService {

	public List<Lab> labs = new ArrayList<Lab>();

	public LabServiceImpl() {
		labs.add(new Lab("Rakesh"));
		labs.add(new Lab("Aruv"));

	}

	public void add(Lab lab) {
		// TODO Auto-generated method stub
		labs.add(lab);

	}

	public List<Lab> findAll() {
		// TODO Auto-generated method stub
		return labs;
	}

}
