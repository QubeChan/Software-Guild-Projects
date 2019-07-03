/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdlibrary.view;

import dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author Qube
 */
public class DvdLibraryView {

    private UserIO io;

    public DvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
                + "-                         -\n"
                + "=  Qube's DVD Collection  =\n"
                + "-                         -\n"
                + "=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
                + "\n"
                + "        - Main Menu -      \n"
                + "1) Create DVD\n"
                + "2) Remove DVD\n"
                + "3) Update DVD\n"
                + "4) List all DVDs\n"
                + "5) Find a DVD\n"
                + "6) Exit");

        return io.readInt("Please select from the above choices.", 1, 7);
    }

    public void displayCreateDVDBanner() {
        io.print("=     - Create DVD -      =");
    }

    public Dvd getNewDvdInfo() {
        int dvdId = io.readInt("Please enter DVD ID");
        String title = io.readString("Please enter the title"),
                releaseDate = io.readString("Please enter the release date (mm.dd.yyyy)"),
                rating = io.readString("Please enter the MPAA rating"),
                directorName = io.readString("Please enter the director's name"),
                studio = io.readString("Please enter the studio"),
                comment = io.readString("Please leave a comment or rating");
        Dvd currentDvd = new Dvd(dvdId);
        currentDvd.setTitle(title);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setRating(rating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudio(studio);
        currentDvd.setComment(comment);
        return currentDvd;
    }

    public void displayCreateSuccessBanner() {
        io.readString("DVD was successfully created. Please hit enter to continue");
    }

    public void displayRemoveDvdBanner() {
        io.print("=      Remove DVD         =");
    }

    public void displayRemoveSuccessBanner() {
        io.readString("Dvd successfully removed. Please hit enter to continue");
    }

    public void displayUpdateDvdBanner() {
        io.print("=      Update DVD         =");
    }

    public Dvd getUpdateDvdInfo(Dvd dvd) {
//        int dvdId = io.readInt("Please enter DVD ID");
        String title = io.readString("Please enter the title"),
                releaseDate = io.readString("Please enter the release date (mm.dd.yyyy)"),
                rating = io.readString("Please enter the MPAA rating"),
                directorName = io.readString("Please enter the director's name"),
                studio = io.readString("Please enter the studio"),
                comment = io.readString("Please leave a comment or rating");
        Dvd updateDvd = new Dvd(dvd.getDvdId());
        updateDvd.setTitle(title);
        updateDvd.setReleaseDate(releaseDate);
        updateDvd.setRating(rating);
        updateDvd.setDirectorName(directorName);
        updateDvd.setStudio(studio);
        updateDvd.setComment(comment);
        return updateDvd;
    }

    public void displayUpdateSuccessBanner() {
        io.readString("Dvd successfully updated. Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=      List All DVDs      =");
    }

    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            io.print(currentDvd.getDvdId() + ": "
                    + currentDvd.getTitle() + " "
                    + currentDvd.getReleaseDate() + " "
                    + currentDvd.getRating() + " "
                    + currentDvd.getDirectorName() + " "
                    + currentDvd.getStudio() + " "
                    + currentDvd.getComment());
        }
        io.readString("Please hit enter to continue");
    }

    public void displayDisplayDvdBanner() {
        io.print("=      Display DVDs       =");
    }

    public int getDvdIdChoice() {
        return io.readInt("Please enter the DVD ID");
    }

    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print("" + dvd.getDvdId());
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getRating());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getComment() + "\n");

        } else {
            io.print("No such DVD");
        }
        io.readString("PLease hit enter to continue");
    }

    public void displayExitBanner() {
        io.print("Good bye! Thanks for stopping by Qube's DVD Collection!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
