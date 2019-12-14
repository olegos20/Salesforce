package ua.oleh.Services;

public class Employee {
    public double getSallary(double ratePerHour, int workdays){
        return ratePerHour * workdays * 8;
    }
}
