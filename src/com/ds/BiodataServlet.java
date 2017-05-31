package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("serial")
public class BiodataServlet extends HttpServlet {
	ObjectMapper m1 = new ObjectMapper();
//	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false) ;


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		PrintWriter out=resp.getWriter();
		//String u=req.getParameter("json");
		pojo p1=m1.readValue(req.getParameter("json"), pojo.class);
		String name=p1.getn();
		String address=p1.geta();
		String email=p1.gete();
		String phone=p1.getp();
		
	}
}
