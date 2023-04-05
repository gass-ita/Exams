package base;

import java.util.ArrayList;
import questions.CloseQuestion;


public class Form {
    ArrayList<Question> questions;
    String title = "";
    
    public Form(ArrayList<Question> questions) {
        this.questions = questions;
        this.title = "Form";
    }

    public Form(ArrayList<Question> questions, String title) {
        this.questions = questions;
        this.title = title;
    }

    public Form(String title) {
        this.questions = new ArrayList<Question>();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void shuffleQuestions() {
        for (int i = 0; i < questions.size(); i++) {
            int random = (int) (Math.random() * questions.size());
            Question temp = questions.get(i);
            questions.set(i, questions.get(random));
            questions.set(random, temp);
        }
    }

    public void shuffleAnswers() {
        for (int i = 0; i < questions.size(); i++) {
            if(questions.get(i) instanceof CloseQuestion) {
                ((CloseQuestion) questions.get(i)).shuffleAnswers();
            }
        }
    }


    

    @Override
    public String toString() {
        String s = title + "\n";
        for (int i = 0; i < questions.size(); i++) {
            s += (i + 1) + ") " + questions.get(i) + "\n";
        }
        return s;
    }




}
