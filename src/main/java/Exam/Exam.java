package Exam;

import questions.NormalQuestionList;
import questions.QCMList;


public class Exam {

    private QCMList QCMQuestionList = new QCMList();
    private NormalQuestionList normalQuestionList = new NormalQuestionList();

    public Exam() {
    }

    public Exam(QCMList QCMQuestionList, NormalQuestionList normalQuestionList) {
        this.QCMQuestionList = QCMQuestionList;
        this.normalQuestionList = normalQuestionList;
    }
    public QCMList getQCMQuestionList() {
        return QCMQuestionList;
    }

    public NormalQuestionList getNormalQuestionList() {
        return normalQuestionList;
    }
}
