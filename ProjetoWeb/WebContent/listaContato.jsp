<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import= "Repositorio.*" %>
<%@ page import= "Negocio.*" %>
<%@ page import= "java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Lista de Contatos</title>
</head>
<body>
<table>
<%
   ContatoDAO dao = new ContatoDAO();
   List<Contato> contatos = dao.getLista();
   
   for(Contato contato : contatos){
	   
 
%>
<tr>
<td><%= contato.getNome() %></td>
<td><%= contato.getEmail() %></td>
<td><%= contato.getIdade() %></td>
</tr>
<% } %>
</table>
</body>
</html>