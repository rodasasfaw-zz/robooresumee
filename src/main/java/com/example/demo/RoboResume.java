package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class RoboResume {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=4)
    private String firstname;
    @NotNull
    @Size(min=4)
    private String lastname;
    @NotNull
    @Size(min=4)
    private String email;
    @NotNull
    @Size(min=4)
    private String school;
    @NotNull
    @Size(min=4)
    private String degree;
    @NotNull
    @Size(min=4)
    private String year;
    @NotNull
    @Size(min=4)
    private String jobtitle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }


    public String getBeginyear() {
        return beginyear;
    }

    public void setBeginyear(String beginyear) {
        this.beginyear = beginyear;
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear;
    }

    public String getSkill() {
        return skill;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSkill(String skill) {
        this.skill = skill;

    }
    @NotNull
    @Size(min=4)
    private String company;
    @NotNull
    @Size(min=20)
    private String duties;
    @NotNull
    @Size(min=5)
    private String beginyear;
    @NotNull
    @Size(min=5)
    private String endyear;
    @NotNull
    @Size(min=6)
    private String skill;
    @NotNull
    @Min(1)
    private int rating;


}
