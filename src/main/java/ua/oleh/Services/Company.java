package ua.oleh.Services;
import java.util.Scanner;

public class Company {

    private static double ratePerHour;
    private Scanner scanner = new Scanner(System.in);
    private static int workdays;
    private static String name;
    private static double budget;
    Employees employees_type;
    enum Employees{
        Manager, Developer, Scrum_Master}
    Company(){
        Company company;
        SalaryService salaryService = new SalaryService();
        Employees[] employeeses = Employees.values();
        int chose;
        Employee employee = new Employee();
        System.out.println("Input name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Input company budget");
        budget = sc.nextDouble();
        System.out.println("Chose employee type and type it id:");
        for (Employees s:employeeses
        ) {
            System.out.println(s.ordinal()+" "+s);
        }
        chose = sc.nextInt();
        switch (chose){
            case  0:company= new Company(name,budget,Employees.Manager);
                System.out.println("Employee name is:"+name+"\n"+"Employee type is "+company.employees_type);
                salaryService.pay(company);
                break;
            case 1:company= new Company(name,budget,Employees.Developer);
                System.out.println("Employee name is:"+name+"\n"+"Employee type is "+company.employees_type);
                break;
            case 2:company= new Company(name,budget,Employees.Scrum_Master);
                System.out.println("Employee name is:"+name+"\n"+"Employee type is "+company.employees_type);
                break;
        }
    }
   Company(String name, double budget, Employees employees){
        Company.name = name;
        Company.budget = budget;
        employees_type= employees;
    }
    public void addEmployee(Employees employees){ String name;
    int chose;
    Employee employee = new Employee();
    int workdays;
    double ratePerHour;
    System.out.println("Input name");
    name = scanner.nextLine();
    System.out.println("Input ratePerHour");
    ratePerHour = scanner.nextDouble();
    System.out.println("Input workdays");
    workdays = scanner.nextInt();
    System.out.println("Employee salary: "+employee.getSallary(ratePerHour,workdays)+"$");
        }
    public static void main(String[] args) {
Company company = new Company();
company.addEmployee(Employees.Scrum_Master);

    }
}
