/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdlibrary.dao;

import dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author Qube
 */
public interface DvdLibraryDao {

    Dvd addDvd(int dvdId, Dvd dvd) throws DvdLibraryDaoException;

    Dvd removeDvd(int dvdId) throws DvdLibraryDaoException;

    Dvd updateDvd(int dvdId, Dvd dvd) throws DvdLibraryDaoException;

    List<Dvd> getAllDvds() throws DvdLibraryDaoException;

    Dvd getDvd(int dvdId) throws DvdLibraryDaoException;

}
