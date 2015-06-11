//Calculate the radius of a circle
//which has an area of 100 square feet.
double radius=0.0;
double circleArea=100.0;
int feet=0;
int inches=0;
radius=Math.sqrt(circleArea/Math.PI); //Get the whole feet and nothing
feet=(int)Math.floor(radius);         //but the feet.
inches=(int)Math.round(12.0*(radius-feet));
System.out.println("The radius of a circle with area" +
                    circleArea + "square feet is \n" +
                    feet + "feet" + inches + "inches");
                    }
                    }
