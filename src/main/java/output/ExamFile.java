package output;

import Exam.Exam;
import questions.NormalQuestion;
import questions.QCM;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

import static Config.ExamConfig.ExamFileOutputPath;

public class ExamFile {

    private Exam exam = new Exam() ;
    private final  FileWriter fileWriter = new FileWriter(ExamFileOutputPath) ;
    private final BufferedWriter ExamOutput =new BufferedWriter(fileWriter) ;

    public String stars = "***********************************************";

    public ExamFile() throws IOException {}

    public ExamFile(Exam exam) throws IOException {
        this.exam =exam ;
    }

    public void createExam(){

        try{
            createNormalQuestionPresentation() ;
            addNormalQuestionToExamFile() ;
            createQCMPresentation();
            addQCMQuestionToExamFile() ;
            ExamOutput.close();
        }
        catch (IOException e){
            System.out.println("ERROR while Creating Exam File");
        }
    }

    private void addNormalQuestionToExamFile(){
        List<NormalQuestion> normalQuestionList = exam.getNormalQuestionList().getNormalQuestionList();

        IntStream.range(0,normalQuestionList.size()).forEach(
                index ->{
                    try {
                        ExamOutput.write("\n"+ "Q" + index + "-" + normalQuestionList.get(index).getQuestionText() + "\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }
    private void addQCMQuestionToExamFile(){
        List<QCM> QCMQuestionList = exam.getQCMQuestionList().getQCMQuestionList();

        IntStream.range(0, QCMQuestionList.size()).forEach(
                index ->{
                    try {
                        ExamOutput.write("\n"+ "Q" + index + "-" + QCMQuestionList.get(index).getQuestionText()+ "\n"  );
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }
    private void createNormalQuestionPresentation() throws IOException {
        String normalQuestionWord="Normal Questions" ;
        String normalQuestionPresentation ="\n" +  stars + "\n" + normalQuestionWord + "\n" + stars +"\n" ;
        ExamOutput.write(normalQuestionPresentation);
    }

    private void createQCMPresentation() throws IOException {
        String QCMQuestionWord="QCM Questions" ;
        String QCMQuestionPresentation = "\n" + stars + "\n" + QCMQuestionWord + "\n" + stars +"\n" ;
        ExamOutput.write(QCMQuestionPresentation);
    }

}
