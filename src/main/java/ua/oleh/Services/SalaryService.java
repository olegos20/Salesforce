package ua.oleh.Services;

public class SalaryService  {
    Employee employee = new Employee();
Company company = new Company();
    public void pay(Company company){
        double budget = company.budget;
        if (company.sallary>budget){
            System.out.println("Cant pay sallary, budget is so small to pay:(");
        }else {
            if (company.employee.equals("Developer")){
                company.sallary+=1000;
                budget-=company.sallary;
                System.out.println("Paid succeful with bonus for developers :)");
            }
            else
            budget-=company.sallary;
            System.out.println("Paid succeful");}
    }
    }

