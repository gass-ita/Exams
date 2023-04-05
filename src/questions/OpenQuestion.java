package questions;

import base.Answer;
import base.Question;

public class OpenQuestion extends Question{
    
    public OpenQuestion(String question, Answer correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public Boolean correctAnswer(Answer answer) {
        if(answer.equals(this.getCorrectAnswer())) return true;
        return null;
    }
}
