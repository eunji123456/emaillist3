package com.javaex.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.emaillist.dao.EamillstDao;
import com.javaex.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	@Autowired private EamillstDao dao;
	
	
	@RequestMapping ("/list")
	public String list(Model model) { //Model :기존객체  model :내가쓰려는 이름  
		
		/*
		EamillstDao dao = new EamillstDao(); 사실은 이개념이 스프링 프레임워크에서는 안맞음 . 여기서 new 해야되는것이 아니라 필요하다고 요청만 해야되는거임 
		그래서 위에 오토와이어드라고 표기해놓고 다오를 바로 가져다 쓸수 있음 
		*/
		
		List<EmaillistVo> list = dao.getlist();
		System.out.println(list.toString());
		model.addAttribute("list",list);
		return "WEB-INF/views/list.jsp";
	}
	
	@RequestMapping ("/add")
	public String add(@ModelAttribute EmaillistVo vo ){//파라미터로 넘어온 모든값을 모델 어트리부트하면 담아넣어줌  근데 우리가 이메일리스트 보 타입의
													//vo 라는 이름을 가진 애한테 넣겠다 햇으니까  알아서 넣어주는데 , 넘어온값name 과 이메일리스트 보 안에 
													//있는 애들중에 set기능을 가진 애들의 이름을 대조해서 맞으면 넣어줌 
		System.out.println("하하하핳" +vo.toString()); 
		dao.insert(vo);
		//리다이랙트 하는방법 
		
		//포워드     return "WEB-INF/views/form.jsp"  ;
		return "redirect:/list";

	}
	//form 
	//메소드 jsp 파일위치를 리턴으로 찍어주고 있음 
	@RequestMapping ("form")
	public String form(){
		/*List<EmaillistVo> list2 = dao.getlist();*/
/*		System.out.println(list2.toString());*/
		System.out.println("하하하핳");
		return "WEB-INF/views/form.jsp" ;
		
	}
}
