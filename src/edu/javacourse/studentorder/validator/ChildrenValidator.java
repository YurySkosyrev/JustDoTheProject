package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    private String hostName;
    private String login;
    private String password;


    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
}
