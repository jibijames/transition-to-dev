package hackerearth;

import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) {
		String inputString = "";
		
		Boolean check=true;
		
		int countTestCase=0;
		int totalTestCases=0;
		int sizeOf2DArray=0;
		int inversionCount =0;
		int Xindex=0;
		int Yindex=0;
		int X=0;
		int Y=0;
		
		String[] tempArray = {};
		String[][] inputArray = {};
		// Scanner
        Scanner s = new Scanner(System.in);
                
        if(s.hasNext()){
        	totalTestCases=Integer.parseInt(s.nextLine());
//        	System.out.println("totalTestCases:"+totalTest);
        }
        while(s.hasNext()){
        	inputString=s.nextLine();
        	tempArray=inputString.split(" ");
        	if(check) {
//        		System.out.println("tempArray:"+tempArray[0]);
        		sizeOf2DArray=Integer.parseInt(tempArray[0]);
        		inputArray = new String[sizeOf2DArray][sizeOf2DArray] ;
        		Yindex=0;
        		countTestCase++;
        		check=false;
        	}else {
        		for(Xindex=0;Xindex<sizeOf2DArray;Xindex++) {
        		inputArray[Xindex][Yindex]=tempArray[Xindex];
        		}
        		Yindex++;        		
        	}
//        	if(Yindex==sizeOf2DArray) {
//        		for(Y=0;Y<sizeOf2DArray;Y++) {
//	        		for(X=0;X<sizeOf2DArray;X++) {
//	        			System.out.print(inputArray[X][Y]);
//	        			System.out.print(" ");
//	        		}
//	        		System.out.println();
//        		}
//        	}
        	if(Yindex==sizeOf2DArray) {
        		check=true;
        		inversionCount=0;
        		for(Y=0;Y<sizeOf2DArray-1;Y++) {
	        		for(X=0;X<sizeOf2DArray-1;X++) {
	        			if(Integer.parseInt(inputArray[X][Y])>Integer.parseInt(inputArray[X+1][Y]) ) {
	        				inversionCount++;
	        			}
	        			if(Integer.parseInt(inputArray[X][Y])>Integer.parseInt(inputArray[X][Y+1]) ) {
	        				inversionCount++;
	        			}
	        			if(Integer.parseInt(inputArray[X+1][Y])>Integer.parseInt(inputArray[X+1][Y+1]) ) {
		    				inversionCount++;
		    			}
	        			if(Integer.parseInt(inputArray[X][Y+1])>Integer.parseInt(inputArray[X+1][Y+1]) ) {
	        				inversionCount++;
	        			}
	        			
	        		}
	        		

        		}
        		

        		System.out.println(inversionCount);
        		if(countTestCase==totalTestCases) {
            		break;
            	}
        	}
        	
        	
        }
	}

}
