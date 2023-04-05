package questions;

import java.util.ArrayList;

import base.Answer;
import base.Question;

public class CloseQuestion extends Question {
    private ArrayList<Answer> answers;

    public CloseQuestion(String question, ArrayList<Answer> answers, Answer correctAnswer) {
        super(question, correctAnswer);

        //check if correct answer is in the list of answers
        if (!answers.contains(correctAnswer)) {
            answers.add(correctAnswer);
        }

        this.answers = answers;
    }

    public void shuffleAnswers() {
        for (int i = 0; i < answers.size(); i++) {
            int random = (int) (Math.random() * answers.size());
            Answer temp = answers.get(i);
            answers.set(i, answers.get(random));
            answers.set(random, temp);
        }
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        String s = this.getQuestion() + "\n";
        for (int i = 0; i < answers.size(); i++) {
            s += "\t" + (i + 1) + ") " + answers.get(i) + "\n";
        }
        return s;

    }
}
