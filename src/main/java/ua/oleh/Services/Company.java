package ua.oleh.Services;
import java.util.Scanner;

public class Company{
    double sallary;
    Employee employee = new Employee();
    private Scanner scanner = new Scanner(System.in);
     static String name;
    static double budget;
    Employees employees_type;
    enum Employees{
        Manager, Developer, Scrum_Master}
    Company(){
        Company company;
        Employees[] employeeses = Employees.values();
        int chose;
        System.out.println("Input budget");
        Scanner sc = new Scanner(System.in);
        budget = sc.nextDouble();
        System.out.println("Chose employee type and type it id:");
        for (Employees s:employeeses
        ) {
            System.out.println(s.ordinal()+" "+s);
        }
        chose = sc.nextInt();
        switch (chose){
            case  0:company= new Company(name,budget,Employees.Manager);
                System.out.println("Employee type is "+company.employees_type);
                break;
            case 1:company= new Company(name,budget,Employees.Developer);
                System.out.println("Employee type is "+company.employees_type);
                break;
            case 2:company= new Company(name,budget,Employees.Scrum_Master);
                System.out.println("Employee type is "+company.employees_type);
                break;
        }
    }
   Company(String name, double budget, Employees employees){
        Company.name = name;
        Company.budget = budget;
        employees_type= employees;
    }
    public void addEmployee(Employees employees){ String name;
    int workdays;
    double ratePerHour;
    System.out.println("Input name");
    name = scanner.nextLine();
    System.out.println("Input ratePerHour");
    ratePerHour = scanner.nextDouble();
    System.out.println("Input workdays");
    workdays = scanner.nextInt();
    sallary = employee.getSallary(ratePerHour,workdays);
    System.out.println("Employee name: "+name+"\nsalary: "+sallary+"$");
        }
    public static void main(String[] args) {
        SalaryService salaryService = new SalaryService();
Company company = new Company(name,budget,Employees.Developer);
company.addEmployee(Employees.Scrum_Master);
salaryService.pay(company);
    }
}
