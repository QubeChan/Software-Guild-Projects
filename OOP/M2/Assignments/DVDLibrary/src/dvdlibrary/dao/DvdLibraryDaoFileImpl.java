/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdlibrary.dao;

import dvdlibrary.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class DvdLibraryDaoFileImpl implements DvdLibraryDao {

    private Map<Integer, Dvd> dvds = new HashMap<>();
    public static final String DVDLIST_FILE = "dvdList.txt";
    public static final String DELIMITER = "::";

    @Override
    public Dvd addDvd(int dvdId, Dvd dvd) throws DvdLibraryDaoException {
        Dvd newDvd = dvds.put(dvdId, dvd);
        writeDvdList();
        return newDvd;
    }

    @Override
    public Dvd removeDvd(int dvdId) throws DvdLibraryDaoException {
        Dvd removedDvd = dvds.remove(dvdId);
        writeDvdList();
        return removedDvd;
    }

    @Override
    public Dvd updateDvd(int dvdId, Dvd updateDvd) throws DvdLibraryDaoException {
        Dvd updatedDvd = dvds.put(dvdId,updateDvd);
        writeDvdList();
        return updatedDvd;
    }

    @Override
    public List<Dvd> getAllDvds() throws DvdLibraryDaoException {
        loadDvdList();
        return new ArrayList<Dvd>(dvds.values());
    }

    @Override
    public Dvd getDvd(int dvdId) throws DvdLibraryDaoException {
        loadDvdList();
        return dvds.get(dvdId);
    }

    public void loadDvdList() throws DvdLibraryDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(DVDLIST_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdLibraryDaoException("-_- Could not load dvd data into memory.", e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Dvd currentDvd = new Dvd(Integer.parseInt(currentTokens[0]));
            currentDvd.setTitle(currentTokens[1]);
            currentDvd.setReleaseDate(currentTokens[2]);
            currentDvd.setRating(currentTokens[3]);
            currentDvd.setDirectorName(currentTokens[4]);
            currentDvd.setStudio(currentTokens[5]);
            currentDvd.setComment(currentTokens[6]);

            dvds.put(currentDvd.getDvdId(), currentDvd);
        }
        scanner.close();
    }

    public void writeDvdList() throws DvdLibraryDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(DVDLIST_FILE));
        } catch (IOException e) {
            throw new DvdLibraryDaoException("Could not save student data", e);
        }

        List<Dvd> dvdList = this.getAllDvds();
        for (Dvd currentDvd : dvdList) {
//        for (Dvd currentDvd : this.dvds.values()) {
            out.println(currentDvd.getDvdId() + DELIMITER
                    + currentDvd.getTitle() + DELIMITER
                    + currentDvd.getReleaseDate() + DELIMITER
                    + currentDvd.getRating() + DELIMITER
                    + currentDvd.getDirectorName() + DELIMITER
                    + currentDvd.getStudio() + DELIMITER
                    + currentDvd.getComment());
            out.flush();
        }
        out.close();
    }

}
