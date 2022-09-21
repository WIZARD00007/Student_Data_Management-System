<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Login Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>
</head>
<body>
<center> <h1>Student Data Management System</h1> </center>   
    <form >  
        <div class="container">   
           <a href="/admin"> <h2>Admin login portal</h2></a>
        </div>   
</form>
    <form >  
        <div class="container">   
           <a href="/Student"><h2>Student registration portal</h2></a>
        </div>   
</form>
<form >  
        <div class="container">   
           <a href="/veriAppli"><h2>Check Application status</h2></a>
        </div>   
</form>
<form >  
        <div class="container">   
           <a href="/getData.jsp"><h2>Check Your Application</h2></a>
        </div>   
</form>
</body>
</html>