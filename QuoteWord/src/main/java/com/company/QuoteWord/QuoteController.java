package com.company.QuoteWord;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class QuoteController {
    List<Quote> quotes = new ArrayList<>();

    QuoteController() {

        quotes.add(new Quote("You can make anything by writing", "C.S. Lewis"));
        quotes.add(new Quote("The purpose of a writer is to keep civilization from destroying itself.", "Albert Camus"));
        quotes.add(new Quote("Learn to enjoy every minute of your life. Be happy now", "Earl Nightingale"));
        quotes.add(new Quote("Choosing to be positive and having a grateful attitude is going to determine how you're going to live your life", "Joea Osteen"));
        quotes.add(new Quote("Peace is the beauty of life. It is sunshine", "Menachem Begin"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it", "Steve Jobs"));
        quotes.add(new Quote("I am blessed with a funny gene that makes me enjoy life", "Karen Patel"));
        quotes.add(new Quote("Never stop fighting until you arrive at your destined place - that is, the unique you. Have an aim in life, continuously acquire knowledge, work hard, and have perseverance to realise the great life", "A.P.J.Abdul Kalaam"));
        quotes.add(new Quote("Take up one idea. Make that one idea your life - think of it, dream of it, live on that idea", "Swami Vivekananda"));
        quotes.add(new Quote("Life is short, and if we enjoy every moment of every day, then we will be happy no matter what happens or what changes along the way", "Gretchen Blleler"));


    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getQuoteOftheDay(){

        int randomNUmber = ThreadLocalRandom.current().nextInt(0,9);
        return quotes.get(randomNUmber);


    }
}