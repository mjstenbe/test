<%@page import="java.sql.*"%>
<%@page import="DB.DBManager"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Connecting to database...</p>

	<table border="1">

		<%
			String title = request.getParameter("title");
			String author = request.getParameter("author");

			System.out.println(title);
			System.out.println(author);

			// Start the Java Code

			DBManager db = new DBManager();
			Connection conn = db.getConnection();

			if (conn == null)
				System.out.println("Connection failed!");
			else {
				System.out.println("Success!");

				String SQL = "SELECT * FROM KIRJA WHERE kirjan_nimi LIKE '%" + title + "%' AND tekijä LIKE '%" + author	+ "%'";

				System.out.println(SQL);
				ResultSet rs = db.runQuery(conn, SQL);

				// Loop through the results

				while (rs.next()) {
					System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

					String nimi = rs.getString(1);
					int vuosi = Integer.parseInt(rs.getString(3));
					String tekija = rs.getString(2);

					// We could print the data the Java way
					// out.println("<tr><td>" + nimi + "</td><td>" + tekija + "</td><td>" + vuosi + "</td></tr>");

					// End of Java Code, start of HTML code
		%>

		<!--  However we can also use shorthand tag for printing variables as below -->

		<tr>
			<td><%=nimi%></td>
			<td><%=tekija%></td>
			<td><%=vuosi%></td>

		</tr>

		<%
			// Notice, that you need to complete the Java code blocks accordingly
				} // while
			} // else
		%>

	</table>
</body>
</html>