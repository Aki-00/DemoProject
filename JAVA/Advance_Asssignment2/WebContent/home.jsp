<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
header{
background-color: gray;
height: 20%;
}
.searchBox{
display:flex;
position:right;
}
nav{
position: center;
}
</style>
</head>
<body>
<header>
<h1>My Site</h1>
<div class="searchBox">
Search
<input type="text" name="searchBox" placehoder="Enter keyword">
</div>
</header>

<nav>
Home | Product List | My Account Info | Login
</nav>
<div>
	<h2> Home Page</h2>
	<p> This is demo Simple Web application using jsp, servlet, Jdbc.</p>
	<p><b>It includes the following function</b>
		 Click button bellow to use function<p>
	<ul>
		<form action="login" method="get">
		<li> <input type="submit" value="Login"></li>
		<li> <input type="submit" value="Storing user information in cookies"> </li>
		<li> <input type="submit" value="Create Product"></li>
		<li> <input type="submit" value="Edit product"></li>
		<li><input type="submit" value="Delete product"> </li>
		</form>
	</ul>
	
</div>
</body>
</html>