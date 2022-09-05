package src.main.java;

import java.util.ArrayList;
import java.util.Map;

public class Exam {

    private ArrayList<QCM> QCMQuestionList = new ArrayList<QCM>();
    private ArrayList<Question> normalQuestionList = new ArrayList<Question>();
    private Map<Question,Integer> questionMaxPoints;

    Exam(ArrayList<QCM> QCMQuestionList, ArrayList<Question> normalQuestionList, Map<Question,Integer> questionMaxPoints){
        this.QCMQuestionList = QCMQuestionList;
        this.normalQuestionList = normalQuestionList;
        this.questionMaxPoints = questionMaxPoints;
    }
    Exam(ArrayList<QCM> QCMQuestionList, ArrayList<Question> normalQuestionList){
        this.QCMQuestionList = QCMQuestionList;
        this.normalQuestionList = normalQuestionList;
    }
}