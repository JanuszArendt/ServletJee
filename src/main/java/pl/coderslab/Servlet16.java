package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Servlet16", urlPatterns = "/Servlet16")
public class Servlet16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        HttpServletRequest httpRequest = (HttpServletRequest) request;


        //response.getWriter().append(httpRequest.getHeader("user-agent"));
        Enumeration<String>enumeration = httpRequest.getHeaderNames();

            while(enumeration.hasMoreElements()){
                response.getWriter().append(enumeration.nextElement()).append(" - ")
                        .append(httpRequest.getHeader(enumeration.nextElement()))
                        .append("<br>");
            }
        response.getWriter().append("<br><a href='/index.html'>Powrót do strony głównej</a>");

    }


}
