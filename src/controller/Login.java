package controller;

import org.apache.catalina.realm.GenericPrincipal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login.do")
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            req.login(username, password);
            GenericPrincipal genericPrincipal = (GenericPrincipal) req.getUserPrincipal();
            String[] roles = genericPrincipal.getRoles();
            resp.sendRedirect("/" + roles[0]);
        } catch (Exception e) {
            resp.sendRedirect("/login-error.jsp");
        }
    }
}
