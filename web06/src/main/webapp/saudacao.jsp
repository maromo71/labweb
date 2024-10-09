
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Página de Saudação</title>
</head>
<body>
    <%--
        Código scriptlet java abaixo
     --%>
    <%
      int x = 10;
      String produto = "Comprei " + x + " bolas hoje";
    %>
    <h1>Página JSP</h1>
    <h2>Produto comprado</h2>
    <p>
      <%=produto%>
    </p>
</body>
</html>
