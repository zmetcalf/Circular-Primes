import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

public class CircularPrimes 
{
    
    private int maxCheck;
    private int totalOfCircularPrimes = 0;
    
    public CircularPrimes(int maxCheck) {
        this.maxCheck = maxCheck;
    }
    
    public void findCirclePrimes() {
        
        totalOfCircularPrimes = 0;
        
        for(int i = 2; i <= maxCheck; i++) {
            if(checkPrime(i)) {
                if(checkCircular(i)) {
                    totalOfCircularPrimes++;
                }
            }
        }
    }
    
    public void printAnswer() {
        System.out.printf("The number of circular primes under %d are %d", 
                            maxCheck, totalOfCircularPrimes);
    }
    
    private boolean checkCircular(int checkNum) {
        char[] circleArray = Integer.toString(checkNum).toCharArray();
        
        ArrayList<Character> charArrayList = new ArrayList<Character>();
        
        for(char c : circleArray) {
            charArrayList.add(c);
        }
        
        String test;
        char movingChar;
        
        for(int i = 0; i < charArrayList.size(); i++) {
            movingChar = charArrayList.get(0);
            charArrayList.remove(0);
            charArrayList.add(movingChar);
            test = charArrayList.toArray();
            System.out.println(test);
            if(checkPrime(Integer.valueOf(test)) == false) {
                return false;
            }
        }
        return true;
    }
    
    private boolean checkPrime(int checkNum) {
	    int i = 2;
	    double maxCheck;

	    maxCheck = Math.sqrt((double) checkNum);

	    while(i <= maxCheck) {
	        if(checkNum % i == 0) {
	            return false;
	        }
	        i++;
	    }
	    return true;
	}
}
