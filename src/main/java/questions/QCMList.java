package src.main.java.questions;

import java.util.ArrayList;
import java.util.List;

public class QCMList {
    private List<QCM> QCMQuestionList=new ArrayList<>();


    QCMList(List<QCM> QCMQuestionList){
        this.QCMQuestionList = QCMQuestionList;
    }

    public List<QCM> getQCMQuestionList() {
        return QCMQuestionList;
    }
    public void setQCMQuestionList(List<QCM> QCMQuestionList) {
        this.QCMQuestionList = QCMQuestionList;
    }


}