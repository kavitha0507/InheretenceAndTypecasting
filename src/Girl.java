public class Girl extends person {
    static double ageFactor = 1.2;
    public Girl(String aName){
        name  = "Ms." +aName;
    }
    public String talk(){
        return("Hello! "+ walk());

    }
    public String walk(){
        return ("I walking now.");
    }
    public static double lifeSpan(){
        return(lifeSpan * ageFactor);
    }


}
