
public class sample1 {

	public static void main(String[] args) {

        int n;
         
        for(n = 1; n<= 100;n++) {
        	
        	if(n%2==0 && n%3==0)
        	{
        		System.out.println("The number " + "'" +n+"'"+ " is divisable by two and three.");
        		
        	}
        	else if(n%2==0) {
    			System.out.println("The number "+"'"+n+"'"+" is even." );
    		}
        	else if(n%3==0) {
    			System.out.println("The number "+"'"+n+"'"+" is divisable by three." );
    		}
        	else if(n%1==0) {
        		System.out.println("The number "+"'" +n+"'"+ " is odd.");
        	}
        }                           
    }
}
