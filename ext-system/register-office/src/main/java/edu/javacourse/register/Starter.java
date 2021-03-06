package edu.javacourse.register;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.rest.MarriageController;
import edu.javacourse.register.view.MarriageRequest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("springContext.xml");

        MarriageController controller
                = context.getBean(MarriageController.class);
        controller.findMarriageCertificate(new MarriageRequest());
    }
}
