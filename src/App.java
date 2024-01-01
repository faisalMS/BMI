import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println("Hello Welcome To The BMI Calculator ");

        Scanner s = new Scanner(System.in);
        double theHeight = s.nextDouble();
        int theWeight = s.nextInt();
        double theResult = theWeight / theWeight;
        
        System.out.println("Please Enter Your Height : " + theHeight);

    }
}
