<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<a href="/addpage">Add user</a>
<c:forEach items="${users}" var="u">
<p>${u.name}</p>
    <a href="/deleteuser/${u.id}" >delete user</a>
    <a href="/updateuser/${u.id}">update user</a>
</c:forEach>
</body>
</html>