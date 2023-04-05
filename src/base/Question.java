package base;
public class Question {
    private String question;
    
    private Answer correctAnswer;

    public Question(String question, Answer correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public Boolean correctAnswer(Answer answer) {
        return answer.equals(correctAnswer);
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return question;
    }
}