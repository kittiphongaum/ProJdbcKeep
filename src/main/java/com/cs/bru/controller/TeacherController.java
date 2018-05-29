package com.cs.bru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.bru.dao.DepartmentDAO;
import com.cs.bru.dao.FacultyDAO;
import com.cs.bru.dao.PositionDAO;
import com.cs.bru.dao.RateDAO;
import com.cs.bru.dao.SubjactDAO;
import com.cs.bru.dao.TeacherDAO;
import com.cs.bru.dao.TermDAO;
import com.cs.bru.model.AllInOne;
import com.cs.bru.model.Teacher;





@Controller
public class TeacherController {
	@Autowired TeacherDAO teacherDAO;
	@Autowired PositionDAO positionDAO;
	@Autowired SubjactDAO subjactDAO;
	@Autowired TermDAO termDAO;
	@Autowired RateDAO Rate;
	@Autowired FacultyDAO FacultyDAO;
	@Autowired DepartmentDAO DepartmentDAO;
	
//	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
//	public String welcome() {
//		return "index";
//	}
	
	/*@RequestMapping(value = { "/TeachingRepost" }, method = RequestMethod.POST, produces = "application/json")
	public String insertTeacther(@RequestBody AllInOne allInOne ) {
		try {
		teacherDAO.insertTeacther(allInOne.getTeacher());
			positionDAO.insertPosition(allInOne.getPosition());
			subjactDAO.insertSubjact(allInOne.getSubject());
			termDAO.insertTerm(allInOne.getTerm());
			FacultyDAO.insertFaculty(allInOne.getFaculty());
			DepartmentDAO.insertDepartment(allInOne.getDepartment());
			
			System.out.println("PassCon");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "TeachingRepost";

	}*/
/*	@RequestMapping(value = { "/TeacherProfile" }, method = RequestMethod.POST, produces = "application/json")
	public String insertTeach(@RequestBody Teacher Teacher) {
		try {
			teacherDAO.insertTeacther(Teacher);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "TeacherProfile";
	}*/
//  path Update
	/*@RequestMapping( value = "/gotoUpdate" , method = RequestMethod.POST)
	public String gotoUpdate(Model model,String TeachID) {	
		Teacher bean = new Teacher();
		try {
			bean = positionDAO.PositionByID();
			if(bean.getTeachID() != null) {
				model.addAttribute("messesUpdate", "");
				model.addAttribute("resultBean", bean);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "update";
	}*/
	
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String repair(Model model) {
		return "testamnuay";
	}
	
	@RequestMapping(value = { "/insertamnuay" }, method = RequestMethod.POST, produces = "application/json")
	public String xxx(@RequestBody Teacher teacher) {
		try {
			teacherDAO.insertTeacther(teacher);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "testamnuay";
	}
	
}