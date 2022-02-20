package com.painoTT.worker.service.questionService;


import com.painoTT.worker.models.RequestQuestion;
import ru.pianoTT.models.QuestionDTO;

import java.util.List;

/**
 * Сервис обработки запросов на поиск вопросов на сайте
 */
public interface QuestionService {

    /**
     * Найти вопросы соответствующие параметрам
     * @param request Параметры запроса
     * @return Вопросы
     */
    List<QuestionDTO> findQuestionByParameters(RequestQuestion request);
}
