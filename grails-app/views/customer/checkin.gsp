<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Kiosk</title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">
    <script src="js/respond.js"></script>
</head>

<body>
    <g:form url="[resource:customer, action:'customerLookup']">
        <g:render template="kioskForm" />
    </g:form>

    <g:javascript library="jquery"/>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>