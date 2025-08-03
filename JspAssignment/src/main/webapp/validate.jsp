<%@ page import="java.io.*" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("sathvik".equals(username) && "123456".equals(password)) {
%>
        <h2>Login Successful!</h2>
        <p>Welcome, <b><%= username %></b></p>
<%
    } else {
%>
        <h2>Login Failed!</h2>
        <p>Invalid username or password.</p>
        <a href="login.jsp">Try Again</a>
<%
    }
%>