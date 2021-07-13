package testTcs;

import java.util.HashMap;
import java.util.Map;

public class TestTcsOne {

	public static void main(String[] args) {
		int N=4; // No of Students 
		int K=3; // No: of classes =2
		int[] Capacity = {1,2,3}; // capacity of each class = {1,1}
		String[] Preference={"1","1,2","2","2,3"}; //preference of each student. utmost two consecutive pref {"1","1,2"}	
		//solution for Class distribution problem 	
		System.out.println(solution(N,K,Capacity,Preference));

	}
	
	public static String solution(int N,int K,int[] Capacity, String[] Preference) {
			
		int totalCapacity=0;
		for(int itr=0;itr<K;itr++) {
			totalCapacity=totalCapacity+Capacity[itr];
		}
		System.out.println("totalCapacity:"+totalCapacity);
		if(totalCapacity<N) {
			return "No";
		}else {
			Map<String,Integer> classCapacity = new HashMap<String,Integer>();
			for(int itr=0;itr<K;itr++) {
				classCapacity.put("capacity_"+(itr+1), Capacity[itr]);
			}
			System.out.println(classCapacity.toString());
			for(int itr=0;itr<N;itr++) {
				String studentPreference=Preference[itr];
				if(studentPreference.contains(",")) {
					String[] tempPrefs=studentPreference.split(",");
					String firstPref=tempPrefs[0];
					String secondPref=tempPrefs[1];
					int firstCapacity=classCapacity.get("capacity_"+firstPref);
					firstCapacity--;
					if(firstCapacity<0) {
						int secondCapacity=classCapacity.get("capacity_"+secondPref);
						secondCapacity--;
						classCapacity.put("capacity_"+secondPref, secondCapacity);
					}else {
						classCapacity.put("capacity_"+firstPref, firstCapacity);
					}					
				}else {
					int firstCapacity=classCapacity.get("capacity_"+studentPreference);
					firstCapacity--;
					classCapacity.put("capacity_"+studentPreference, firstCapacity);
				}
				
			}
			System.out.println(classCapacity.toString());
			for (var entry : classCapacity.entrySet()) {
			    if(entry.getValue()<0) {
			    	return "No";
			    }
			}
			return "Yes";
		}
		
	}

}
