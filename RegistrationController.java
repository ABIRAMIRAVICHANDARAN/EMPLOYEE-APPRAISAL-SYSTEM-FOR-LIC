package com.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.dao.util.ConnectionUtil;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("Registraion is called");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String userName = request.getParameter("username");
		String mob = request.getParameter("mobilNo");

		String query = "	INSERT INTO AGENTREG (NAME,USERNAME,AGENTID) VALUES(?,?,?) ";
		Connection con = ConnectionUtil.createConnection();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, userName);
			ps.setInt(3, Integer.parseInt(id));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("NewReg.jsp").forward(request, response);
	}
}
