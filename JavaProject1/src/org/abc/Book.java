package org.abc;



public class Book {

    String bookName;
    String authorName;
    float price;

    boolean hasBorrowed;

    String dateOfPurchase;

    String dateOfBorrow;

    String returnFromBorrower;

    String boorowerName;


    public Book() {

    }

    public Book(String bookName,String authorname,float price){

        this.bookName = bookName;
        this.authorName = authorname;
        this.price = price;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;


    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isHasBorrowed() {
        return hasBorrowed;
    }

    public void setHasBorrowed(boolean hasBorrowed) {
        this.hasBorrowed = hasBorrowed;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(String dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }

    public String getReturnFromBorrower() {
        return returnFromBorrower;
    }

    public void setReturnFromBorrower(String returnFromBorrower) {
        this.returnFromBorrower = returnFromBorrower;
    }

    public String getBoorowerName() {
        return boorowerName;
    }

    public void setBoorowerName(String boorowerName) {
        this.boorowerName = boorowerName;
    }

    public boolean setAuthorNameAndPrice(String name, float price) {
        this.authorName = name;
        this.price = price + 10;
        return true;
    }
}
