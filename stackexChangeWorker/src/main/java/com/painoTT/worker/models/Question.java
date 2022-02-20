package com.painoTT.worker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Вопросы
 */
public class Question implements Serializable {

    @JsonProperty("tags")
    private ArrayList<String> tags;

    @JsonProperty("owner")
    private Owner owner;

    @JsonProperty("is_answered")
    private boolean isAnswered;

    @JsonProperty("view_count")
    private int viewCount;

    @JsonProperty("answer_count")
    private int answerCount;

    @JsonProperty("score")
    private int score;

    @JsonProperty("last_activity_date")
    private int lastActivityDate;

    @JsonProperty("creation_date")
    private int creationDate;

    @JsonProperty("last_edit_date")
    private int lastEditDate;

    @JsonProperty("question_id")
    private int questionId;

    @JsonProperty("content_license")
    private String contentLicense;

    @JsonProperty("link")
    private String link;

    @JsonProperty("title")
    private String title;

    @JsonProperty("accepted_answer_id")
    private int acceptedAnswerId;

    @JsonProperty("closed_date")
    private int closedDate;

    @JsonProperty("closed_reason")
    private String closedReason;

    @JsonProperty("bounty_amount")
    private int bountyAmount;

    @JsonProperty("bounty_closes_date")
    private int bountyClosesDate;

    public int getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(int bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    public int getBountyClosesDate() {
        return bountyClosesDate;
    }

    public void setBountyClosesDate(int bountyClosesDate) {
        this.bountyClosesDate = bountyClosesDate;
    }

    public int getProtectedDate() {
        return protectedDate;
    }

    public void setProtectedDate(int protectedDate) {
        this.protectedDate = protectedDate;
    }

    @JsonProperty("protected_date")
    private int protectedDate;




    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(int lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public int getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(int lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContentLicense() {
        return contentLicense;
    }

    public void setContentLicense(String contentLicense) {
        this.contentLicense = contentLicense;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(int acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public int getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(int closedDate) {
        this.closedDate = closedDate;
    }

    public String getClosedReason() {
        return closedReason;
    }

    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }
}
