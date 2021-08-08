package hackerearth;

import java.io.File;
import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) throws Exception{
		String inputString = "";
		
		Boolean check=true;
		
		int countTestCase=0;
		int totalTestCases=0;
		int sizeOf2DArray=0;
		int inversionCount =0;
		int row=0;
		int column=0;
		int R=0;
		int C=0;
		int firstElem;
		int secondElem;
		
		String[] tempArray = {};
		String[][] inputArray = {};
		// Scanner
		File file = new File("C:\\Users\\jjames\\Personal Files\\DevLearning\\f6fe6370b15c11ea.txt.clean.txt");
		Scanner s = new Scanner(file);
//        Scanner s = new Scanner(System.in);
                
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
        		row=0;
        		countTestCase++;
        		check=false;
        	}else {
        		for(column=0;column<sizeOf2DArray;column++) {
        		inputArray[row][column]=tempArray[column];
        		}
        		row++;        		
        	}
//        	if(row==sizeOf2DArray) {
//        		for(R=0;R<sizeOf2DArray;R++) {
//	        		for(C=0;C<sizeOf2DArray;C++) {
//	        			System.out.print(inputArray[R][C]);
//	        			System.out.print(" ");
//	        		}
//	        		System.out.println();
//        		}
//        	}	
        	if(row==sizeOf2DArray) {
        		check=true;
        		inversionCount=0;
        		for(R=0;R<sizeOf2DArray;R++) {
	        		for(C=0;C<sizeOf2DArray;C++) {
	        			firstElem=Integer.parseInt(inputArray[R][C]);
	        			for(int j=R;j<sizeOf2DArray;j++) {
		        			for(int i=C;i<sizeOf2DArray;i++) {
			        			secondElem=Integer.parseInt(inputArray[j][i]);
			        			if(firstElem>secondElem) {
			        				inversionCount++;
			        			}
		        			}
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
