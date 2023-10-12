package murach.email;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import murach.business.User;
import murach.data.UserIO;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.jsp";
        HttpSession session = request.getSession();

//6.1.6
//        GregorianCalendar currentDate = new GregorianCalendar();
//        int currentYear = currentDate.get(Calendar.YEAR);
//        request.setAttribute("currentYear", currentYear);
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        System.out.println(action);
        log(action);
        
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email);
            
            String message;
            if (firstName==null || lastName==null || email==null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty())
            {
                    message="Please fill out the required fields!";
                    url="/index.jsp";
            }
            else
            {
                    message="";
                    url="/thanks.jsp";
            }

            // set User object in request object and set URL
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        
        //Request date attribute
        Date currentDate = new Date();
        request.setAttribute("currentDate", currentDate);
        
        //Array attribute 
        String path = getServletContext().getRealPath("/EmailList.txt");
        ArrayList<User> users = UserIO.getUsers(path);
        session.setAttribute("users", users);

        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}
