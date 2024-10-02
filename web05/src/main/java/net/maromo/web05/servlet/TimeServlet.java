package net.maromo.web05.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.maromo.web05.dao.JogadorDao;
import net.maromo.web05.model.Jogador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TimeServlet", value = "/times")
public class TimeServlet extends HttpServlet {

    private List<Jogador> lista = new ArrayList<>();


    public void adicionarNoTime(Jogador jogador) throws ClassNotFoundException {
        lista.add(jogador);
        JogadorDao jogadorDao = new JogadorDao();
        jogadorDao.adicionarJogador(jogador);
    }


    public List<Jogador> listaDeJogadores() throws ClassNotFoundException {
        JogadorDao jogadorDao = new JogadorDao();
        try {
            return jogadorDao.listarJogadores();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<HTML>");
        resp.getWriter().println("<HEAD>");
        resp.getWriter().println("<meta charset='utf-8'>");
        resp.getWriter().println("<TITLE>Time Servlet - Primeira Servlet</TITLE>");
        resp.getWriter().println("</HEAD>");
        resp.getWriter().println("<BODY>");
        resp.getWriter().println("<h1>Primeira Servlet</h1>");
        resp.getWriter().println("<p>Parágrafo Único</p>");
        resp.getWriter().println("</BODY>");
        resp.getWriter().println("</HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jogador jogador = new Jogador();
        jogador.setNome(req.getParameter("nomeJogador"));
        jogador.setApelido(req.getParameter("apelidoJogador"));
        jogador.setPosicao(req.getParameter("posicaoJogador"));
        jogador.setIdade(Integer.parseInt(req.getParameter("idadeJogador")));
        try {
            this.adicionarNoTime(jogador);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("<meta charset='utf-8'>");
        resp.getWriter().println("<title>Dados Cadastrados</title>");
        resp.getWriter().println("</head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h2>Jogador Cadastrado com Sucesso</h2>");
        try {
            for (Jogador j : this.listaDeJogadores()) {
                resp.getWriter().println("<p>Nome do Jogador: " + j.getNome() + "</p>");
                resp.getWriter().println("<p>Apelido do Jogador: " + j.getApelido() + "</p>");
                resp.getWriter().println("<p>Posição do Jogador: " + j.getPosicao() + "</p>");
                resp.getWriter().println("<p>Idade do Jogador: " + j.getIdade() + "</p>");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html");
    }

}

