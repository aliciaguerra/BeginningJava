public class NumberCheck{
public static void main(String[] args)
{
int number=0;
number=1+(int)(99.*Math.random()); //Get a random integer between 1 & 100

if(number%2 == 0)   //Test if it is even
//It is even
System.out.println("You got an even number" + number);
else
//It is odd
System.out.println("You have got an odd number," + number);
}
}
