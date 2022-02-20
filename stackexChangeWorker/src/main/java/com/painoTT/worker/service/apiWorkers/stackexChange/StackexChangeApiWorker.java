package com.painoTT.worker.service.apiWorkers.stackexChange;


import com.painoTT.worker.models.RequestQuestion;
import com.painoTT.worker.models.ResponseQuestion;

/**
 * Сервис работающий с api https://api.stackexchange.com/2.3/
 */

public interface StackexChangeApiWorker {

    /**
     * Поиск вопросов по параметрам
     * @param request запрос с параметрами
     * @return Найденные вопросы
     */
    ResponseQuestion findByParameters(RequestQuestion request) throws Exception;

    /**
     * Изменить базовый uri
     * @param uri новое значение uri
     */
    void changBaseUri(String uri);
}
