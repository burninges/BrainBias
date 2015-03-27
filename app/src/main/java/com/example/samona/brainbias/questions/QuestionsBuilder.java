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
        questions.add(new Question("Exospherians were eating lunch. At a nearby table there was a man gesticulating and waving his arms as he spoke. Antonio stated, 'That man is Italian.'. Is this Confirmation bias?"
            , "Yes", "Confirmation bias is only referencing and validating things that support one’s perspective and ignoring things that don’t."));
        questions.add(new Question("Baljit and her girlfriends agreed that they are kickass dancers, way better than the group of exospherians that had taken over the club. Is this Ethno-Dance bias?"
            , "No", "The scenario describes the “Ingroup Bias” where often groups tend to overestimate  the skills and abilities of its members at the expense of the unknown others."));
        questions.add(new Question("Luke was feeling confident. He hadn’t won the coin toss for the football kick-off for three games now. He was certain he would win this time. Is this Neglecting Probability Fallacy?"
            , "No", "The phenomena described is the “Gambler’s Fallacy”. It is when people think there odds change based on previous events. E.G. A coin toss is always 50/50."));
        questions.add(new Question("During the coding challenge, Hernan mentioned that creating documents and re-design may be about avoiding the very thing you need to be doing e.g. coding. Is this information bias?"
            , "Yes", "The information bias is when people continue to search for information that won’t affect action."));
        questions.add(new Question("Upon returning to Canada, Mona recalled many details about failing to create a working android ap. Yet she couldn’t remember where the best pisco sours were or, who attended Lais & Brigita’s party.\nIs this a case of too many pisco sours bias?"
            , "No", "This is an example of the negativity bias – where people tend to recall details of nasty events over more pleasant ones."));
        questions.add(new Question("Example"
            , "Yes", "def"));

        return questions;
    }
    public Question getRandomQuestion() {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(getQuestions().size());

        return getQuestions().get(randomNumber);
    }
}
