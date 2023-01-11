package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getServlet")
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //The get parameter is used adding the '?' after the reqPath
        String val = req.getParameter("name");
        String htmlResponse = "<html><h3>Welcome to Servlets!</h3></html>";
        PrintWriter writer = resp.getWriter();
        writer.write(htmlResponse+" "+val);
    }
}