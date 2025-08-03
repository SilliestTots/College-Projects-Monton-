import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float sci, his, math, soc, arts;
        float total, percentage;
        String name;

        System.out.print("Enter your complete name: ");
        name = input.nextLine();

        System.out.print("Enter marks in Science: ");
        sci = input.nextFloat();

        System.out.print("Enter marks in History: ");
        his = input.nextFloat();

        System.out.print("Enter marks in math: ");
        math = input.nextFloat();

        System.out.print("Enter marks in Soc: ");
        soc = input.nextFloat();

        System.out.print("Enter marks in Arts: ");
        arts = input.nextFloat();

        total = sci + his + math + soc + arts;
        percentage = (total / 500) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage >= 91 && percentage <= 100) {
            System.out.print("Remarks: Excellent\n");
            System.out.println("Congrats, " + name + "! you passed!");
        }
        else if(percentage >= 86 && percentage < 91) {
            System.out.print("Remarks: Very Good\n");
            System.out.println("Congrats, " + name + "! you passed!");
        }
        else if(percentage >= 81 && percentage < 86) {
            System.out.print("Remarks: Good\n");
            System.out.println("Congrats, " + name + "! you passed!");
        }
        else if(percentage >= 76 && percentage < 81) {
            System.out.print("Remarks: Fair\n");
            System.out.println("Congrats, " + name + "! you passed!");
        }
        else if (percentage >= 71 && percentage < 76) {
            System.out.print("Remarks: Poor\n");
            System.out.println("Congrats, " + name + "! you passed!");
        }
        else if (percentage < 71) {
            System.out.print("Remarks: Fail\n");
            System.out.println("Sorry, " + name + "! you failed!");
        } 
        else {
            System.out.println("Invalid percentage value.");
        }








    }
}
