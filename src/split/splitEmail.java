package split;

public class splitEmail {

public static void main( ) {
		    int count=0;
		   int iterativeValue = 2;
		    String email="jobinmon88@gmail.com";
			String[] emailStr=email.split("@");
			Boolean a= emailStr[0].contains("+");
		   if(!a)
			{
			String[] leftStr=emailStr[0].split("+");
			while(count<=iterativeValue){ 
				count=Integer.parseInt(leftStr[1]);
	    	    email= leftStr[0]+"+"+count+emailStr[1];    		
	    		count++;
			}
			}
			else
			{
				while(count<=iterativeValue){    		
    	   		email=emailStr[0]+"+"+count+emailStr[1];    		
		        count++;
			}
		
	}
		System.out.println(email);	
	}
	}




