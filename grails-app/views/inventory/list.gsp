<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.06.2019
  Time: 12:55
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of all products</title>
</head>

<body>
<table border="1">
    <g:each in="${allProducts}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.sku}</td>
        </tr>
    </g:each>
</table>
</body>
</html>