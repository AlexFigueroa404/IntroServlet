package org.example.introservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


// /myapp/hola-mundo
@WebServlet("/parametro-get")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");


        PrintWriter out = resp.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Servlets</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Usuario: " + userName + "</h1>");
        out.print("<h1>Contraseña: " + password + "</h1>");
        out.print("</body>");
        out.print("</html>");


    }

}
