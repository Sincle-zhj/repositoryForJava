package com.zhj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获得一个列表
 */
public class Servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * 业务逻辑代码
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ArrayList<String>> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		
		b.add("bbbbbb");
		c.add("cccccc1");
		c.add("cccccc2");
		d.add("dddddd");
		
		a.add(b);
		a.add(c);
		a.add(d);
		
		request.setAttribute("list", a);
		request.getRequestDispatcher("hello.jsp").forward(request, response);
		return ;
	}

}
