package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class BiodataServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String u=req.getParameter("json");
		System.out.println(u);
		out.println("registered successfully");
	}
}
