
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="com.example.web07.model.Moeda"
%>
<html>
<head>
    <title>Conversao de Moedas</title>
</head>
<body>
    <%
        String moedaAtual = "REAL";
        String moedaConvertida = request.getParameter("moeda_convertida");
        double valor = Double.parseDouble(request.getParameter("valor"));
        Moeda moeda = new Moeda(valor, moedaAtual, moedaConvertida);
        double valorConvertido = moeda.getValorConvertido();
        request.setAttribute("valor_convertido", valorConvertido);
    %>
    <h1>Conversao de Reais para ${param.moeda_convertida}</h1>
    <p>Valor convertido ${valor_convertido}</p>
</body>
</html>
