package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class BiodataServlet extends HttpServlet {
	ObjectMapper m1 = new ObjectMapper();
	PersistenceManager pm=PMF.get().getPersistenceManager();
//	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false) ;


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		PrintWriter out1=resp.getWriter();
		String s1=req.getParameter("e1");
		
		db h=pm.getObjectById(db.class,s1);
		
		
		out1.println(h);
		
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
		db d=new db(name,address,phone,email);
		
		//up to above step received the json string send into the pojo class by this we differenticated each record
		try{ pm.makePersistent(d);	
	    out.println("Registered Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			}
		}
}
