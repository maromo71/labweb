
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="java.util.*, net.maromo.web06.dao.JogadorDao, net.maromo.web06.model.Jogador"
%>
<html>
<head>
    <title>Listar Jogadores</title>
</head>
<body>
<h2>Jogadores</h2>
<table>
  <tr>
    <td>Nome do Jogador</td>
    <td>Apelido</td>
    <td>Posição</td>
    <td>Idade</td>
  </tr>
  <tr>
    <%
      JogadorDao dao = new JogadorDao();
      List<Jogador> lista = dao.listarJogadores();
      for (Jogador j : lista) {
    %>
    <td><%=j.getNome()%>
    </td>
    <td><%=j.getApelido()%>
    </td>
    <td><%=j.getPosicao()%>
    </td>
    <td><%=j.getIdade()%>
    </td>
  </tr>
  <% } %>
</table>
</body>
</html>
