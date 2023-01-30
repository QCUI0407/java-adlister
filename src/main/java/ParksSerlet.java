import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ParksServlet", urlPatterns = "/parks")
public class ParksSerlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> parks = new ArrayList<>();
        parks.add("park1 NP");
        parks.add("park2 NP");
        parks.add("park3 NP");
        parks.add("park4 NP");
        parks.add("park5 NP");

        req.setAttribute("parks", parks);

        String username = req.getParameter("username");
        req.setAttribute("username", username);

        req.getRequestDispatcher("/parks.jsp").forward(req,resp);
    }
}
