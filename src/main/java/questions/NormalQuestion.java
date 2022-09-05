package questions ;
public class NormalQuestion {
    private String questionText;
    private String questionResponse ;

    public NormalQuestion(String questionText, String questionResponse) {
        this.questionText = questionText;
        this.questionResponse = questionResponse;
    }
    NormalQuestion(String questionText){
        this.questionText =questionText ;
    }

    public String getQuestionText(){
        return this.questionText;
    }
}