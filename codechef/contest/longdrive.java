// Long Drive
// Chef and Chefina are out on a long road trip.
// The average speed of the car after 
// 10
// 10 hours of driving is 
// 𝑋
// X kilometres per hour.

// Chef wants to achieve an average speed of 
// 𝑌
// Y kilometres per hour. Given that he can travel a maximum of 
// 100
// 100 kilometres in one hour, find the minimum number of additional integer hours required for him to reach the target average speed.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of two space-separated integers 
// 𝑋
// X and 
// 𝑌
// Y — the average speed after 
// 10
// 10 hours of driving and the required average speed.
// Output Format
// For each test case, output on a new line, the minimum number of integer hours required for him to reach the target average speed.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 1225
// 1≤T≤1225
// 50
// ≤
// 𝑋
// <
// 𝑌
// <
// 100
// 50≤X<Y<100
// Sample 1:
// Input
// Output
// 3
// 50 51
// 60 80
// 55 95
// 1
// 10
// 80
// Explanation:
// Test case 
// 1
// 1: The average speed after 
// 10
// 10 hours is 
// 50
// 50 kmph. This means that Chef has travelled a distance of 
// 50
// ⋅
// 10
// =
// 500
// 50⋅10=500 kilometres. If he covers 
// 61
// 61 kilometres in the next hour, his average speed would be 
// (
// 500
// +
// 61
// )
// (
// 10
// +
// 1
// )
// =
// 51
// (10+1)
// (500+61)
// ​
//  =51. Thus, he can achieve the target average speed in one hour.

// Test case 
// 2
// 2: The average speed after 
// 10
// 10 hours is 
// 60
// 60 kmph. This means that Chef has travelled a distance of 
// 60
// ⋅
// 10
// =
// 600
// 60⋅10=600 kilometres. If he covers 
// 100
// 100 kilometres each for the next 
// 10
// 10 hours, his average speed would be 
// (
// 600
// +
// 100
// ⋅
// 10
// )
// (
// 10
// +
// 10
// )
// =
// 80
// (10+10)
// (600+100⋅10)
// ​
//  =80. Thus, he can achieve the target average speed in minimum of 
// 10
// 10 hours.

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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
            int temp1=(b-a)*10;
            int temp2=100-b;
            int result=temp1/temp2;
            result+=(temp1%temp2==0)?0:1;
            System.out.println(result);
		}

	}
}
//Input
// 3
// 50 51
// 60 80
// 55 95
//Output
// 1
// 10
// 80