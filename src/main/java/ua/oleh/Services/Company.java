package ua.oleh.Services;

import java.util.Scanner;

public class Company {
    private static String name;
    private static double budget;
    private static Employee employee;
    SalaryService salaryService;
    enum Employees{MANAGER, DEVELOPER, SCRUM_MASTER}
Company(String name, double budget, Employee employee){
        this.name = name;
        this.budget = budget;
        this.employee = employee;
        Employees[] employees = Employees.values();


}
    public static void main(String[] args) {
        double ratePerHour;
        int workdays;
        System.out.println("Input name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Input budget");
        budget = sc.nextDouble();
        System.out.println("Input ratePerHour");
        ratePerHour = sc.nextDouble();
        System.out.println("Input workdays");
        workdays = sc.nextInt();
        Company company = new Company(name,budget,employee);

    }
}
