package com.example.samona.brainbias.questions;

import java.util.Random;

/**
 * Created by Sascharlatan on 25.03.2015.
 */
public class Question {
     public String question;
     public String answer;

     public Question(String q, String a) {
     this.question = q;
     this.answer = a;
    }
}


/*

    //String[] questions = {
            "Confirmation bias: Exospherians were eating lunch. At a nearby table there was a man gesticulating and waving his arms as he spoke. Antonio stated, 'That man is Italian.'",
                    //Confirmation bias
            "Ethno-Dance bias: Baljit and her girlfriends agreed that they are kickass dancers, way better than the group of exospherians that had taken over the club?",
                    //Ingroup bias
            "Neglecting Probability Fallacy: Luke was feeling confident. He hadn’t won the coin toss for the football kick-off for three games now. He was certain he would win this time.",
                    //Gambler's fallacy
            "Situation 4",
                    //
            "Situation 5",
                    //
            "Situation 6",
                    //
            "Situation 7",
                    //
            "Situation 8",
                    //
            "Situation 9",
                    //
            "Situation 10"
                    //

    };

    String questions = "";

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(questions.length);

    questions = questions(randomNumber);


    //?

        "Confirmation bias is only referencing and validating things that support one’s perspective and ignoring things that don’t.",
        "The scenario describes the “Ingroup Bias” where often groups tend to overestimate  the skills and abilities of its members at the expense of the unknown others.",
        "The phenomena described is the “Gambler’s Fallacy”. It is when people think there odds change based on previous events. E.G. A coin toss is always 50/50.",
        "Definition 4",
        "Definition 5",
        "Definition 6",
        "Definition 7",
        "Definition 8",
        "Definition 9",
        "Definition 10",
*/
