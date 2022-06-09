package edu.javacourse.city.dao;

import edu.javacourse.city.domain.PersonRequest;
import edu.javacourse.city.domain.PersonResponse;
import edu.javacourse.city.exception.PersonCheckException;

import java.sql.*;

public class PersonCheckDao {

    public PersonCheckDao(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final String SQL_REQUEST = "SELECT temporal FROM cr_address_person ap " +
            "INNER JOIN cr_person p on p.person_id = ap.person_id " +
            "INNER JOIN cr_address a on a.address_id = ap.address_id " +
            "WHERE " +
            "CURRENT_DATE >= ap.start_date and (CURRENT_DATE <= ap.end_date or ap.end_date is null) " +
            "AND upper(p.sur_name) = upper(?) " +
            "AND upper(p.given_name) = upper(?) " +
            "AND upper(patronymic) = upper(?) " +
            "AND p.date_of_birth = ? " +
            "AND a.street_code = ? " +
            "AND upper(a.building) = upper(?) ";
    public PersonResponse checkPerson(PersonRequest request) throws PersonCheckException {
        PersonResponse response = new PersonResponse();

        String sql = SQL_REQUEST;
        if (request.getExtension() != null){
            sql += "AND upper(a.extension) = upper(?) ";
        } else {
            sql += "AND a.extension is null ";
        }

        if (request.getApartment() != null){
            sql += "AND upper(a.apartment) = upper(?)";
        } else {
            sql += "AND a.apartment is null";
        }

        try(Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)) {
            int count = 1;

            stmt.setString(count++, request.getSurName());
            stmt.setString(count++, request.getGivenName());
            stmt.setString(count++, request.getPatronymic());
            stmt.setDate(count++, java.sql.Date.valueOf(request.getDateOfBirth()));
            stmt.setInt(count++, request.getStreetCode());
            stmt.setString(count++, request.getBuilding());
            if (request.getExtension() != null) {
                stmt.setString(count++, request.getExtension());
            }
            if (request.getApartment() != null) {
                stmt.setString(count++, request.getApartment());
            }


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

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost/city_register", "postgres", "1234567");
    }

}
