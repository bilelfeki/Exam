package src.main.java.questions;

public class NormalQuestion {
    private String questionText;
    private String questionResponse ;
    private int difficulty =50;

    public NormalQuestion(String questionText, String questionResponse, int difficulty) {
        this.questionText = questionText;
        this.questionResponse = questionResponse;
        this.difficulty = difficulty;
    }
    NormalQuestion(String questionText){
        this.questionText =questionText ;
    }
    public void setDifficulty(int difficulty){

        this.difficulty = difficulty;
    }
    public int getDifficulty(){
        return this.difficulty;
    }
    public String getQuestionText(){
        return this.questionText;
    }
}