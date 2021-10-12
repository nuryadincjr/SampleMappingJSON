package com.nuryadincjr.samplemappingjson;

import java.util.List;

public class Biograph {
    private String name;
    private String brith_of_date;
    private String brith;
    private List<String> hobby;
    private List<Education> educations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrith_of_date() {
        return brith_of_date;
    }

    public void setBrith_of_date(String brith_of_date) {
        this.brith_of_date = brith_of_date;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }
}
