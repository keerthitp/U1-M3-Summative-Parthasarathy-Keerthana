package com.company.QuoteWord;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerMagic8Ball {
    private String question;
    private String answer;

    public AnswerMagic8Ball(String question, String answer) {

        this.question = question;
        this.answer = answer;
    }

    public AnswerMagic8Ball() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
