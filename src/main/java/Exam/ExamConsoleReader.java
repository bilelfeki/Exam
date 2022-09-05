package Exam;

import questions.NormalQuestion;
import questions.QCM;
import questions.QCMList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamConsoleReader {
    private Scanner scanner = new Scanner(System.in);
    private Exam exam ;

    private QCMList QCMQuestionList =new QCMList();
    private NormalQuestion normalQuestion;
    private Map<NormalQuestion,Integer> NormalQuestionsMaxPoints=new HashMap<>();
    private Map<QCMList,Integer> QCMQuestionMaxPoint = new HashMap<>() ;

    public ExamConsoleReader() {
        Scanner scanner = new Scanner(System.in);
    }

    public void CreateQCM(){

        String questionText;
        Integer numberOfChoice = 4 ;
        String questionChoice ;
        boolean isQuestionChoiceTrue ;

        QCM QCM ;
        Map<String,Boolean> choiceList =new HashMap<>() ;


        System.out.println("Welcome Dear Teacher");
        System.out.println("Initializing a QCM ...");
        System.out.println("Enter your question ... ");

        questionText=scanner.nextLine();
        for(int i=0 ; i<numberOfChoice;i++){
            System.out.println("Enter a choice for the QCM ... ");
            questionChoice = scanner.nextLine() ;
            System.out.println("is this choice true <true/false>");

            isQuestionChoiceTrue=scanner.hasNextBoolean() ;
            scanner.nextLine();
            choiceList.put(questionChoice,isQuestionChoiceTrue);

        }
        /**
         * instantiate a QCM
         */
        QCM = new QCM(questionText,choiceList) ;
        /**
         * add the question to QCMList
         */
        QCMQuestionList.addQCM(QCM);
    }

    public void CreateNormalQuestion(){
        System.out.println("Welcome Dear Teacher");
        System.out.println("Initializing a Normal Question ...");


        String questionText;
        String questionResponse ;
        System.out.println("Enter your Normal Question  ... ");
        questionText = scanner.nextLine() ;
        System.out.println("Enter the response Expected ... ");
        questionResponse = scanner.nextLine() ;
        normalQuestion = new NormalQuestion(questionText,questionResponse);
    }


}
