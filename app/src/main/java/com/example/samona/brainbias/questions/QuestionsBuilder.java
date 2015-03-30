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
        questions.add(new Question("Exospherians were eating lunch. At a nearby table there was a man gesticulating and waving his arms as he spoke. Antonio stated, 'That man is Italian.'.\nIs this Confirmation bias?"
            , "Yes", "Confirmation bias is only referencing and validating things that support one’s perspective and ignoring things that don’t."));
        questions.add(new Question("Baljit and her girlfriends agreed that they are kickass dancers, way better than the group of exospherians that had taken over the club.\nIs this Ethno-Dance bias?"
            , "No", "The scenario describes the “Ingroup Bias” where often groups tend to overestimate  the skills and abilities of its members at the expense of the unknown others."));
        questions.add(new Question("Luke was feeling confident. He hadn’t won the coin toss for the football kick-off for three games now. He was certain he would win this time.\nIs this Neglecting Probability Fallacy?"
            , "No", "The phenomena described is the “Gambler’s Fallacy”. It is when people think there odds change based on previous events. E.G. A coin toss is always 50/50."));
        questions.add(new Question("During the coding challenge, Hernan mentioned that creating documents and re-design may be about avoiding the very thing you need to be doing e.g. coding.\nIs this information bias?"
            , "Yes", "The information bias is when people continue to search for information that won’t affect action."));
        questions.add(new Question("Upon returning to Canada, Mona recalled many details about failing to create a working android app. Yet she couldn’t remember where the best pisco sours were or, who attended Lais & Brigita’s party.\nIs this a case of too many pisco sours bias?"
            , "No", "This is an example of the negativity bias – where people tend to recall details of nasty events over more pleasant ones."));
        questions.add(new Question("Letícia, Humberto and Márcio seem quiet and introverted therefore they can’t be Brazilian.\nIs this stereotyping?"
            , "Yes", "Stereotyping is expecting people to have specific characteristics based on their membership to a group."));
        questions.add(new Question("After Artem’s presentation on his Intercontinental Ballistic Missile Delivery System (IBMDS), Andreas arranged to have his family move into a bunker.\nIs this the hyperbolic discounting bias in action?"
            , "No", "When risk is incorrectly estimated it is called the neglecting probability bias, e.g. dying of food poisoning is more likely than dying from a terrorist attack. Note, there is incomplete data on death by IBMDS."));
        questions.add(new Question("Oddly only men with hair are participating in Hydra II.\nWere male participants chosen based on an observational selection bias?"
            , "No", "This is an example of insensitivity to sample size.  A.k.a. coming to a conclusion when in fact it may be a coincidence."));
        questions.add(new Question("Once again, the line-up for Hernan’s coding help grew as he worked with Juliana and Nick. Sascha noticed a pattern and thought it was related to enticing Hernan to sit.\nIs this the Comfortable ass bias?"
            , "No", "This is an epiphenomena – read Antifragile if you don’t understand."));
        questions.add(new Question("At the restaurant, exospherians en masse started ordering 3.8 litre beers.\nIs this an example of herd behavior?"
            , "No", "Herd behavior is often witnessed at riots, sporting events, and during religious frenzies for example. It is often related to groupthink. It could be argued in this scenario it is really about coding week."));
        return questions;
    }
    public Question getRandomQuestion() {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(getQuestions().size());

        return getQuestions().get(randomNumber);
    }
}
