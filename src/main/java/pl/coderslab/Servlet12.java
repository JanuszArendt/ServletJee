package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet12", urlPatterns = "/Servlet12")
public class Servlet12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("Wynik servletu w przeglądarce");
        System.out.println("Komunikat w konsoli");
        response.getWriter().append("<h1>Zrobione</h1><br>");
        response.getWriter().append("<a href='/index.html'>Powrót do strony głównej</a>");
    }
}
