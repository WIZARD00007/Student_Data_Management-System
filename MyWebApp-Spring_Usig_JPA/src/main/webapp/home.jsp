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
     .container2 {   
        padding: 4px;   
        background-color: lightyellow;  
    }
</style>
</head>
<body>
<div class="container2"> <center> <h1> Welcome Admin</h1> </center>  </div> 
<center> <h1>Fetch Student Details</h1> </center> 
    <form action="veriStudent">  
        <div class="container">   
            <label>Student Application Id :</label>   
            <input type="text" placeholder="Enter ID" name="id" required>  
            <button type="submit">Submit</button>   
        </div>   
</form>

<center> <h1>Approve Student</h1> </center> 
    <form action="admin/update">  
        <div class="container">   
            <label>Student Application Id :</label>   
            <input type="text" placeholder="Enter ID" name="id" required>  
            <button type="submit">Approve</button>   
        </div>   
</form>
<center> <h1>Reject Student</h1> </center> 
    <form action="admin/reject">  
        <div class="container">   
            <label>Student Application Id :</label>   
            <input type="text" placeholder="Enter ID" name="id" required>  
            <button type="submit">Reject</button>   
        </div>   
</form>
<center> <h1>Fetch All Students Details</h1> </center> 
    <form action="veriApp">  
        <div class="container">   
            <button type="submit">Confirm</button>   
        </div>   
</form>
<center> <h1>Delete Application</h1> </center> 
    <form action="admin/delete">  
        <div class="container">   
            <label>Student Application Id :</label>   
            <input type="text" placeholder="Enter ID" name="id" required>  
            <button type="submit">Confirm</button>   
        </div>   
</form>
</body>
</html>