package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height;
        System.out.print("Enter weight in pounds: ");
        weight = scan.nextDouble();
        System.out.print("Enter height in inches: ");
        height = scan.nextDouble();
        weight *= 0.45359237;
        height *= 0.0254;
        BMI test = new BMI(weight, height);
        System.out.println("BMI is " + test.getBMI());
        System.out.println(test.BMIInterpretation(test.getBMI()));
        scan.close();
    }

    public static class BMI {
        private double weight, height;

        public BMI(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }

        public double getWeight() {
            return this.weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return this.height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getBMI() {
            double bmiValue;
            bmiValue = weight / (Math.pow(height, 2));
            return bmiValue;
        }

        public String BMIInterpretation(double BMI) {
            if (BMI < 18.5)
                return "Underweight";
            else if (BMI < 25)
                return "Normal";
            else if (BMI < 30)
                return "Overweight";
            else
                return "Obese";

        }
    }
}