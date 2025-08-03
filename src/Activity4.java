import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float hr, hw, gw, sss, net, total;
        String name;

        System.out.print("Enter employee name:");
        name = scanner.nextLine();
        System.out.print("Enter hourly rate: ");
        hr = scanner.nextFloat();
        System.out.print("Enter total hours worked this week: ");
        total = scanner.nextFloat();

        gw = hr * total;
        sss = gw * 10 / 100;
        net = gw - sss;

        System.out.print("\n----Wage Summary----\n");
        System.out.println("Employee: " + name);
        System.out.println("Hourly Rate: " + hr);
        System.out.println("Total Hours Worked: " + total);
        System.out.println("Gross Wage: " + gw);
        System.out.println("SSS Deduction: " + sss);
        System.out.print("\n------------------------\n");
        System.out.println("Net Wage: " + net);



    }
}
