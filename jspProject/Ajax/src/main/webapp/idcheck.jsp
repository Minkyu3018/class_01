<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<% 
	String uid = request.getParameter("uid");
	

	if(uid !=null && uid.equals("test")) {
		// 아이디 존재 => 사용불가 => N
		out.print("N");
		
	} else if(uid != null && !uid.equals("test")) {
		out.print("Y");
	} else {
		out.print("사용할 수 없음!");
	}

%>