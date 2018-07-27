<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div align="center">
<h1>학생정보</h1>
아이디 : ${student.id}<br>
이름 : ${student.name}<br>
비밀번호 :  ${student.password}<br>
이메일 :  ${student.email}<br>
등록일 : <fmt:formatDate value="${student.regdate}" pattern="yyyy-MM-dd HH:mm"/><br>
<a href ="modify?id=${student.id }">수정</a> &nbsp;&nbsp;
<a href="remove?id=${student.id }">삭제</a>
</div>