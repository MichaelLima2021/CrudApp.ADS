package com.example.crudapp_ads;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class CourseRVModal implements Parcelable {
    private String courseName;
    private String courseDescription;
    private String coursePrice;
    private String courseSuiteFor;
    private String courseImg;
    private String courseLink;
    private String courseID;

    public CourseRVModal(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseSuiteFor() {
        return courseSuiteFor;
    }

    public void setCourseSuiteFor(String courseSuiteFor) {
        this.courseSuiteFor = courseSuiteFor;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseLink() {
        return courseLink;
    }

    public void setCourseLink(String courseLink) {
        this.courseLink = courseLink;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public CourseRVModal(String courseName, String courseDescription, String coursePrice, String courseSuiteFor, String courseImg, String courseLink, String courseID) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.coursePrice = coursePrice;
        this.courseSuiteFor = courseSuiteFor;
        this.courseImg = courseImg;
        this.courseLink = courseLink;
        this.courseID = courseID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {

    }
}
