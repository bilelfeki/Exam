package questions;

import java.util.ArrayList;
import java.util.List;

public class QCMList {
    private List<QCM> QCMQuestionList=new ArrayList<>();

    public QCMList() {

    }

    QCMList(List<QCM> QCMQuestionList){
        this.QCMQuestionList = QCMQuestionList;
    }

    public List<QCM> getQCMQuestionList() {
        return QCMQuestionList;
    }
    public void setQCMQuestionList(List<QCM> QCMQuestionList) {
        this.QCMQuestionList = QCMQuestionList;
    }
    public  void addQCM(QCM QCM ){
        QCMQuestionList.add(QCM);
    }
    public List<QCM> getAllQCM(){
        return QCMQuestionList ;
    }


}