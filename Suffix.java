package data.small;
import java.util.Random;

public class Suffix {

    private String suffix;
    private String mod1code;
    private int mod1min;
    private int mod1max;
    
   public Suffix(String name, String mod1code, int mod1min, int mod1max) {
       this.suffix = name;
       this.mod1code = mod1code;
       this.mod1min = mod1min;
       this.mod1max = mod1max;
   }
   
   public String getSuffix() {
       return suffix;
   }
   
   public String getStat() {
       return mod1code;
   }
   
   public int generateStatValue() {   
       Random rand = new Random();
       return rand.nextInt(mod1max - mod1min + 1) + mod1min;
   }
   
}
    
    
 
