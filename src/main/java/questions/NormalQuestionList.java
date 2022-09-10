package  questions ;

import questions.NormalQuestion;
import java.util.ArrayList;
import java.util.List;

public class NormalQuestionList {
    private List<NormalQuestion> normalQuestionList = new ArrayList<>() ;

    public NormalQuestionList(){
    }

    public NormalQuestionList(List<NormalQuestion> normalQuestionList) {
        this.normalQuestionList = normalQuestionList;
    }
    public void addNormalQuestion(NormalQuestion normalQuestion){
        normalQuestionList.add(normalQuestion) ;
    }

    public List<NormalQuestion> getNormalQuestionList() {
        return normalQuestionList;
    }
}
