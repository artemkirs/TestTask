package com.painoTT.worker.service.mappers.question;

import com.painoTT.worker.models.Question;
import org.springframework.stereotype.Component;
import ru.pianoTT.models.QuestionDTO;

/**
 * Маппер Question в QuestionDTO
 */
@Component
public class QuestionMapperImpl implements QuestionMapper {

    /**
     * Конвертпция Question в QuestionDTO
     * @param question
     * @return
     */
    @Override
    public QuestionDTO toDto(Question question) {
        var questionDTO = new QuestionDTO();
        questionDTO.setQuestionId(question.getQuestionId());
        questionDTO.setAnyAnswers(question.getAnswerCount());
        questionDTO.setCreationDate(question.getCreationDate());
        questionDTO.setOwner(question.getOwner().getDisplayName());
        questionDTO.setLink(question.getLink());
        questionDTO.setTitle(question.getTitle());

        return questionDTO;
    }
}
