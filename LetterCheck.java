public class LetterCheck 
{
public static void main(String[] args)
{
char symbol='A';
symbol=(char)(127.0*Math.random()); //Generate a random character
if(symbol>='A') //Is it A or greater?
{
if(symbol<= 'Z') //yes, so is it Z or less?
//then it is a capital letter
System.out.println("You have the small letter" + symbol);
else //it is not z or less
if(symbol>='a') //so is it a or greater?
if(symbol<='z') //yes, so is it z or less?
//then it is a small letter
System.out.println("You have a small letter" + symbol);
else //it is not less than z

System.out.println(
