<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${empty MEMOS}">
	<h3>메모없음</h3>
</c:if>

<c:if test="${not empty MEMOS}">
	<c:forEach var="memoVO" items="${MEMOS}">
		<div>
			<div>${memoVO.m_subject}</div>
			<div>${memoVO.m_memo}</div>
		</div>
	</c:forEach>
</c:if>