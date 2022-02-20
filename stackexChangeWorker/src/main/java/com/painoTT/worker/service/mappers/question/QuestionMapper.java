package com.painoTT.worker.service.mappers.question;

import com.painoTT.worker.models.Question;
import com.painoTT.worker.service.mappers.Mapper;
import ru.pianoTT.models.QuestionDTO;

/**
 * Маппер Question в QuestionDTO
 */
public interface QuestionMapper extends Mapper<QuestionDTO, Question> {
}
