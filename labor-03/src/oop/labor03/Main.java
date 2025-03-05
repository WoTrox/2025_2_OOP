package oop.labor03;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1);

        customer1.setAccount(new BankAccount("BT00001"));

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);


        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("BT00002"));
        System.out.println(customer2);

        customer1.marry(customer2);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
