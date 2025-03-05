package oop.labor03;

public class RichCustomer {
    private static final int MAX_ACCOUNTS = 10;

    private String firstName, lastName;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

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
