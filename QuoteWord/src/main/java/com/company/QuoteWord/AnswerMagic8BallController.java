package com.company.QuoteWord;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class AnswerMagic8BallController {

    Map<Integer, AnswerMagic8Ball> magic8BallMap;

    int i = 1000;
    public AnswerMagic8BallController() {
        magic8BallMap = new HashMap<>();
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Signs point to yes"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Don't count on it"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Better not tell you now"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "It is certain"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Ask again later"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Don't count on it"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Most likely"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "My sources say no"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Without a doubt"));
        magic8BallMap.put(i++, new AnswerMagic8Ball(null, "Cannot predict now"));

    }

    @RequestMapping(value="/magic", method = RequestMethod.GET)
    public AnswerMagic8Ball getAnswerMagic8Ball(@RequestBody String requestbody){
        int randomNumber = ThreadLocalRandom.current().nextInt(1000, 1000+magic8BallMap.size()-1);
        AnswerMagic8Ball magic8Ball = new AnswerMagic8Ball();
        magic8Ball.setQuestion(requestbody);
        magic8Ball.setAnswer(magic8BallMap.get(randomNumber).getAnswer());
        return  magic8Ball;



    }
}
