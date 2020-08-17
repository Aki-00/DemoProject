<% 
 int number1= Integer.parseInt(request.getParameter("number1"));
 int number2= Integer.parseInt(request.getParameter("number2"));
 String button = request.getParameter("button");
 
 if(button.equalsIgnoreCase("+")){
	 out.print(number1 + number2);
 }else if(button.equalsIgnoreCase("-")){
	 out.print(number1 - number2);
 }else if(button.equalsIgnoreCase("*")){
	 out.print(number1 * number2);
 }else if(button.equalsIgnoreCase("/")){
	 out.print(number1 / number2);
 }else{
	 out.print("");
 }
%>
 