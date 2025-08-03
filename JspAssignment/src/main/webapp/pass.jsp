<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head><title>Result</title></head>
<body>
    <h2>Congratulations!</h2>
    <p>${requestScope.name}, you passed with ${requestScope.marks} marks.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>