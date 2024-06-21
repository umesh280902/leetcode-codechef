// Top Batsmen
// A cricket team consists of 11 players and some are good at batting, others are good at bowling and some of them are good at both batting and bowling. The batting coach wants to select exactly K players having maximum possible sum of scores. Given the batting score of each of the 11 players, find the number of ways in which we can select exactly K players such that the sum of their scores is the maximum possible. Two ways are different if there is a player who is selected in one of them is not in the other. See explanation of sample cases for more clarity.

// Input
// First line contains T, number of test cases ( 1 ≤ T ≤ 100 ). T cases follow, each having 2 lines. First line of each case contains scores of 11 players ( 1 ≤ score ≤ 100 ) and the second line contains K (1 ≤ K ≤ 11)

// Output
// For each test case, output the answer in a new line.

// Sample 1:
// Input
// Output
// 2
// 1 2 3 4 5 6 7 8 9 10 11
// 3
// 2 5 1 2 4 1 6 5 2 2 1
// 6
// 1
// 6
// Explanation:
// Case 1 : Maximum possible sum of scores = 11 + 10 + 9 = 30 and can be achieved only by selecting the last 3 players. Only one possible way.

// Case 2 : Maximum possible sum of scores = 6 + 5 + 5 + 4 + 2 + 2 = 24 and considering the players as p1 p2 p3 ... p11 in that order, the ones with maximum possible sum of scores is as follows
// {p1, p2, p4, p5, p7, p8 }
// {p10, p2, p4, p5, p7, p8 }
// {p1, p2, p10, p5, p7, p8 }
// {p9, p2, p4, p5, p7, p8 }
// {p1, p2, p9, p5, p7, p8 }
// {p10, p2, p9, p5, p7, p8 }

    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int fact( int n ){
        
        if( n == 0 || n == 1 ) return 1;
        
        return fact(n-1) * n;
    }
    
    static int nCr( int n , int r){
        
        return fact(n) / (fact(r) * fact(n - r));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int a [] = new int[11];
		    
		    for (int i = 0 ; i < 11 ; i++ ) {
		        a[i] = sc.nextInt();;
		    }
		    
		    int k = sc.nextInt();
		    
		    HashMap<Integer,Integer> map = new HashMap<>();
		    
		    for( int ele : a ){
		        map.put( ele , map.getOrDefault( ele , 0 ) + 1 );
		    }
		    
		    Arrays.sort( a );
		    
		    HashMap<Integer,Integer> map2 = new HashMap<>();
		    
		    for( int i = 10 ; i > 10 - k ; i--  ){
		        map2.put( a[i] , map2.getOrDefault( a[i] , 0 ) + 1 );
		    }
		    
		    List<Integer> temp = new ArrayList<>();
		    
		    int count = 0;
	
		    for( int i = 10 ; i > 10 - k ; i-- ){
		        if( !temp.contains(a[i]) &&  map.get( a[i] ) > 1 && map2.containsKey(a[i]) ){
		            
		            int tempVar = nCr( map.get( a[i] ) , map2.get( a[i] )  );
		            
		            if( tempVar != 1 ){
		                count += tempVar ;
		            }
		            
		            temp.add( a[i] );
		        }
		    }
		    
		    if( count == 0 ){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(count);
		    }
		}
	}
}
