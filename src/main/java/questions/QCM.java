package src.main.java.questions;

import java.util.HashMap;
import java.util.Map;

public class QCM  {
    private String questionText;
    private Map<String,Boolean> choiceList =new HashMap<>() ;

    QCM(String questionText, Map<String,Boolean> choiceList){
        this.questionText = questionText;
        this.choiceList =choiceList ;
    }
}