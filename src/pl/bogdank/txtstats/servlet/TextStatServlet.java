package pl.bogdank.txtstats.servlet;

import pl.bogdank.txtstats.utils.TextStatistics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text")
public class TextStatServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("textarea");

        TextStatistics stats = new TextStatistics();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println(stats.printInfo(text));
        printWriter.close();
    }
}
