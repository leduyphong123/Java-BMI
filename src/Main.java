import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float weight,height;

        Scanner input = new Scanner(System.in);
        System.out.print("nhap can nang dv kg ");
        weight = input.nextFloat();
        System.out.print("nhap chieu cao dv m ");
        height = input.nextFloat();
        checkBmi(weight/(height*height));

    }
    public static void checkBmi(float bmi){
        if(bmi<18.5){
            System.out.print("Underweight");
        }else if(bmi > 30.0){
            System.out.print("Obese");
        }else if(bmi <25.0){
            System.out.print("Normal");
        }else System.out.print("Overweight");
    }
}