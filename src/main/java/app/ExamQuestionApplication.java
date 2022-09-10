package app;

;
import Exam.ExamConsolePrinter;
import Exam.ExamConsoleReader;

public class ExamQuestionApplication {

    public static void main(String[] args){
        ExamConsoleReader examConsoleReader= new ExamConsoleReader();
        ExamConsolePrinter examConsolePrinter = new ExamConsolePrinter();
        examConsolePrinter.setExam(examConsoleReader.CreateAnExam());
        examConsolePrinter.read();

    }
}