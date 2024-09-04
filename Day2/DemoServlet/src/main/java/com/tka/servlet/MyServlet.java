package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("U r in init Method.....");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("U r in destroy Method.....");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String strUsername= request.getParameter("myusername");
		System.out.println("Data is => "+strUsername);
		
		System.out.println("U r in Do Get Method....");
		
		
		if (!strUsername.equals("apple"))
			{
			System.out.println("Invalid User");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			pw.write("<h2 style='color:red;'>Invalid User</h2>");
			rd.include(request, response);
			}
		else
		{
			System.out.println("Valid User");
			HttpSession session=request.getSession();
			session.setAttribute("myusername", strUsername);
			/*
			RequestDispatcher rd=request.getRequestDispatcher("DashboardServlet");
			rd.forward(request, response);
			*/
			response.sendRedirect("DashboardServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}