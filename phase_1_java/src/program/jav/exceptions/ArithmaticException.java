package program.jav.exceptions;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            int sum =0;
            for(int j=0;j<args.length;j++) {
        
                sum+=Integer.parseInt(args[j]);
        }
                System.out.println("Sum= "+sum);
                
        }
        catch(ArithmeticException nfe)
        {
            System.err.println("One of the command line"+"arguments is not an integer");
        }
        catch(Exception e) { 
            System.out.println(e);
            
        }
    
    }
    }

