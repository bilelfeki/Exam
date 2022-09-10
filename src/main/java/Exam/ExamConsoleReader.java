package Exam;

import Config.ExamConfig;
import questions.NormalQuestion;
import questions.NormalQuestionList;
import questions.QCM;
import questions.QCMList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamConsoleReader {
    private Scanner scanner = new Scanner(System.in);
    private Exam exam ;

    private QCMList QCMQuestionList =new QCMList();
    private NormalQuestionList normalQuestionList = new NormalQuestionList() ;
    private NormalQuestion normalQuestion;
    public ExamConsoleReader() {
        System.out.println("Welcome Dear Teacher");
        Scanner scanner = new Scanner(System.in);
    }

    public QCM CreateQCM(){

        String questionText;
        String questionChoice ;
        boolean isQuestionChoiceTrue ;

        QCM QCM ;
        Map<String,Boolean> choiceList =new HashMap<>() ;


        System.out.println("Initializing a QCM ...");
        System.out.println("Enter your question ... ");

        questionText=scanner.nextLine();
        for(int i=0 ; i<ExamConfig.QCMChoiceNumber;i++){
            System.out.println("Enter a choice for the QCM ... ");
            questionChoice = scanner.nextLine() ;
            System.out.println("is this choice true <true/false>");

            isQuestionChoiceTrue=scanner.hasNextBoolean() ;
            scanner.nextLine();
            choiceList.put(questionChoice,isQuestionChoiceTrue);

        }
        QCM = new QCM(questionText,choiceList) ;
        return QCM ;
    }
    private void addQCMToQCMList(QCM QCM){
        QCMQuestionList.addQCM(QCM);
    }
    private void addNormalQuestionToNormalQuestionList(NormalQuestion normalQuestion){
        normalQuestionList.addNormalQuestion(normalQuestion);
    }
    public NormalQuestion CreateNormalQuestion(){

        System.out.println("Initializing a Normal Question ...");


        String questionText;
        String questionResponse ;
        System.out.println("Enter your Normal Question  ... ");
        questionText = scanner.nextLine() ;
        System.out.println("Enter the response Expected ... ");
        questionResponse = scanner.nextLine() ;
        normalQuestion = new NormalQuestion(questionText,questionResponse);
        return normalQuestion ;
    }
    public Exam  CreateAnExam(){
        for(int i=0;i< ExamConfig.QCMQuestionNumber;i++){
            addQCMToQCMList(CreateQCM());
        }

        for(int i=0;i<ExamConfig.NormalQuestionNumber;i++){
            addNormalQuestionToNormalQuestionList(CreateNormalQuestion());
        }
        return new Exam(QCMQuestionList,normalQuestionList) ;
    }

}
