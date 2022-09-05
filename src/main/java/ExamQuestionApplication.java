package src.main.java;

;
import java.util.Scanner ;
import java.util.ArrayList;

public class ExamQuestionApplication {

    public static void main(String[] args){
        int j,k,nbQcmQuestion,nbNormalQuestion,bareme ;
        String reponseCourant="",choixCourant="" ; 
        boolean x=true ; 

        QCMChoice[] reponses=new QCMChoice[10];
        QCM qcm ; 
        Exam sujet ;
        Scanner scanner = new Scanner(System.in) ; 


        /**********initialise Exam attribute ********* */
        ArrayList<Integer> baremes = new ArrayList<Integer>() ;
        ArrayList<QCM> qcms = new ArrayList<QCM>();
        ArrayList<Question> quests =new ArrayList<Question>() ;
        /************************************************* */

        System.out.println("donner le nombre de question normal") ; 
        nbNormalQuestion=scanner.nextInt() ; 

        /*lire le nombre de src.main.java.QCM   */
        System.out.println("donner le nombre de question Qcm") ; 
        nbQcmQuestion = scanner.nextInt() ;
        /*pour chaque qcm*/ 
        for(int i=0; i<nbQcmQuestion;i++){
            j=i+1 ;
            System.out.println("choisir l'enonce de la question" + j);
            reponseCourant=scanner.next() ; 

            System.out.println("choisir le nombre de réponse possible pour chaque src.main.java.QCM ");
            k=scanner.nextInt() ; 

            /*lire les reponses et leurs valeurs  dans un table "reponses" */  
            for(int h=0;h<k;h++){
                System.out.println("choisir le choix numero"+ h);
                choixCourant = scanner.next() ;
                System.out.println("choisir vrai/faux");
                x=scanner.nextBoolean() ;
                reponses[h]= new QCMChoice(choixCourant,x) ;
            }
            System.out.println("donner le bareme de cette question") ;
            bareme =scanner.nextInt() ;
            qcms.add(new QCM(choixCourant,reponses));
            baremes.add(bareme) ; 

        }

        /*pour chaque src.main.java.Question normal */
        for(int i=0; i<nbNormalQuestion;i++){
            System.out.println("choisir le choix numero" + i + "de la question normale");
            choixCourant = scanner.next() ;
            quests.add(new Question(choixCourant)) ; 
            bareme =scanner.nextInt() ;
            baremes.add(bareme) ; 
        }
        sujet=new Exam(qcms,quests) ;

    }
    /*Remarque 
    le "baremes" est une liste qui  contient le bareme de chaque question 
    dans l'ordre de lecture 
    */
}