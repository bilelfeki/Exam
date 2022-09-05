package src.main.java;

public class QCM extends Question {
    private QCMChoice[] reponses ;
    /*
        this class is used to choose a question and 
        a list of choices , each choice contain a response 
        and a value=true/false
    */
    QCM(String enonce, QCMChoice[] reponses){
        super(enonce) ;
        this.reponses =reponses ; 
    }
    void setChoix(QCMChoice[] reponses){
        this.reponses = reponses ; 
    }
}