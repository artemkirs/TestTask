package com.painoTT.worker.service.questionService;


import com.painoTT.worker.models.RequestQuestion;
import com.painoTT.worker.models.ResponseQuestion;
import com.painoTT.worker.service.apiWorkers.stackexChange.StackexChangeApiWorker;
import com.painoTT.worker.service.mappers.question.QuestionMapper;
import org.springframework.stereotype.Service;
import ru.pianoTT.models.QuestionDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис обработки запросов на поиск вопросов на сайте
 */
@Service
public class QuestionServiceImpl implements QuestionService{

    private final QuestionMapper questionMapper;

    private final StackexChangeApiWorker stackexChangeApiWorker;


    public QuestionServiceImpl(QuestionMapper questionMapper,
                               StackexChangeApiWorker stackexChangeApiWorker) {
        this.questionMapper = questionMapper;
        this.stackexChangeApiWorker = stackexChangeApiWorker;
    }


    /**
     * Найти вопросы соответствующие параметрам
     * @param request Параметры запроса
     * @return Вопросы
     */
    @Override
    public List<QuestionDTO> findQuestionByParameters(RequestQuestion request) {
        try {
            ResponseQuestion questions = stackexChangeApiWorker.findByParameters(request);
            return  questions.getItems().stream()
                    .map(questionMapper::toDto).collect(Collectors.toList());
        }catch (Exception ex){
            return new ArrayList<>();
        }
    }
}
