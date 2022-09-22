package Exam;

import Config.ExamConfig;
import exceptions.InvalidQCMChoiceException;
import questions.NormalQuestion;
import questions.NormalQuestionList;
import questions.QCM;
import questions.QCMList;
import validators.ConsoleValidator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamConsoleReader {
    private final Scanner scanner = new Scanner(System.in);
    private final QCMList QCMQuestionList =new QCMList();
    private final NormalQuestionList normalQuestionList = new NormalQuestionList() ;
    public ExamConsoleReader() {
        System.out.println("Welcome Dear Teacher");
    }

    public QCM CreateQCM()  {

        String questionText;
        String questionChoice ;

        String isQuestionChoiceTrue ;
        boolean isQuestChoiceTrue = false ;


        QCM QCM ;
        Map<String,Boolean> choiceList =new HashMap<>() ;


        System.out.println("Initializing a QCM ...");
        System.out.println("Enter your question ... ");

        questionText=scanner.nextLine();
        for(int i=0 ; i<ExamConfig.QCMChoiceNumber;i++){
            System.out.println("Enter a choice for the QCM ... ");
            questionChoice = scanner.nextLine() ;
            System.out.println("is this choice true <true/false>");

            isQuestionChoiceTrue=scanner.next() ;
            try{
                ConsoleValidator.verifyAStringTrueOrFalse(isQuestionChoiceTrue) ;
                isQuestChoiceTrue = Boolean.parseBoolean(isQuestionChoiceTrue);
            }
            catch (InvalidQCMChoiceException e){
                System.out.println("you Should enter either true or false ");
            }
            scanner.nextLine();
            choiceList.put(questionChoice,isQuestChoiceTrue);

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
        NormalQuestion normalQuestion;
        String questionText;
        String questionResponse ;

        System.out.println("Initializing a Normal Question ...");
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
