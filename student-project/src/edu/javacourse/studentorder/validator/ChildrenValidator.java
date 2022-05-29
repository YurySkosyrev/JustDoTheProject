package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.wedding.StudentOrder;

public class ChildrenValidator {

    private String hostName;
    private String login;
    private String password;


    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }
}
