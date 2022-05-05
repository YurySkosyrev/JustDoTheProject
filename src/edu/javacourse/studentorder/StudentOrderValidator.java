package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }


    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {

        StudentOrder[] soArray = readStudentOrders();

        for (int i = 0; i < soArray.length; i++){
            checkOneOrder(soArray[i]);
        }

    }

    private static StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for(int i = 0; i < soArray.length; i++){
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        StudentOrder so = new StudentOrder();
        return soArray;
    }

    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is running");
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        System.out.println("Mail is sending");
        mailSender.sendMail(so);
    }
}
