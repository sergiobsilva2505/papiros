package br.com.sbs.papiros.servlet;

import br.com.sbs.papiros.model.Author;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/authors")
public class AuthorServlet extends HttpServlet {

    private List<Author> authors = new ArrayList<>();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Author monteiroLobato = new Author("monteiro.lobato@google.com", LocalDate.of(1882, 04, 18), "Monteiro Lobato", "Mini curriculo do Sr. Monteiro Lobato");
        Author machadoDeAssis = new Author("machado.assis@google.com", LocalDate.of(1839, 06, 21), "Machado de Assis", "Mini curriculo do Sr. Machado de Assis");
        authors.add(monteiroLobato);
        authors.add(machadoDeAssis);

        request.setAttribute("authors", authors);
        request.getRequestDispatcher("WEB-INF/views/authors.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
