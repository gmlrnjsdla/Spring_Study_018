package com.heekwoncompany.study018;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heekwoncompany.dao.ContentDao;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	ContentDao dao;
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/")
	public String home() {
		return "list";
	}
	
	@RequestMapping(value = "list")
	public String list() {
		dao.list();
		
		
		return "list";
	}

	@RequestMapping(value = "writeForm")
	public String writeForm() {
		
		return "writeForm";
	}
	
	@RequestMapping(value = "write")
	public String write() {
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete() {
		
		return "redirect:list";
	}
}
