package hackerearth;


import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		
		String inputString = "";		
		String lastValue = "";
		
        int countTestCase=0;
        int totalTestCases=0;
        int noOfElements = 0;
        int noOfRotations = 0;
        int index=0;
        int countRotation=0;
        
        // Scanner
        Scanner s = new Scanner(System.in);
                
        if(s.hasNext()){
        	totalTestCases=Integer.parseInt(s.nextLine());
//        	System.out.println("totalTestCases:"+totalTest);
        }
        
        String[] firstArray = new String[2];
        String[] inputArray = {};
        String[] tempArray = {};
        
        StringBuffer result = new StringBuffer();
        
        while(s.hasNext()){
        	inputString=s.nextLine();
        	tempArray=inputString.split(" ");

        	countTestCase++;

        	if(countTestCase%2==0) {
        		inputArray=tempArray;
        		noOfElements = Integer.parseInt(firstArray[0]);
                noOfRotations = Integer.parseInt(firstArray[1]);

                    for(countRotation=0;countRotation<noOfRotations ;countRotation++) {
                    	lastValue=inputArray[noOfElements-1];
	                    	for(index=noOfElements-1;index>0;index--) {	        	
	                    		inputArray[index]=inputArray[index-1];
	                    	}
                    	inputArray[0]=lastValue;
                    }
                    result.setLength(0);
                    for(index=0; index<inputArray.length; index ++) {
                    	result.append(inputArray[index]+" ");
                    }
                	System.out.println(result.toString());
            	if(countTestCase==(totalTestCases*2)) {
            		break;
            	}

        	}else {
        		firstArray=tempArray;
        	}
        	
        }
        s.close();
        
	}

}
