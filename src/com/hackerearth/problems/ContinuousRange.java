package com.hackerearth.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ContinuousRange {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String data = br.readLine();
            String[] dataArray = data.split(" ");
            
            int numberOfFriends = Integer.parseInt(dataArray[0]);
            int totalMoney = Integer.parseInt(dataArray[1]);
            int counter = 0;
            int total = 0;
            Set<Integer> checkMoneySet = new HashSet<Integer>();
            int sampleData[] = new int[numberOfFriends];
            for(int j = 0; j < numberOfFriends; j++){            	
            	sampleData[j] = Integer.parseInt(br.readLine());
            }
            
            for(int l = 0; l < sampleData.length-1; l++){
            	if(sampleData[l]+1 == sampleData[l+1]){            		
            		checkMoneySet.add(sampleData[l]);
            		checkMoneySet.add(sampleData[l+1]);
            	}
            }
            
            for(Integer integer : checkMoneySet){
            	total = total + integer;
            }
            
            if(total == totalMoney){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
        }
    }
}


//3
//6 15
//2
//3
//7
//8
//9
//10
//7 45
//1
//2
//3
//4
//5
//6
//7
//8 35
//4
//5
//7
//8
//1
//2
//3
//5


