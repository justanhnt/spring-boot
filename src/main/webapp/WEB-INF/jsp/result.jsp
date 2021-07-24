<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <ul>
        <c:forEach items="${results}" var="result">
            <li>${result}</li>
        </c:forEach>
    </ul>
</html>