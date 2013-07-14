<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html><body>

	<c:forEach var="name" items="${names}">
		<h1>Hello World! ${name}! (JSP)</h1>
	</c:forEach>


</body></html>