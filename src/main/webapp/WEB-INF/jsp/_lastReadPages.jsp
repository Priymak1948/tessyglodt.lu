<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="fitem">
	<h4>Als läscht gelies</h4>
	<ul>
		<c:forEach items="${lastReadPages}" var="page">
			<li><a href="<c:url value='/page' />/${page.name}">${page.title}</a></li>
		</c:forEach>
	</ul>
</div>