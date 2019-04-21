package com.geekzila.lab.service;

import java.util.List;

import com.geekzila.lab.model.Lab;

public interface LabService {

	public void add(Lab lab);

	public List<Lab> findAll();

}
