package br.com.sbs.papiros.servlet;

import br.com.sbs.papiros.dao.AuthorsDao;
import br.com.sbs.papiros.factory.ConnectionFactory;
import br.com.sbs.papiros.model.Author;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/authors")
public class AuthorServlet extends HttpServlet {

    private AuthorsDao authorsDao;

    public AuthorServlet() {
        this.authorsDao = new AuthorsDao(new ConnectionFactory().getConnection());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Author> authors = authorsDao.list();

        request.setAttribute("authors", authors);
        request.getRequestDispatcher("WEB-INF/views/authors.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        LocalDate birthDate = LocalDate.parse(request.getParameter("birthDate"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String name = request.getParameter("name");
        String miniResume = request.getParameter("miniResume");

        Author author = new Author(email, birthDate, name, miniResume);
        authorsDao.save(author);

        response.sendRedirect("authors");

    }
}
