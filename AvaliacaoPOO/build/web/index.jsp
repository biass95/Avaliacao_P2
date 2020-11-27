<%-- 
    Document   : index
    Created on : 5 de out de 2020, 17:37:07
    Author     : biancasobral
--%>

<%@page import="br.edu.fatec.poo.avaliacao.Disciplinas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio - P1</title>
    
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <h1>Inicio</h1>
        <div>Nome: Bianca Sobral</div>
        <div>RA: (12345)</div>
        <div>Qtd de Disciplinas Matriculadas: <%= Disciplinas.getList().size() %></div>
        
    </body>
</html>
