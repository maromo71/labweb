
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="com.example.web07.model.Imc"
%>
<html>
<head>
    <title>Cálculo do IMC</title>
</head>
<body>
    <%
        double peso = Double.parseDouble(request.getParameter("peso"));
        double alt = Double.parseDouble(request.getParameter("altura"));
        Imc imc = new Imc(peso, alt);
        double result = imc.getResultado();
        request.setAttribute("resultado_imc", result);
    %>
    <h1>Calculando o IMC</h1>
    <h2>Resultados:</h2>
    <p>
        De acordo com seu peso: ${param.peso}
        e sua altura ${param.altura}, seu imc é
    </p>
    <p>
        <strong>
            ${resultado_imc}
        </strong>
    </p>
</body>
</html>
