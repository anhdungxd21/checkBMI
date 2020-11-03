import java.util.Scanner;

public class CountBMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter you height: ");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("Your BMI: %f\n",bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi >=18.5 && bmi < 25.0) {
            System.out.println("Normal");
        }else if(bmi >= 25 && bmi < 30.0) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
