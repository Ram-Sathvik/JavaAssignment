<jsp:useBean id="product" class="models.Product" scope="request" />
<jsp:setProperty name="product" property="*" />

<!DOCTYPE html>
<html>
<head><title>Product Display</title></head>
<body>
    <h2>Product Details</h2>
    <p><b>Product ID:</b> <jsp:getProperty name="product" property="id" /></p>
    <p><b>Name:</b> <jsp:getProperty name="product" property="name" /></p>
    <p><b>Price:</b> <jsp:getProperty name="product" property="price" /></p>
    <p><b>Quantity:</b> <jsp:getProperty name="product" property="quantity" /></p>
</body>
</html>