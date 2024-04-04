package TimBachulkaChallenges;

public class Account {

    private int account_number;
    private int account_balance;
    private String customerName;
    private String email;

    private int phoneNumber;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void DepositFunds(int funds) {
        account_balance += funds;
    }


    void WithDrawFrunds() {
        getAccount_number();

        int balance = getAccount_balance();
        if (balance == 0 || balance == -1) {
            System.out.println("You cannot withdraw");
        } else {
            System.out.println("You have withdrowan");
        }

    }
}



