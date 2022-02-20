package com.pianoTT.restApiStackexChangeApi.controller;

import com.painoTT.worker.models.RequestQuestion;
import com.painoTT.worker.service.questionService.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pianoTT.models.QuestionDTO;

import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/search")
    public List<QuestionDTO> greeting(@RequestParam Map<String, String> params ) {
        return questionService.findQuestionByParameters(new RequestQuestion(params));
    }
}
