package testTcs;

public class TestTcsOne {

	public static void main(String[] args) {
		int N=4; // No of Students 
		int K=3; // No: of classes =2
		int[] Capacity = {1,1,2}; // capacity of each class = {1,1}
		String[] Preference={"1","1,2","3"}; //preference of each student. utmost two consecutive pref {"1","1,2"}	
			
		System.out.println(solution(N,K,Capacity,Preference));

	}
	
	public static String solution(int N,int K,int[] Capacity, String[] Preference) {
			
		int totalCapacity=0;
		for(int itr=0;itr<K;itr++) {
			totalCapacity=totalCapacity+Capacity[itr];
		}
		if(totalCapacity<N) {
			return "No";
		}else {
			return	"Yes";
		}
		
	}

}
