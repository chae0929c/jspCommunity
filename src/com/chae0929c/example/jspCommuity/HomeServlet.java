package com.chae0929c.example.jspCommuity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 주소 : http://localhost:8081/jspCommunity/HomeServlet
// 팁 : 실행 F11
@WebServlet("/HomeServlet") // @는 컴퓨터가 읽는 주석
public class HomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("HelloWorld");
	}
}
