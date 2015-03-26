package com.example.samona.brainbias.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sascharlatan on 26.03.2015.
 */
public class QuestionsBuilder {
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<Question>();
        questions.add(new Question("Confirmation bias: Exospherians were eating lunch. At a nearby table there was a man gesticulating and waving his arms as he spoke. Antonio stated, 'That man is Italian.'"
            , "Yes"));
        questions.add(new Question("Ethno-Dance bias: Baljit and her girlfriends agreed that they are kickass dancers, way better than the group of exospherians that had taken over the club?"
            , "No"));
        questions.add(new Question("Neglecting Probability Fallacy: Luke was feeling confident. He hadn’t won the coin toss for the football kick-off for three games now. He was certain he would win this time."
            , "No"));




        return questions;
    }
    public Question getRandomQuestion() {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(getQuestions().size());

        return getQuestions().get(randomNumber);
    }
}
