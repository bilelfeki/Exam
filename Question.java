public class Question implements questionInterface{
    private String enonce ; 
    private int difficulte=50 ; 

    /* define the question State */ 
    Question(String enonce){
        this.enonce=enonce ; 
    }
    
    /*define the difficulty of the question */
    public void setDifficulte(int difficulte){
        this.difficulte = difficulte ; 
    }
    /*get the difficulty of the question */ 
    public int getDifficulte(){
        return this.difficulte ; 
    }
    /*get the state of the question */ 
    public String getEnonce(){
        return this.enonce;  
    }
}