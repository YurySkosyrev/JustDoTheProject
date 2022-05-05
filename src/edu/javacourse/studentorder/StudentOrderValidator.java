package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    private static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null)
                break;

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success)
                continue;
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    private static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }


    private static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv = new CityRegisterValidator();
        AnswerCityRegister ans = crv.checkCityRegister(so);
        return ans;
    }

    private static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    private static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    private static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    private static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
