package src.main.java;

public class QCMChoice {
    private String choice ;
    private boolean value ; 
    /*
        this class take choice of a src.main.java.QCM
        and it's value: true/false
    */
    QCMChoice(String choice, boolean value){
        this.choice = choice ; 
        this.value =value ;
    }
}