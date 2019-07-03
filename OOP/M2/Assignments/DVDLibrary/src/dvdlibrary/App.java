/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdlibrary;

import dvdlibrary.controller.DvdLibraryController;
import dvdlibrary.dao.DvdLibraryDao;
import dvdlibrary.dao.DvdLibraryDaoFileImpl;
import dvdlibrary.view.DvdLibraryView;
import dvdlibrary.view.UserIO;
import dvdlibrary.view.UserIOConsoleImpl;

/**
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        DvdLibraryView view = new DvdLibraryView(io);
        DvdLibraryDao dao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new DvdLibraryController(dao, view);
        controller.run();
    }

}
