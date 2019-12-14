package ua.oleh.Services;

import java.util.Scanner;

public class Products {
    Year month;
    String name;
    Products(){//for getting methods and fields of class
    }
    enum Year{
        January, February, March, April, May, June, July, August, September, October, November, December}
Products(String name, double price, Year current_month){
        this.name = name;
    month=current_month;
}
public String getByMonthAndProduct(Products products){
        return products.month+" "+products.name;

}
    public static void main(String[] args) {
        String name;
        Products products;
        Products products1 = new Products();
        int chose;
        Year[] list = Year.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of product");
        name = scanner.nextLine();
        System.out.println("Change month of product and typi it id");
        for (Year s:list
        ) {
            System.out.println(s.ordinal()+" "+s);
        }
        chose = scanner.nextInt();
        switch (chose){
            case 0: products = new Products(name,233,Year.April);//we dont have a base with data and we put a randomed data and choser in switch
                System.out.println(products1.getByMonthAndProduct(products));
                break;

        }


    }
}
