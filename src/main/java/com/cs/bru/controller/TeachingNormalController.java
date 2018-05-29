package com.cs.bru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.bru.dao.TeacherDAO;
import com.cs.bru.model.Teacher;



@Controller
public class TeachingNormalController {
	
	@Autowired
	TeacherDAO TeacherDAO;
	
	
	
	

}
