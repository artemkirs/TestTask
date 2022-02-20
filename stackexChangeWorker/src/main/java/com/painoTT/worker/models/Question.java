package com.painoTT.worker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Вопросы
 */
public class Question implements Serializable {

    @JsonProperty("tags")
    public ArrayList<String> tags;

    @JsonProperty("owner")
    public Owner owner;

    @JsonProperty("is_answered")
    public boolean isAnswered;

    @JsonProperty("view_count")
    public int viewCount;

    @JsonProperty("answer_count")
    public int answerCount;

    @JsonProperty("score")
    public int score;

    @JsonProperty("last_activity_date")
    public int lastActivityDate;

    @JsonProperty("creation_date")
    public int creationDate;

    @JsonProperty("last_edit_date")
    public int lastEditDate;

    @JsonProperty("question_id")
    public int questionId;

    @JsonProperty("content_license")
    public String contentLicense;

    @JsonProperty("link")
    public String link;

    @JsonProperty("title")
    public String title;

    @JsonProperty("accepted_answer_id")
    public int acceptedAnswerId;

    @JsonProperty("closed_date")
    public int closedDate;

    @JsonProperty("closed_reason")
    public String closedReason;

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
