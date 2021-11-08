package com.example.englishhh;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List <QuestionsList> thucVatQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList questions1 = new QuestionsList(R.drawable.cactus, "cactus", "grass", "lvy", "moss","cactus","");
        final QuestionsList questions2 = new QuestionsList(R.drawable.rose, "herb", "lvy", "rose", "grass","rose","");
        final QuestionsList questions3 = new QuestionsList(R.drawable.dionaea_muscipula, "cactus", "dionaea muscipula", "rose", "moss","dionaea muscipula","");
        final QuestionsList questions4 = new QuestionsList(R.drawable.nepenthes, "nepenthes", "herb", "rose", "lvy","nepenthes","");
        final QuestionsList questions5 = new QuestionsList(R.drawable.sunflower, "nepenthes", "cactus", "grass", "sunflower","sunflower","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);

        return questionsLists;
    }

    private static List <QuestionsList> dongVatQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList questions1 = new QuestionsList(R.drawable.doraemon, "dog", "cat", "mouse", "chicken","cat","");
        final QuestionsList questions2 = new QuestionsList(R.drawable.pikachu, "pikachu", "cat", "pog", "giraffe","pikachu","");
        final QuestionsList questions3 = new QuestionsList(R.drawable.cows, "cat", "cows", "mouse", "chicken","cows","");
        final QuestionsList questions4 = new QuestionsList(R.drawable.giraffe, "cat", "cows", "pig", "giraffe","giraffe","");
        final QuestionsList questions5 = new QuestionsList(R.drawable.cat, "mouse", "dog", "cat", "giraffe","cat","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);


        return questionsLists;
    }
    private static List <QuestionsList> bienCaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList questions1 = new QuestionsList(R.drawable.dolphin, "shark", "carp", "dolphin", "bullhead","dolphin","");
        final QuestionsList questions2 = new QuestionsList(R.drawable.whale, "whale", "bream", "anchovy", "eel","whale","");
        final QuestionsList questions3 = new QuestionsList(R.drawable.shark, "shark", "carp", "bullhead", "dolphin","shark","");
        final QuestionsList questions4 = new QuestionsList(R.drawable.pufferfish, "ray", "pufferfish", "eel", "anchovy","pufferfish","");
        final QuestionsList questions5 = new QuestionsList(R.drawable.ray, "bullhead", "shark", "whale", "ray","ray","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);

        return questionsLists;
    }
    private static List <QuestionsList> giaDinhQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList questions1 = new QuestionsList(R.drawable.grandparents, "lawer", "grandparents", "sister", "mom","grandparents","");
        final QuestionsList questions2 = new QuestionsList(R.drawable.doctor, "doctor", "police", "fireman", "daddy","doctor","");
        final QuestionsList questions3 = new QuestionsList(R.drawable.police, "grandmother", "grandfather", "police", "mother","police","");
        final QuestionsList questions4 = new QuestionsList(R.drawable.fireman, "doctor", "brother", "sister", "fireman","fireman","");
        final QuestionsList questions5 = new QuestionsList(R.drawable.worker, "lawer", "jugdger", "worker", "doctor","worker","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "GiaDinh":
                return giaDinhQuestions();
            default:
                return bienCaQuestions();
            case "DongVat":
                return dongVatQuestions();
            case "ThucVat":
                return thucVatQuestions();
        }
    }
}
