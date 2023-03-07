package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Member;
import com.dao.MemberDao;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Member member = null;
	MemberDao dao = new MemberDao();

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		//Properties propsBean = context.getBean("yamlProperties", Properties.class);
		//System.out.println(propsBean);
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("Register")) {
			member = new Member();
			member.setFirstName(request.getParameter("firstName"));
			member.setLastName(request.getParameter("lastName"));
			member.setEmail(request.getParameter("email"));
			member.setMobile(Long.parseLong(request.getParameter("mobile")));
			dao.addMember(member);
			response.sendRedirect("insert.jsp");;
		}
	}

}
