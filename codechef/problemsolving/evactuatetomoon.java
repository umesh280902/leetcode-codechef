// EVacuate to Moon
// Pesla needs to charge 
// 𝑁
// N cars before sending them to space. The 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   car has an energy capacity 
// 𝐴
// 𝑖
// A 
// i
// ​
//   Watt-hours.

// There are 
// 𝑀
// M power outlets. The 
// 𝑗
// 𝑡
// ℎ
// j 
// th
//   outlet provides a power of 
// 𝐵
// 𝑗
// B 
// j
// ​
//   Watt.
// If an outlet can charge at most one car and a car can be charged by at most one outlet, find the maximum total energy (in Watt-hours) stored in all cars after 
// 𝐻
// H hours.

// Note:

// A power outlet cannot charge a different car even after completely charging a car.
// Energy is the product of power and time. For instance, a car can store 
// 1
// 1 Watt-hour of energy if it is charged at a power station with 
// 1
// 1 Watt power for 
// 1
// 1 hour.
// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, the number of test cases.
// The first line of each test case contains 
// 3
// 3 space-separated integers 
// 𝑁
// N, 
// 𝑀
// M, and 
// 𝐻
// H, the number of cars, the number of power outlets, and the number of hours respectively.
// The second line of each test case contains 
// 𝑁
// N space-separated integers, the energy capacities (in Watt-hour) of the 
// 𝑁
// N cars.
// The third line of each test case contains 
// 𝑀
// M space-separated integers, the power (in Watt) of the 
// 𝑀
// M power outlets.
// Output Format
// For each test case, print the maximum total energy (in Watt-hours) stored in all cars after 
// 𝐻
// H hours.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1
// 0
// 5
// 1≤T≤10 
// 5
 
// 1
// ≤
// 𝑁
// ,
// 𝑀
// ,
// 𝐻
// ,
// 𝐴
// 𝑖
// ,
// 𝐵
// 𝑖
// ≤
// 1
// 0
// 5
// 1≤N,M,H,A 
// i
// ​
//  ,B 
// i
// ​
//  ≤10 
// 5
 
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 1
// 0
// 5
// 10 
// 5
//  .
// The sum of 
// 𝑀
// M over all test cases won't exceed 
// 1
// 0
// 5
// 10 
// 5
//  .
// Sample 1:
// Input
// Output
// 3
// 1 2 2
// 100
// 20 40
// 2 1 2
// 10 20
// 11
// 3 2 1
// 30 30 30
// 40 20
// 80
// 20
// 50
// Explanation:
// Test case 
// 1
// 1: We use the second power outlet to charge the car. After 
// 2
// 2 hours, 
// 40
// ⋅
// 2
// =
// 80
// 40⋅2=80 watt-hours of energy is stored in the car.

// Test case 
// 2
// 2: We use the power outlet to charge the second car. After 
// 2
// 2 hours, 
// 11
// ⋅
// 2
// =
// 22
// 11⋅2=22 watt-hours of energy is generated but since the car has the capacity of 
// 20
// 20, it will store only 
// 20
// 20 watt-hours of energy.

// Test case 
// 3
// 3: We use the first power outlet to charge the first car and second outlet to charge the second car. After 
// 1
// 1 hour, the first car will store 
// 30
// 30 watt-hours of energy (due to its maximum capacity) and second car will store 
// 20
// 20 watt-hours of energy.

// Thus, the cars will store a total of 
// 50
// 50 watt-hours of energy.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        while(testCases-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int h=sc.nextInt();
            long nr[]=new long[n];
            long mr[]=new long[m];
            for(int i=0;i<n;i++) nr[i]=sc.nextLong();
            for(int i=0;i<m;i++) mr[i]=sc.nextLong();
            Arrays.sort(nr);
            Arrays.sort(mr);
            for(int i=0;i<m;i++) mr[i]=mr[i]*h;
            long res=0;
            int j=n-1;
            for(int i=m-1;i>=0&&j>=0;i--){
                res=res+Math.min(mr[i],nr[j]);
                j--;
            }
            System.out.println(res);
            
            
        }
	}   
}


//Input
// 3
// 1 2 2
// 100
// 20 40
// 2 1 2
// 10 20
// 11
// 3 2 1
// 30 30 30
// 40 20


// output
// 80
// 20
// 50