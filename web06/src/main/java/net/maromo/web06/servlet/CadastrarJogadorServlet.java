package net.maromo.web06.servlet;
import net.maromo.web06.dao.JogadorDao;
import net.maromo.web06.model.Jogador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CadastrarJogadorServlet")
public class CadastrarJogadorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar os parâmetros do formulário
        String nome = request.getParameter("nomeJogador");
        String apelido = request.getParameter("apelidoJogador");
        String posicao = request.getParameter("posicaoJogador");
        int idade = Integer.parseInt(request.getParameter("idadeJogador"));

        // Criar um objeto Jogador
        Jogador jogador = new Jogador();
        jogador.setNome(nome);
        jogador.setApelido(apelido);
        jogador.setPosicao(posicao);
        jogador.setIdade(idade);

        // Inserir o jogador no banco de dados
        try {
            JogadorDao jogadorDao = new JogadorDao();
            jogadorDao.adicionarJogador(jogador);
            // Redireciona para uma página de listagem após o cadastro
            response.sendRedirect("listaJogadores.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
