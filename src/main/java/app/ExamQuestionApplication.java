package app;

;
import Exam.Exam;
import Exam.ExamConsolePrinter;
import Exam.ExamConsoleReader;
import output.ExamFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExamQuestionApplication {


    public static void main(String[] args){

        Exam exam ;
        ExamConsoleReader examConsoleReader= new ExamConsoleReader();
        ExamConsolePrinter examConsolePrinter = new ExamConsolePrinter();

        exam =examConsoleReader.CreateAnExam() ;
        examConsolePrinter.setExam(exam);
        try {
            ExamFile examFile=new ExamFile(exam) ;
            examFile.createExam();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        examConsolePrinter.read();
    }
}