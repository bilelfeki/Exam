public class QCM extends Question {
    private Choix[] reponses ;
    /*
        this class is used to choose a question and 
        a list of choices , each choice contain a response 
        and a value=true/false
    */
    QCM(String enonce,Choix[] reponses){
        super(enonce) ;
        this.reponses =reponses ; 
    }
    void setChoix(Choix[] reponses){
        this.reponses = reponses ; 
    }
}