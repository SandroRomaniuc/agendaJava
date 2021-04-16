<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,
br.com.caelum.dao.*,
br.com.caelum.modelo.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Contato</title>
</head>
<body>
	<table>
		<%
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
		%>
		<h2>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=contato.getDataNascimento().getTime()%></td>
		</tr>
		</h2>
		<%
}
%>
	</table>
</body>
</html>