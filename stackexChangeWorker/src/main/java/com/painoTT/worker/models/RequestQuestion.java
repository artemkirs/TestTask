package com.painoTT.worker.models;

import java.util.Map;

/**
 * Запрос на сайт с параметрами
 */
public class RequestQuestion {

    /**
     *  Параметры запроса
     *  Н
     */
    private Map<String, String> parameters;

    /**
     * Конструктор по умолчанию
     * @param parameters параметры запроса
     *                   Название поля : Значение в поле
     */
    public  RequestQuestion(Map<String, String> parameters){
        this.parameters = parameters;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

}
