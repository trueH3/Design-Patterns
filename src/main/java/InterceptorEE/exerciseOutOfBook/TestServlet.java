package InterceptorEE.exerciseOutOfBook;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    @Inject
    private SimpleEJB simpleEJB;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Hello from servlet");

        String text = req.getParameter("printMessage");
        simpleEJB.printMessage(text);


    }
}
