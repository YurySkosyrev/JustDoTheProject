package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }
}
