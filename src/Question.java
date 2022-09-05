package src;

import src.interfaces.QuestionInterface;

public class Question implements QuestionInterface {
    private String questionText;
    private int difficulty =50 ;

    /* define the question State */ 
    Question(String questionText){
        this.questionText =questionText ;
    }
    
    /*define the difficulty of the question */
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }
    /*get the difficulty of the question */ 
    public int getDifficulty(){
        return this.difficulty;
    }
    /*get the state of the question */ 
    public String getQuestionText(){
        return this.questionText;
    }
}