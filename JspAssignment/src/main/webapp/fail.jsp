<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head><title>Result</title></head>
<body>
    <h2>Sorry!</h2>
    <p>${requestScope.name}, you failed with ${requestScope.marks} marks.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>