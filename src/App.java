import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        System.out.println("Hello Welcome To The BMI Calculator ");

        Scanner s = new Scanner(System.in);

        double theHeight = s.nextDouble();
        System.out.println("Please Enter Your Height : " + theHeight);

        int theWeight = s.nextInt();
        System.out.println("Please Enter Your Weight : " + theWeight);

        double theResult = theWeight/ Math.pow(theHeight, 2);
        if (theResult < 18.5) {
            System.out.println("Your BMI Is " + theResult + " , And Based On The Calculated BMI You Have ( Underweight ) ");
        } else if ((theResult) >= 18.5 || (theResult) <= 24.9) {
            System.out.println("Your BMI Is " + theResult + " , And Based On The Calculated BMI You Have ( Normal Weigh )");
        } else if ((theResult) >= 25 || (theResult) <= 29.9) {
            System.out.println("Your BMI Is " + theResult + " , And Based On The Calculated BMI You Have (Overweight )");
        } else if (theResult <= 30) {
            System.out.println("Your BMI Is " + theResult + " , And Based On The Calculated BMI You Have ( Obese )");
        }
    }  
}