package org.abc;

public class SchoolBankAccount {

    private  String accountNumber;
    private String userName;
    private String pwd;
    private int balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getBalance() {

        if(this.userName.equalsIgnoreCase("Thomas") && this.pwd.equals("abc123"))
        return balance;
        else
            return -1;
    }

    public void setBalance(int balance, boolean isNewAccount) {

        if(isNewAccount)
        this.balance = balance + 200;
        else
            this.balance = balance;
    }
}
