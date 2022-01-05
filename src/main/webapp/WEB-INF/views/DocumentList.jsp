<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문서접수대장</title>

<script src="/js/jquery-3.6.0.min.js" type="text/javascript"></script>
<script src="/js/DocumentList.js" type="text/javascript"></script>

</head>
<body>

<div id="contents">
	<form name="listForm" method="post">
	   
	   <div id="table">
				
       </div> <!-- table -->
       
       <div>
       	   <br>
	       <button id="btn_excelDownload"> Download </button>
       </div>
       
	</form>
</div>


</body>
</html>