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
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    private static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkWedding is running");
        return new AnswerWedding();
    }

    private static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }

    private static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("checkChildren is running");
        return new AnswerStudent();
    }

    private static void sendMail(StudentOrder so) {
    }
}
