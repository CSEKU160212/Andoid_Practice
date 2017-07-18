package com.cseku_160212.customadapter;

/**
 * Created by CSEKU_160212 on 06/25/2017.
 */

public class studentDataProvider {

    private int studentPhoto;
    private String studentName;
    private String studentId;


    public studentDataProvider(int studentPhoto, String studentId, String studentName)
    {
        this.setStudentPhoto(studentPhoto);

        this.setStudentId(studentId);

        this.setStudentName(studentName);
    }


    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
