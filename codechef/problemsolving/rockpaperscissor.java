// Rock Paper Scissor
// Chef and Chefina are playing the famous game of Rock, Paper, Scissors.
// The game consists of 
// 𝑁
// N rounds. In each round, both players choose one of the three moves: Rock, Paper, or Scissors, denoted by R, P, and S respectively.

// If both players play the same move, the current round ends in a draw and neither of them gets a point.
// If one of the players plays Rock and the other plays Scissors, the player who played Rock wins the round and gets a point.
// If one of the players plays Scissors and the other plays Paper, the player who played Scissors wins the round and gets a point.
// If one of the players plays Paper and the other plays Rock, the player who played Paper wins the round and gets a point.
// The winner of the game is the player who gets the maximum number of points after playing all the rounds. If both players have the same number of points, then the game ends in a draw.

// You are given two strings 
// 𝐴
// A and 
// 𝐵
// B, each of length 
// 𝑁
// N, consisting of uppercase English letters R, P, and S, where 
// 𝐴
// 𝑖
// A 
// i
// ​
//   denotes the move made by Chef in the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   round and 
// 𝐵
// 𝑖
// B 
// i
// ​
//   denotes the move made by Chefina in the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   round.

// Find the minimum number of rounds Chef should have played differently to have won the game.

// Input Format
// The first line of input will contain a single integer 
// 𝑇
// T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains an integer 
// 𝑁
// N — the number of rounds.
// The second line contains string 
// 𝐴
// A of length 
// 𝑁
// N denoting the moves played by Chef.
// The third line contains string 
// 𝐵
// B of length 
// 𝑁
// N denoting the moves played by Chefina.
// Output Format
// For each test case, output on a new line, the minimum number of rounds Chef should have played differently to have won the game.

// Constraints
// 1
// ≤
// 𝑇
// ≤
// 7
// ⋅
// 1
// 0
// 4
// 1≤T≤7⋅10 
// 4
 
// 1
// ≤
// 𝑁
// ≤
// 1000
// 1≤N≤1000
// 𝐴
// 𝑖
// ,
// 𝐵
// 𝑖
// ∈
// {
// A 
// i
// ​
//  ,B 
// i
// ​
//  ∈{R, P, S
// }
// }
// The sum of 
// 𝑁
// N over all test cases won't exceed 
// 4
// ⋅
// 1
// 0
// 5
// 4⋅10 
// 5
//  .
// Sample 1:
// Explanation:
// Test case 
// 1
// 1: Chef has a score of 
// 1
// 1 while Chefina has a score of 
// 2
// 2. To win the game, Chef should have played at least 
// 1
// 1 round differently.
// A sequence of moves like RSR would have led in Chef winning the game.

// Test case 
// 2
// 2: Chef has a score of 
// 1
// 1 while Chefina has a score of 
// 0
// 0. Chef is already winning the game.

// Test case 
// 3
// 3: Chef has a score of 
// 0
// 0 while Chefina has a score of 
// 2
// 2. To win the game, Chef should have played at least 
// 2
// 2 rounds differently.
// Note that Chef should have played only 
// 1
// 1 round differently to draw the game but 
// 2
// 2 rounds differently to win.
import java.util.*;


public class rockpaperscissor {
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int games = sc.nextInt();
		
		while(games-- > 0) {
            
            int siz = sc.nextInt();
		    
		    String chef =  sc.next();
		    
		    String chefnia = sc.next();
		    
		    int chefScore = 0;
		    
		    int chefniaScore = 0;
		    
		    for(int i = 0; i < siz; i++) 
		    {
                if(chef.charAt(i) == 'S' && chefnia.charAt(i) == 'P') chefScore++;
		        
		        else if(chef.charAt(i) == 'P' && chefnia.charAt(i) == 'R') chefScore++;
		        
		        else if(chef.charAt(i) == 'R' && chefnia.charAt(i) == 'S') chefScore++;
		        
		        else if(chef.charAt(i) == chefnia.charAt(i)) continue;
		        
		        else chefniaScore++;
		    }
		    
		    if(chefScore > chefniaScore) System.out.println("0");
		    
		    else if(chefScore == chefniaScore) System.out.println("1");
		    
		    else{
                
                int average = (chefScore + chefniaScore)/2;
		        
		        if((chefScore + chefniaScore) % 2 == 0) System.out.println(chefniaScore - average + 1);
		        
		        else System.out.println(chefniaScore - average);
		        
		    }
            
		}
		
		sc.close();
		
	}
}

// Input
// 3
// 3
// RRR
// SPP
// 2
// RP
// SP
// 3
// PSP
// SRP
// Output
// 1
// 0
// 2