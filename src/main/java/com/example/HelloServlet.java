package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	res.setContentType("text/html");
	res.getWriter().println("<h1>github->jenkins->docker->tomcat</h1>");
	}
}
