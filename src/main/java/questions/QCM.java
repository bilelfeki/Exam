package questions;

import java.util.HashMap;
import java.util.Map;

public class QCM  {
    private final String  questionText;
    private final Map<String,Boolean> choiceList  ;

    public QCM() {
        questionText = "";
        choiceList =new HashMap<>();
    }

    public QCM(String questionText, Map<String,Boolean> choiceList){
        this.questionText = questionText;
        this.choiceList =choiceList ;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Map<String, Boolean> getChoiceList() {
        return choiceList;
    }
}