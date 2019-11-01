import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "Converter", urlPatterns = "/convert")
public class CurrencyConvertServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        long rate = Long.parseLong(request.getParameter("rate"));
        long usd = Long.parseLong(request.getParameter("usd"));
        long result = rate * usd;
        request.setAttribute("result", result);
        request.setAttribute("rate", rate);
        request.setAttribute("usd", usd);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
