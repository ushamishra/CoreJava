package org.abc;

public class Student {


    String name;
    int rollNumber;
    int std;
    char section;
    boolean iFemale;
    float score;


    public void setScore(float userScore){
        this.score = userScore;
    }

    float getScore(){

        return this.score;
    }



    public static void main(String args[]){

        Student st1 = new Student();
        st1.name= "Prasuna";
        st1.rollNumber = 1;

        st1.setScore(80);

        Student st2 = new Student();
        st2.name= "Mrudula";
        st2.rollNumber = 2;

        st2.setScore(90);

        Student st3 = new Student();
        st3.name= "Thomas";
        st3.rollNumber = 3;

        st3.setScore(85);




        System.out.println("All my students are "+ st1.name + " "+st2.name+"  "+st3.name);


        System.out.println("All my students score are  "+ st1.getScore() + " "+st2.getScore()+"  "+st3.getScore());



    }

}
