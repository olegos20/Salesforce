package ua.oleh.Services;
import java.util.Scanner;

public class Company {
    private static double ratePerHour;
    Scanner scanner;
    private static int workdays;
    private static String name;
    private static double budget;
    enum Employees{MANAGER, DEVELOPER, SCRUM_MASTER}
    Employees[] employees = Employees.values();
public void addEmployee(Employee employee){
employee.getSallary(ratePerHour,workdays);
        }
    public static void main(String[] args) {
        int chose;
        Employees employees;
        Company company = new Company();
        System.out.println("Input name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Input budget");
        budget = sc.nextDouble();
        System.out.println("Input ratePerHour");
        ratePerHour = sc.nextDouble();
        System.out.println("Input workdays");
        workdays = sc.nextInt();
        System.out.println("Chose employee type:");
        for (Employees s:Employees.values()
             ) {
            System.out.println(s.ordinal()+""+s);
        }
       chose = sc.nextInt();


    }
}
}