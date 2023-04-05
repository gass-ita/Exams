import java.util.ArrayList;

import base.Answer;
import base.Form;
import questions.CloseQuestion;

public class App {
    public static void main(String[] args) throws Exception {
        Form f = new Form("Form di prova");


        Answer a = new Answer("a");
        Answer b = new Answer("b");
        Answer c = new Answer("c");
        Answer d = new Answer("d");
        ArrayList <Answer> answers = new ArrayList<Answer>();
        answers.add(a);
        answers.add(b);
        answers.add(c);
        answers.add(d);
        CloseQuestion q = new CloseQuestion("qual'è la prima lettera dell'alfabeto?", answers, a);


        a = new Answer("pippo");
        b = new Answer("pluto");
        c = new Answer("topolino");
        d = new Answer("Forn di prova");
        answers = new ArrayList<Answer>();
        answers.add(a);
        answers.add(b);
        answers.add(c);
        answers.add(d);
        CloseQuestion q2 = new CloseQuestion("come si chiama questo form?", answers, d);

        f.addQuestion(q);
        f.addQuestion(q2);

        f.shuffleQuestions();
        f.shuffleAnswers();

        System.out.println(f);       
    }
}
