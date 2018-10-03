import java.util.Random;
public class AnswerKeyGenerator {
    Random answer = new Random();
    public AnswerKeyGenerator(){}
    public void generateMC(int n){
        for(int x = 1; x <= n; x++){
            int ans = answer.nextInt(4) + 1;
            if(ans == 1)
                System.out.printf( "%-3d %5s", x, "A\n");
            if(ans == 2)
            	System.out.printf( "%-3d %5s", x, "B\n");
            if(ans == 3)
            	System.out.printf( "%-3d %5s", x, "C\n");
            if(ans == 4)    
            	System.out.printf( "%-3d %5s", x, "D\n");
        }
    }
    public void generateTF(int n){
    	for(int x = 1; x <= n; x++){
    		int ans = answer.nextInt(2) + 1;
    		if(ans == 1)
    			System.out.printf("%-3d %5s", x, "True\n");
    		if(ans == 2)
    			System.out.printf("%-3d %5s", x, "False\n");
    	}
    }
    
    public static void main(String[]args){
    	System.out.println("Answer Key\n");
    	AnswerKeyGenerator a = new AnswerKeyGenerator();
    	a.generateTF(5);
    	a.generateMC(5);
    }
}


