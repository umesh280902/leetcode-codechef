// Alt-Tab
// Gigi got bored and started to open/reopen some programs on his computer.
// By reopening a program, we mean that the program was previously opened, wasn't closed in the meantime, and is brought into attention again.

// After a while, Gigi wants to know the order in which the programs show up if he were to press alt + tab.
// Note that the alt + tab function displays a list of all unique active programs where the most recently opened or reopened program occupies the top of the list.

// Given that Gigi opened/reopened 
// 𝑁
// N programs where the name of the 
// 𝑖
// 𝑡
// ℎ
// i 
// th
//   program is denoted by 
// 𝑆
// 𝑖
// S 
// i
// ​
//  , find the order in which the programs are displayed when pressing alt + tab.

// To keep the output dimensions small, you must print only the last two characters from each program name. Please refer to the output format for details.

// Input Format
// The first line has a single integer 
// 𝑁
// N, the number of programs that were opened/reopened by Gigi.
// 𝑁
// N lines will follow, each containing 
// 𝑆
// 𝑖
// S 
// i
// ​
//  , the name of the program. Note that the programs are in chronological order, that is, 
// 𝑆
// 𝑖
// +
// 1
// S 
// i+1
// ​
//   was opened/reopened after 
// 𝑆
// 𝑖
// S 
// i
// ​
//  .
// Output Format
// Print the programs in the order that they would appear if alt + tab would be pressed after opening/reopening all the programs that were given in the input.

// To keep the output dimensions small, you must print only the last two characters from each program name.
// For example if the order is EXCEL, DOCS, CHROME with EXCEL on the top of the list, you should print ELCSME.

// Constraints
// 1
// ≤
// 𝑁
// ≤
// 4
// ⋅
// 1
// 0
// 4
// 1≤N≤4⋅10 
// 4
 
// 2
// ≤
// ∣
// 𝑆
// 𝑖
// ∣
// ≤
// 45
// 2≤∣S 
// i
// ​
//  ∣≤45
// 𝑆
// 𝑖
// S 
// i
// ​
//   consists of uppercase english alphabet letters only.
// Sample 1:
// Input
// Output
// 9
// NAUTILUS
// FIREFOX
// GEDIT
// FIREFOX
// NAUTILUS
// WINE
// GIMP
// TERMINAL
// WINE
// NEALMPUSOXIT
// Explanation:
// After opening/reopening the programs in the given order, the alt + tab operation would produce the following list of programs:

// NAUTILUS
// FIREFOX NAUTILUS
// GEDIT FIREFOX NAUTILUS
// FIREFOX GEDIT NAUTILUS (FIREFOX goes in front)
// NAUTILUS FIREFOX GEDIT
// WINE NAUTILUS FIREFOX GEDIT
// GIMP WINE NAUTILUS FIREFOX GEDIT
// TERMINAL GIMP WINE NAUTILUS FIREFOX GEDIT
// WINE TERMINAL GIMP NAUTILUS FIREFOX GEDIT
// Thus, based on the final list, you need to print the string NEALMPUSOXIT.

// Sample 2:
// Input
// Output
// 2
// YDK
// IDK
// DKDK
// Explanation:
// After opening/reopening the programs in the given order, the alt + tab operation would produce the following list of programs:

// YDK
// IDK YDK
// Thus, based on the final list, you need to print the string DKDK.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		LinkedHashSet<String> list=new LinkedHashSet<>();
        for(int i=0;i<size;i++){
            String str=sc.next();
            if(list.contains(str)){
                list.remove(str);
            }
            list.add(str);
        }
        StringBuilder sb=new StringBuilder();
        ArrayList<String> arrayList=new ArrayList<>(list);
        for(int i=arrayList.size()-1;i>=0;i--){
            String str=arrayList.get(i);
            sb.append(str.substring(str.length()-2));
        }
        System.out.println(sb.toString());
		

	}
}

//Input
// 9
// NAUTILUS
// FIREFOX
// GEDIT
// FIREFOX
// NAUTILUS
// WINE
// GIMP
// TERMINAL
// WINE


//Output
// NEALMPUSOXIT