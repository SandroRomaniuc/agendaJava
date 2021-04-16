package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class Contador extends HttpServlet{
	private int contador = 0; //variavel de instância
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		contador++; // a cada requisição a mesma variável é incrementada
		// recebe o writer
		PrintWriter out = resp.getWriter();
		// escreve o texto
		out.println("<html>");
		out.println("<body>");
		out.println("Contador agora é: " + contador);
		out.println("</body>");
		out.println("</html>");
		}
	}


