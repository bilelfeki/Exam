package src.main.java;

import src.main.java.questions.NormalQuestion;
import src.main.java.questions.QCMList;

import java.util.HashMap;
import java.util.Map;

public class Exam {

    private QCMList QCMQuestionList;
    private NormalQuestion normalQuestion;
    private Map<NormalQuestion,Integer> NormalQuestionsMaxPoints=new HashMap<>();
    private Map<QCMList,Integer> QCMQuestionMaxPoint = new HashMap<>() ;

    public Exam(QCMList QCMQuestionList, NormalQuestion normalQuestion, Map<NormalQuestion, Integer> normalQuestionsMaxPoints, Map<QCMList, Integer> QCMQuestionMaxPoint) {
        this.QCMQuestionList = QCMQuestionList;
        this.normalQuestion = normalQuestion;
        NormalQuestionsMaxPoints = normalQuestionsMaxPoints;
        this.QCMQuestionMaxPoint = QCMQuestionMaxPoint;
    }

    public Exam(QCMList QCMQuestionList, NormalQuestion normalQuestion) {
        this.QCMQuestionList = QCMQuestionList;
        this.normalQuestion = normalQuestion;
    }
}