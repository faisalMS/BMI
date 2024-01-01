import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println("Hello Welcome To The BMI Calculator ");

        Scanner s = new Scanner(System.in);
        double theHeight = s.nextDouble();
        System.out.println("Please Enter Your Height : " + theHeight);

        int theWeight = s.nextInt();
        System.out.println("Please Enter Your Weight : " + theWeight);

        double theResult = theWeight / theWeight;
    }
}
