package com.hlo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/add")
public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request)
{
	int k=i+j;
	ModelAndView mv=new ModelAndView();
	mv.setViewName("display.jsp");
	mv.addObject("result",k);
	return mv;
}
}
