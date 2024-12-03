public class person {
    String name;
    static int lifeSpan  = 65;
    static double ageFactor = 1.5;
    public person() {
        name = " ";
    }
    public person(String aName) {
        this.name = aName;
    }
    public String getName() {
        return name;
    }
        public void setName(String aName){ name = name;}

    public String toString(){
            return ("Hello My Name Is: " + name);

        }
            public String talk(){
            return ("I have to say nothing.");

        }
        public String walk() {
        return("I have no where to go.");
        }
        public static double lifeSpan(){
        return(lifeSpan * ageFactor);

        }

        }


