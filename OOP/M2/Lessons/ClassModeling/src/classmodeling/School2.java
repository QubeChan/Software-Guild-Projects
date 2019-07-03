/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmodeling;

/**
 *
 * @author Qube
 */
public class School2 {

    private int enrollment,
            numOfTeachers;
    private String[] coursesOffered,
            clubsOffered;
    private Student[] studentRoster;
    private String sportsNickname;
    
    public void enrollStudent(Student student){
        
    }
    
    public void unenrollStudent(Student student){
        
    }
    
    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getNumOfTeachers() {
        return numOfTeachers;
    }

    public void setNumOfTeachers(int numOfTeachers) {
        this.numOfTeachers = numOfTeachers;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String[] getClubsOffered() {
        return clubsOffered;
    }

    public void setClubsOffered(String[] clubsOffered) {
        this.clubsOffered = clubsOffered;
    }

    public Student[] getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(Student[] studentRoster) {
        this.studentRoster = studentRoster;
    }

    public String getSportsNickname() {
        return sportsNickname;
    }

    public void setSportsNickname(String sportsNickname) {
        this.sportsNickname = sportsNickname;
    }
    
    
}
