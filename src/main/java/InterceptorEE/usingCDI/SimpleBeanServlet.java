package InterceptorEE.usingCDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/simpleBean")
public class SimpleBeanServlet extends HttpServlet {

    private Logger LOG = LoggerFactory.getLogger(SimpleBeanServlet.class);

    @Inject
    SimpleBean simpleBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LOG.info(simpleBean.simpleBeanMessage());
    }
}
