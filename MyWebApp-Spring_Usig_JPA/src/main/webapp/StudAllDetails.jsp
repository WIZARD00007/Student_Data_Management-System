<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
    integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
    crossorigin="anonymous">
</head>
<body>
<div class="container my-2" align="center">
 
<h3>Employee List</h3>

    <table style="width:80%" border="1"
           class = "table table-striped table-responsive-md">
    <thead>
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Action</th>
  </tr>
  </thead>
  <tbody>
  <tr th:each="stud:${students}">
        <td th:text="${stud.firstName}"></td>
        <td th:text="${stud.middleName}"></td>
        <td> <a th:href="@{/showFormForUpdate/{id}(id=${employee.id})}"
                class="btn btn-primary">Update</a>
                <a th:href="@{/deleteEmployee/{id}(id=${employee.id})}"
                class="btn btn-danger">Delete</a>
    </td>
  </tr>
  </tbody>
</table>
</div>
</body>
</html>