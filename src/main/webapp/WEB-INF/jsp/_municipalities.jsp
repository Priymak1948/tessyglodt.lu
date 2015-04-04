<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h4>Lëscht no Gemeng</h4>
<ul>
	<c:forEach items="${municipalities}" var="municipality">
		<li><a href="<c:url value='/municipality' />/${municipality.id}">${municipality.name}</a></li>
	</c:forEach>
</ul>
