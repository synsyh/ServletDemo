import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sunning on 2016/11/13.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<h1> hello world </h1>");
    }
}
