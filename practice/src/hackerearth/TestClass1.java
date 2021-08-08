package hackerearth;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Boolean check=true;
		
		String inputString = "";		
		String lastValue = "";
		
        int countTestCase=0;
        int totalTestCases=0;
        int noOfElements = 0;
        int noOfRotations = 0;
        int index=0;
        int countRotation=0;
        
        // Scanner
        File file = new File("C:\\Users\\jjames\\Personal Files\\DevLearning\\test01.txt");
		Scanner s = new Scanner(file);
//        Scanner s = new Scanner(System.in);
                
        if(s.hasNext()){
        	totalTestCases=Integer.parseInt(s.nextLine());
//        	System.out.println("totalTestCases:"+totalTest);
        }
        
        String[] firstArray = new String[2];
        String[] inputArray = {};
        String[] tempArray = {};
        
//        StringBuffer result = new StringBuffer();
        StringBuilder result=new StringBuilder();
        
        while(s.hasNext()){
        	inputString=s.nextLine();
        	tempArray=inputString.split(" ");        	

        	if(check) {
        		firstArray=tempArray;
        		countTestCase++;
        		check=false;
        	}else{
        		check=true;
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
//                    result.setLength(0);
                    for(index=0; index<inputArray.length; index ++) {
                    	result.append(inputArray[index]+" ");
//                    	System.out.print(inputArray[index]+" ");
                    }
                	System.out.println(result.toString());
            	if(countTestCase==totalTestCases) {
            		break;
            	}

        	}
        	
        }
        s.close();
        
	}

}
