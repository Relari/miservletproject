package com.example.resources;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet
public class AppServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Procesar la petición GET
		String mensaje = "Hola desde el servlet!";
		request.setAttribute("message", mensaje);

		// Redireccionar a la página JSP
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
