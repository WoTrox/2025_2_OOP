package oop.labor03;

public class Customer {
    private String firstName, lastName;
    private BankAccount account;

    Customer(String firstName, String lastName) {
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

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    void closeAccount() {
        account = null;
    }

    void marry(Customer customer) {
        customer.setLastName(this.lastName);
        this.account.deposit(customer.getAccount().getBalance());
        customer.closeAccount();
        customer.setAccount(this.account);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + ((account == null) ? "no account" : account.getAccountNumber());
    }
}
