package Exam;

public class ExamConsolePrinter {
    private Exam exam = new Exam() ;

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public ExamConsolePrinter(){
    }
    public void read() {
        exam.getNormalQuestionList()
                .getNormalQuestionList()
                .forEach(normalQuestion -> {
                    System.out.println("yor Normal Question is");
                    System.out.println(normalQuestion.getQuestionText());

                });
        exam.getQCMQuestionList().getAllQCM().forEach(QCM -> {
            System.out.println("yor QCM Question is");
            System.out.println(QCM.getQuestionText());
        });
    }
}
