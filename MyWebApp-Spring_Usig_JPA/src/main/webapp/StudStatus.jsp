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
        padding: 4px;   
        background-color: lightblue;  
    }   
</style>
</head>
<body>
<center> <h1> Student Details </h1> </center>  
 <center> <h3> Application Id : ${uid} </h3> </center> 
    <form action="veriUser">  
        <div class="container">   
           <center> <h3>${fname} Your Application Is ${status}</h3> </center>
            
        </div>   
</form>
<form >  
        <div class="container">   
           <a href="/default.jsp"><h2>Home Page</h2></a>
        </div>   
</form>
</body>
</html>