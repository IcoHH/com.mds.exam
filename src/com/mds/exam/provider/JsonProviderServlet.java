package com.mds.exam.provider;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsonProviderServlet
 */
@WebServlet("/JsonProviderServlet")
public class JsonProviderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String list = "["
			+ "{"
			+ "\"name\":\"Emma Maersk\","
			+ "\"imo\":\"9321483\","
			+ "\"mmsi\":\"220417000\","
			+ "\"type\":\"Vehicles Carrier\""
			+ "},"
			+ "{"
			+ "\"name\":\"Gentle Leader\","
			+ "\"imo\":\"9391567\","
			+ "\"mmsi\":\"311003300\","
			+ "\"type\":\"Container Ship\""
			+ "},"
			+ "{"
			+ "\"name\":\"Handytankers Glory\","
			+ "\"imo\":\"9339624\","
			+ "\"mmsi\":\"309553000\","
			+ "\"type\":\"Chemical Oil Products Tanker\""
			+ "},"
			+ "{"
			+ "\"name\":\"Cantankerous\","
			+ "\"mmsi\":\"227786220\","
			+ "\"type\":\"Chemical Oil Products Tanker\""
			+ "}"	
			+ "]";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonProviderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(list);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
