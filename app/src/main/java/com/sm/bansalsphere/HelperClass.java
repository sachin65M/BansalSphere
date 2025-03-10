package com.sm.bansalsphere;

public class HelperClass {
    private String name, email, password, enrollment, course, phone;

    public HelperClass() {
        // Default constructor required for Firebase
    }

    public HelperClass(String name, String email, String password, String enrollment, String course, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.enrollment = enrollment;
        this.course = course;
        this.phone = phone;
    }

    // Getters and setters for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
