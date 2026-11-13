package org.abc;



public class Department {

    String departmentName;
    int noOfStaffs;

    TeachingStaff teachingStaffs[] = new TeachingStaff[2];

    NonteachingStaff nonteachingStaffs[]  = new NonteachingStaff[3];

    private class ExamSection {

        String result;
        Student student ;

        void setStudent(Student st){

            this.student = st;

        }

        void setResult(String result){
            this.result = result;
        }
    }

    public void setExamResult(Student st,String result, String adminUser, String adminpwd){

        if(adminUser.equalsIgnoreCase("Prasuna") && adminpwd.equals("xyz123")){
            ExamSection exam = new ExamSection();
            exam.setStudent(st);
            exam.setResult(result);

        }

    }




}



