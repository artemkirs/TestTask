package ru.pianoTT.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Модель вопроса для отправки по API
 */

public class QuestionDTO {
    /**
     * Id вопроса
     */
    @JsonProperty("questionId")
    private int questionId;

    /**
     * Дата создания вопроса в unix
     */
    @JsonProperty("creationDate")
    private Date creationDate;

    /**
     * Ссылка на вопрос
     */
    @JsonProperty("link")
    private String link;

    /**
     * Загаловок вопроса
     */
    @JsonProperty("title")
    private String title;

    /**
     * Наличие ответов на вопрос
     */
    @JsonProperty("anyAnswers")
    private boolean anyAnswers;

    /**
     * Владелец вопроса
     */
    @JsonProperty("owner")
    private String owner;



    /**
     * Установить дату создания вопроса
     * @param date Дата
     */
    public void setCreationDate(Date date){
        this.creationDate = date;
    }

    /**
     * Установить дату создания вопроса
     * @param timeStamp Дата в unix
     */
    public void setCreationDate(int timeStamp){
        this.creationDate = new Date((long)timeStamp * 1000);
    }

    /**
     * Получить дату создания вопроса
     * @return Дата создания вопроса
     */
    public Date getCreationDate(){
        return this.creationDate;
    }

    /**
     * Установить есть ли ответы на вопрос
     * @param answerCount Число ответов
     */
    public  void setAnyAnswers(int answerCount){
        this.anyAnswers = answerCount != 0;
    }

    /**
     * Получить есть ли ответы на вопрос
     * @return true - есть ответы на вопрос, иначе false
     */
    public boolean getAnyAnswers(){
        return this.anyAnswers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
