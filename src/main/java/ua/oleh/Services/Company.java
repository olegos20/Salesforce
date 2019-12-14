package ua.oleh.Services;
import java.util.Scanner;

public class Company {
    private static double ratePerHour;
    private Scanner scanner;
    private static int workdays;
    private static String name;
    private static double budget;
    Employees employees_type;
    enum Employees{
        Manager, Developer, Scrum_Master}
    public void getSallaryService(){
        SalaryService salaryService = new SalaryService();
        salaryService.pay();
    }
   Company(String name, double budget, Employees employees){
        Company.name = name;
        Company.budget = budget;
        employees_type= employees;
    }
    public void addEmployee(Employee employee){
    int chose;
    Company company;
    chose = scanner.nextInt();
        }
    public static void main(String[] args) {
        Company company;
        Employees[] employeeses = Employees.values();
        int chose;
        Employee employee = new Employee();
        System.out.println("Input name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Input budget");
        budget = sc.nextDouble();
        System.out.println("Input ratePerHour");
        ratePerHour = sc.nextDouble();
        System.out.println("Input workdays");
        workdays = sc.nextInt();
        System.out.println("Employee salary: "+employee.getSallary(ratePerHour,workdays)+"$");
        System.out.println("Chose employee type and type it id:");

        for (Employees s:employeeses
        ) {
            System.out.println(s.ordinal()+" "+s);
        }
        chose = sc.nextInt();
        switch (chose){
            case  0:company= new Company(name,budget,Employees.Developer);
                System.out.println("Employee name is:"+name+"\n Budget for Paids: "+budget+"$\n"+"Employee type is "+company.employees_type);
                break;
            case 1:company= new Company(name,budget,Employees.Manager);
                System.out.println("Employee name is:"+name+"\n Budget for Paids: "+budget+"$\n"+"Employee type is "+company.employees_type);
                break;
            case 2:company= new Company(name,budget,Employees.Scrum_Master);
                System.out.println("Employee name is:"+name+"\n Budget for Paids: "+budget+"$\n"+"Employee type is "+company.employees_type);
                break;
        }
    }
}
