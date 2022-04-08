import java.util.ArrayList;

public class Sujet{

    private ArrayList<QCM> listQcm = new ArrayList<QCM>();
    private ArrayList<Question> listQNormal = new ArrayList<Question>();
    private ArrayList<Integer> bareme ;

    Sujet(ArrayList<QCM> listQcm,ArrayList<Question> listQNormal,ArrayList<Integer> bareme){
        this.listQcm=listQcm ;
        this.listQNormal=listQNormal ; 
        this.bareme=bareme ;
    }
    public float diffMoy(){
        
        int x=0;
        float diffMoy=0;

        x=listQcm.size() + listQNormal.size() ;
        for(int i=0;i<x;i++){
            diffMoy = listQcm.get(i).getDifficulte() + listQNormal.get(i).getDifficulte() ;
        }
        return diffMoy/x ; 
    } 

}