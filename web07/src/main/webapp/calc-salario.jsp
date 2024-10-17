<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="com.example.web07.model.FolhaPagamento"
%>
<html>
<head>
    <title>Folha de Pagamento</title>
</head>
<body>
    <%
        double salarioBruto = Double.parseDouble(request.getParameter("salario_bruto"));
        double descontoInss = Double.parseDouble(request.getParameter("desconto_inss"));
        double descontoIr = Double.parseDouble(request.getParameter("desconto_ir"));
        FolhaPagamento fp = new FolhaPagamento(salarioBruto,
                descontoInss, descontoIr);
        double salarioLiquido = fp.getSalarioLiquido();
        request.setAttribute("salario_liquido", salarioLiquido);
    %>
    <h1>Cálculo do Salário Líquido</h1>
    <h3>Salário Bruto: ${param.salario_bruto} </h3>
    <h3>Desconto INSS: ${param.desconto_inss}</h3>
    <h3>Desconto IR: ${param.desconto_ir} </h3>
    <h2>Salário Líquido: ${salario_liquido}</h2>
</body>
</html>
