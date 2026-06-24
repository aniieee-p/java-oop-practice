// ======================== USING all 3 LOOPS in each question. ========
// ========================= Q1 print 1 to 10 
// class Main {
//     public static void main(String[] args) {
//         int n =1;
//         while (n <= 10) {
//             System.out.println(n);
//             n++;
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int n = 1;
//         do {
//             System.out.println(n);
//             n++;
//         }
//         while(n <= 10);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         for (int n = 1; n<=10 ;n++) {
//             System.out.println(n);
//         }   
//     }
// }





// ========================= Reverse Q2 =============================
// class Main {
//     public static void main(String[] args) {
//         int n = 10;
//         while(n >= 1) {
//             System.out.println(n);
//             n--;
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int n = 10;
//         do {
//             System.out.println(n);
//             n--;
//         }
//         while(n>=1);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         for(int i = 10; i>=1 ;i--) {
//             System.out.println(i);
//         }
//     }
// }


// ================== Q3 Print even no. btw 1 to 100 ======================
// class Main {
//     public static void main(String[] args){
//         int i = 1;
//         while(i<=100) {
//             if (i%2==0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             if (i%2==0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//         while(i<=100);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         for(int i = 1; i<=100; i++) {
//             if (i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// ========================= Q13 prime number ====================
// for loop use flag , counter method-no
// public class Main
// {
// 	public static void main(String[] args) {

//         int n = 13;
//         int i;

//         for (i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 System.out.println("Not Prime");
//                 break;
//             }
//         }

//         if (i > n / 2) {
//             System.out.println("Prime");
//         }
//     }
// }


// ==================================== print prime btw 1 to 1000  =========================
// public class Main {

// public static void main(String[] args) {
//     int flag;
//     for(int n = 2; n<=1000; n++) {
//         flag = 0;
//         for(int i = 2; i <= n / 2; i++) {
//             if(n% i == 0) {
//             flag = 1;
//             break;
//             }
//         }
//     if (flag == 0) {
//         System.out.println(n);
//     }
//     }   
// }
// }

// ============================== Q15 Armstrong  number ================================
// public class Main {
//     public static void main(String[] args) {
//         int n = 1634;
//         int k = (int) Math.log10(n) + 1; //no of digits
//         int temp = n;
//         int original = n;
//         int sum = 0;
//         while(temp!= 0){
//             int p = temp % 10;
//             temp = temp / 10;
//             sum = sum + (int) Math.pow(p,k); // sum of digits 
//         }
//         if (original == sum){
//             System.out.println("yes it is Armstrong");
//         }
//         else {
//             System.out.println("No it is not Armstrong");
//         }
//     }
// }


// ============== Q 16 Strong number ======================
// strong number 
public class Master_Loops {
    public static void main(String[] args) {
        int n = 1634;
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int p = temp % 10;
            temp = temp / 10;
            int fact = 1;
            for(int i = 1; i <= p; i++){
                fact *= i;
            }
            sum += fact;
        }
        if (sum == n){
            System.out.println("yes it is Armstrong");
        }
        else {
            System.out.println("No it is not Armstrong");
        }
    }
}