package com.painoTT.worker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
/**
 * Владелец вопроса
 */
public class Owner implements Serializable {

    @JsonProperty("account_id")
    private int accountId;

    @JsonProperty("reputation")
    private int reputation;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("user_type")
    private String userType;

    @JsonProperty("profile_image")
    private String profileImage;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("link")
    private String link;

    @JsonProperty("accept_rate")
    private int acceptRate;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(int acceptRate) {
        this.acceptRate = acceptRate;
    }
}