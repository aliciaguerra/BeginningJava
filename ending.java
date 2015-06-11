//Code to delay ending the program.
System.out.println("("press Enter the exit)");
try
{
System.in.read(); //Read some input from the keyboard
}
catch(IOException e) //Catch the input expression
{
return; //and just return
}
