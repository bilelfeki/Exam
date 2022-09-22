package questions ;
public class NormalQuestion {
    private final String questionText;
    private String questionResponse ;
    public NormalQuestion(){
        this.questionText="" ;
        this.questionResponse="" ;
    }
    public NormalQuestion(String questionText){
        this.questionText =questionText ;
    }

    public NormalQuestion(String questionText, String questionResponse) {
        this.questionText = questionText;
        this.questionResponse = questionResponse;
    }

    public String getQuestionText(){
        return this.questionText;
    }
    public String getQuestionResponse(){ return this.questionResponse ; }
}