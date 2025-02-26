package oop.labor02;

import oop.labor02.bank.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Ex. 1
        BankAccount account1 = new BankAccount("OTP00001");

        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        account1.deposit(1000);

        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        if (!account1.withdraw(500)){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        if (!account1.withdraw(1000)){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");

        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());

        account1.deposit(2000);

        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());


        // Ex. 2
        Rectangle[] rectangles = new Rectangle[10];

        Random rand = new Random();
        //generate positive random numbers less than a bound
        double rectanglesArea = 0;
        for (int i = 0; i < 10; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);

            rectanglesArea += rectangles[i].area();

            System.out.println(rectangles[i].getLength() + " " + rectangles[i].getWidth() + " " + rectangles[i].area() + " " + rectangles[i].perimeter());
        }
        System.out.println("Total area: " + rectanglesArea);


        // Ex. 3
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);

    }
}
