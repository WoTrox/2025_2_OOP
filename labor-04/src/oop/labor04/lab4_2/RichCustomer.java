package oop.labor04.lab4_2;

import java.util.ArrayList;

public class RichCustomer {
    private String firstName, lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    RichCustomer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void addAccount(BankAccount account) {
        for (BankAccount acc : this.accounts) {
            if (acc == null) {
                acc = account;
                break;
            }
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount acc : this.accounts) {
            if (acc != null && acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public int getNumAccounts() {
        int num = 0;
        for (BankAccount acc : this.accounts) {
            if (acc != null) {
                num++;
            }
        }
        return num;
    }

    public void closeAccount(String accountNumber) {
        for (BankAccount acc : this.accounts) {
            if (acc != null && acc.getAccountNumber().equals(accountNumber)) {
                acc = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName).append(":\n");
        for (BankAccount acc : this.accounts) {
            if (acc != null) {
                sb.append(acc).append("\n");
            }
        }
        return sb.toString();
    }
}
