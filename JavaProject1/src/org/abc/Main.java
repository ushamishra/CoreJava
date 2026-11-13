package org.abc;

public class Main {

    public static void main(String args[]){



        Book book = new Book();

        book.setBookName("Will Power");
        book.setAuthorName("Ronal Steffen");
        book.setPrice(20.45f);
        book.setHasBorrowed(false);

        Book book1 = new Book("I can","Rhoit",34.45f);

        SchoolBankAccount bankAccount = new SchoolBankAccount();

        bankAccount.setAccountNumber(args[0]);
        bankAccount.setUserName(args[1]);
        bankAccount.setPwd(args[2]);

        String isNewAccount = args[4];

        boolean isNewAccountBoolean = false;

        if(isNewAccount.equalsIgnoreCase("yes"))
            isNewAccountBoolean = true;

       int balance =  Integer.parseInt(args[3]);



        bankAccount.setBalance(balance,isNewAccountBoolean);

        if(bankAccount.getBalance()> 0)
        System.out.println(bankAccount.getBalance());
        else
            System.out.println("You are not authorized to see the balance!");

//        String bal  = bankAccount.getBalance();




        Canteen canteen = new Canteen();
        canteen.setFoods();

        Library libarary = new Library();

        Book books[] = libarary.books;

        Playground playGround = new Playground();
        Playground.Stadium stadium = playGround.getStadum();


    }
}
