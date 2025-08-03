<%@ page import="java.util.*, models.Student" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head><title>Student List</title></head>
<body>
    <h2>All Students</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Email</th></tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student s : students) {
        %>
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getName() %></td>
                <td><%= s.getEmail() %></td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
