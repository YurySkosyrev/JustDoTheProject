package edu.javacourse.city.dao;

import edu.javacourse.city.domain.PersonRequest;
import edu.javacourse.city.domain.PersonResponse;
import edu.javacourse.city.exception.PersonCheckException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonCheckDao {

    private static final String SQL_REQUEST = "SELECT temporal FROM cr_address_person ap" +
            "INNER JOIN cr_person p on p.person_id = ap.person_id" +
            "INNER JOIN cr_address a on a.address_id = ap.address_id" +
            "WHERE" +
            "upper(p.sur_name) = upper(?) " +
            "AND upper(p.given_name) = upper(?)" +
            "AND upper(patronymic) = upper(?)" +
            "AND p.date_of_birth = ?" +
            "AND a.street_code = ?" +
            "AND upper(a.building) = upper(?)" +
            "AND upper(extension) = upper(?)" +
            "AND upper(a.apartment) = upper(?)";
    public PersonResponse checkPerson(PersonRequest request) throws PersonCheckException {
        PersonResponse response = new PersonResponse();

        try(Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_REQUEST)) {

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                response.setRegistered(true);
                response.setTemporal(rs.getBoolean("temporal"));
            }

        }catch (SQLException ex) {
            throw new PersonCheckException(ex);
        }

        return response;
    }

    private Connection getConnection() {
        return null;
    }

}
