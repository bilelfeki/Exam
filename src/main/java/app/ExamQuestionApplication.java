package app;

;
import Exam.ExamConsoleReader;

public class ExamQuestionApplication {

    public static void main(String[] args){
        ExamConsoleReader examConsoleReader= new ExamConsoleReader();
        //examConsoleReader.CreateQCM();
        examConsoleReader.CreateNormalQuestion();
    }
}