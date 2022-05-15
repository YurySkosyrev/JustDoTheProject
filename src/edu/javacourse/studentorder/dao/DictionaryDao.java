package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.wedding.PasportOffice;
import edu.javacourse.studentorder.domain.wedding.RegisterOffice;
import edu.javacourse.studentorder.domain.wedding.Street;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PasportOffice> findPasportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
}
