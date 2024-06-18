// Chef and Coupon
// Read problem statements in Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
// Chef wants to order food from a food delivery app. He wishes to order once today, and buy three items costing 
// 𝐴
// 1
// ,
// 𝐴
// 2
// A 
// 1
// ​
//  ,A 
// 2
// ​
//   and 
// 𝐴
// 3
// A 
// 3
// ​
//   rupees, respectively. He'll also order once tomorrow, when he'll buy three items costing 
// 𝐵
// 1
// ,
// 𝐵
// 2
// B 
// 1
// ​
//  ,B 
// 2
// ​
//   and 
// 𝐵
// 3
// B 
// 3
// ​
//   rupees, respectively. There is an additional delivery charge of rupees 
// 𝐷
// D for each order.

// He notices that there is a coupon on sale, which costs rupees 
// 𝐶
// C. If he buys that coupon, the delivery charges on any day, on an order of rupees 
// 150
// 150 or more shall be waived (that is, the 
// 𝐷
// D rupees will not be added, if the sum of the costs of the items is 
// ≥
// 150
// ≥150).

// Note that Chef is ordering the three items together on each day, so the delivery charge is charged only once each day. Also, note that it's only needed to buy the coupon once to avail the delivery fee waiver on both days.

// Should Chef buy the coupon? Note that Chef shall buy the coupon only if it costs him strictly less than what it costs him without the coupon, in total.

// ###Input:

// The first line of the input contains a single integer 
// 𝑇
// T, denoting the number of test cases.
// The first line of each test case contains two space-separated integers 
// 𝐷
// D and 
// 𝐶
// C, denoting the delivery charge, and the price of the coupon, respectively.
// The second line of each test case contains three space-separated integers 
// 𝐴
// 1
// ,
// 𝐴
// 2
// A 
// 1
// ​
//  ,A 
// 2
// ​
//   and 
// 𝐴
// 3
// A 
// 3
// ​
//  , denoting the prices of the food items that Chef plans to order on Day 
// 1
// 1, respectively.
// The third line of each test case contains three space-separated integers 
// 𝐵
// 1
// B 
// 1
// ​
//  , 
// 𝐵
// 2
// B 
// 2
// ​
//   and 
// 𝐵
// 3
// B 
// 3
// ​
//  , denoting the prices of the food items that Chef plans to order on Day 
// 2
// 2, respectively.
// ###Output: For each test case, output YES if Chef should buy the coupon, and NO otherwise, in a separate line.

// ###Constraints

// 1
// ≤
// 𝑇
// ≤
// 1
// 0
// 4
// 1≤T≤10 
// 4
 
// 1
// ≤
// 𝐷
// ,
// 𝐶
// ≤
// 100
// 1≤D,C≤100
// 1
// ≤
// 𝐴
// 1
// ,
// 𝐴
// 2
// ,
// 𝐴
// 3
// ≤
// 100
// 1≤A 
// 1
// ​
//  ,A 
// 2
// ​
//  ,A 
// 3
// ​
//  ≤100
// 1
// ≤
// 𝐵
// 1
// ,
// 𝐵
// 2
// ,
// 𝐵
// 3
// ≤
// 100
// 1≤B 
// 1
// ​
//  ,B 
// 2
// ​
//  ,B 
// 3
// ​
//  ≤100
// Explanation:
// Testcase 1: On the first day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 100
// +
// 50
// +
// 10
// )
// =
// 160
// (100+50+10)=160. On the second day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 80
// +
// 80
// +
// 80
// )
// =
// 240
// (80+80+80)=240.

// If Chef buys the coupon he shall save the delivery charge on both days, but the coupon shall cost him rupees 
// 100
// 100 extra. In total, it shall cost him 
// (
// 160
// +
// 240
// +
// 100
// )
// =
// 500
// (160+240+100)=500.

// Without the coupon, Chef will have to pay the delivery charges for both days, which shall cost him a total of rupees 
// (
// 160
// +
// 240
// +
// 90
// +
// 90
// )
// =
// 580
// (160+240+90+90)=580.

// Thus, it's better for Chef to buy the coupon.

// Testcase 2: On the first day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 100
// +
// 100
// +
// 100
// )
// =
// 300
// (100+100+100)=300. On the second day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 10
// +
// 20
// +
// 30
// )
// =
// 60
// (10+20+30)=60.

// If Chef buys the coupon he shall save the delivery charge on only the first day, but the coupon shall cost him rupees 
// 30
// 30 extra. In total, it shall cost him 
// (
// 300
// +
// 60
// +
// 30
// (300+60+30 (coupon cost) 
// +
// 30
// +30 (delivery cost for second day)
// )
// =
// 420
// )=420.

// Without the coupon, Chef will have to pay the delivery charges for both days, which shall cost him a total of rupees 
// (
// 300
// +
// 60
// +
// 30
// (300+60+30 (delivery cost for first day)
// +
// 30
// +30 (delivery cost for second day)
// )
// =
// 420
// )=420.

// Since it shall cost him the same amount in both the cases, Chef shall not buy the coupon.

// Explanation:
// Testcase 1: On the first day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 100
// +
// 100
// +
// 100
// )
// =
// 300
// (100+100+100)=300. On the second day, Chef plans on ordering three food items, costing a total of rupees 
// (
// 10
// +
// 20
// +
// 30
// )
// =
// 60
// (10+20+30)=60.

// If Chef buys the coupon he shall save the delivery charge on only the first day, but the coupon shall cost him rupees 
// 45
// 45 extra. In total, it shall cost him 
// (
// 300
// +
// 60
// +
// 45
// (300+60+45 (coupon cost) 
// +
// 30
// +30 (delivery cost for second day)
// )
// =
// 435
// )=435.

// Without the coupon, Chef will have to pay the delivery charges for both days, which shall cost him a total of rupees 
// (
// 300
// +
// 60
// +
// 30
// (300+60+30 (delivery cost for first day)
// +
// 30
// +30 (delivery cost for second day)
// )
// =
// 420
// )=420.

// Since it shall cost him strictly more amount when he buys the coupon, Chef shall not buy the coupon.
/* package codechef; // don't place package name! */

//Om Namah Shivayah 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int d, c, i, a[] = new int[3], b[] = new int[3], Asum = 0, Bsum = 0, cwc, cwd;
            d = sc.nextInt();
            c = sc.nextInt();
            for (i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
                Asum += a[i];
            }
            for (i = 0; i < 3; i++) {
                b[i] = sc.nextInt();
                Bsum += b[i];
            }
            cwd = Asum + Bsum + d + d;
            if (Asum < 150) Asum += d;
            if (Bsum < 150) Bsum += d;
            cwc = Asum + Bsum + c;
            if (cwc < cwd) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}

// Sample 1:
// Input
// 2
// 90 100
// 100 50 10
// 80 80 80
// 30 30
// 100 100 100
// 10 20 30
// Output
// YES
// NO


// Sample 2:
// Input
// 1
// 30 45
// 100 100 100
// 10 20 30
// Output
// NO