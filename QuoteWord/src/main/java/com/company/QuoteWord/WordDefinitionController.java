package com.company.QuoteWord;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class WordDefinitionController {

    Map<Integer, WordDefinition> wordDefinitionMap;
    int i = 0;

    WordDefinitionController(){
        wordDefinitionMap = new HashMap<>();

        wordDefinitionMap.put(i++, new WordDefinition("audacity", "a willingness to take bold risks"));
        wordDefinitionMap.put(i++, new WordDefinition("defiance", "open resistance; bold disobedience"));
        wordDefinitionMap.put(i++, new WordDefinition("gallant","a young man of fashion" ));
        wordDefinitionMap.put(i++, new WordDefinition("confidant", "one to whom secrets are entrusted"));
        wordDefinitionMap.put(i++, new WordDefinition("speculate", "to meditate on or ponder a subject"));
        wordDefinitionMap.put(i++, new WordDefinition("torrid", "parched with heat especially of the sun"));
        wordDefinitionMap.put(i++, new WordDefinition("burgeon", "to send forth new growth"));
        wordDefinitionMap.put(i++, new WordDefinition("provender", "dry food for domestic animals"));
        wordDefinitionMap.put(i++, new WordDefinition("dearth", "an inadequate supply"));
        wordDefinitionMap.put(i++, new WordDefinition("ostentatious", "seeking to attract attention"));


    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public WordDefinition getDefinitionForWord(){

        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(wordDefinitionMap.size());
        return wordDefinitionMap.get(randomNum);

    }


}
