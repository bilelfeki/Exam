package  questions ;

import java.util.ArrayList;
import java.util.List;

public class NormalQuestionList {
    private final List<NormalQuestion> normalQuestionList = new ArrayList<>() ;

    public NormalQuestionList(){
    }

    public void addNormalQuestion(NormalQuestion normalQuestion){
        normalQuestionList.add(normalQuestion) ;
    }

    public List<NormalQuestion> getNormalQuestionList() {
        return normalQuestionList;
    }
}
