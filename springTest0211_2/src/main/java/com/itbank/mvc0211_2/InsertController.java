package com.itbank.mvc0211_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

	@Autowired
	@Qualifier("mdao")
	DaoInterface dao;
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) throws Exception {
		dao.insert(memberDTO);
	}
}
