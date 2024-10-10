
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="java.util.*, net.maromo.web06.dao.JogadorDao, net.maromo.web06.model.Jogador"
%>
<html>
<head>
    <title>Cadastrar Jogadores</title>
</head>
<body>
<h2>Cadastro de Jogador</h2>

<form action="CadastrarJogadorServlet" method="post">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nomeJogador" required><br><br>

    <label for="apelido">Apelido:</label>
    <input type="text" id="apelido" name="apelidoJogador" required><br><br>

    <label for="posicao">Posição:</label>
    <input type="text" id="posicao" name="posicaoJogador" required><br><br>

    <label for="idade">Idade:</label>
    <input type="number" id="idade" name="idadeJogador" required><br><br>

    <input type="submit" value="Cadastrar Jogador">
</form>
</body>
</html>
