package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.wedding.Adult;
import edu.javacourse.studentorder.domain.wedding.Child;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.wedding.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    private static final String CONST_1 = "1000";
    private static final String CONST_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";



    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException{

        CityRegisterResponse res = new CityRegisterResponse();

        if (person instanceof Adult) {
            Adult t = (Adult) person;
            String ps = t.getPassportSeria();
            if (ps.equals(CONST_1) || ps.equals(CONST_2)){
                res.setRegistered(true);
                res.setTemporal(false);
            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)){
                res.setRegistered(false);
            }
            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)){
                CityRegisterException ex = new CityRegisterException("1", "Fake ERROR" + ps);
                throw ex;
            }
        }

        if(person instanceof Child){
            res.setRegistered(true);
            res.setTemporal(true);
        }

        System.out.println(res);

        return res;
    }
}
