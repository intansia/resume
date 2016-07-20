package com.example.zxcvbn.resume_anita;

/**
 * Created by zxcvbn on 19/07/2016.
 */
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ModelResume {
    @SerializedName("name")
    private String name;
    @SerializedName("college")
    private String college;
    @SerializedName("phone")
    private String phone;
    @SerializedName("email")
    private String email;
    @SerializedName("profile")
    private String profile;
    @SerializedName("education")
    private String education;
    @SerializedName("technicalskill")
    private String technicalskill;
    @SerializedName("achivement")
    private String achivement;
    @SerializedName("relatedcourse")
    private String relatedcourse;
    @SerializedName("internship")
    private String internship;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The college
     */
    public String getCollege() {
        return college;
    }

    /**
     *
     * @param college
     * The college
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     *
     * @return
     * The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     * The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     *
     * @param profile
     * The profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     *
     * @return
     * The education
     */
    public String getEducation() {
        return education;
    }

    /**
     *
     * @param education
     * The education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     *
     * @return
     * The technicalskill
     */
    public String getTechnicalskill() {
        return technicalskill;
    }

    /**
     *
     * @param technicalskill
     * The technicalskill
     */
    public void setTechnicalskill(String technicalskill) {
        this.technicalskill = technicalskill;
    }

    /**
     *
     * @return
     * The achivement
     */
    public String getAchivement() {
        return achivement;
    }

    /**
     *
     * @param achivement
     * The achivement
     */
    public void setAchivement(String achivement) {
        this.achivement = achivement;
    }

    /**
     *
     * @return
     * The relatedcourse
     */
    public String getRelatedcourse() {
        return relatedcourse;
    }

    /**
     *
     * @param relatedcourse
     * The relatedcourse
     */
    public void setRelatedcourse(String relatedcourse) {
        this.relatedcourse = relatedcourse;
    }

    /**
     *
     * @return
     * The internship
     */
    public String getInternship() {
        return internship;
    }

    /**
     *
     * @param internship
     * The internship
     */
    public void setInternship(String internship) {
        this.internship = internship;
    }
}
