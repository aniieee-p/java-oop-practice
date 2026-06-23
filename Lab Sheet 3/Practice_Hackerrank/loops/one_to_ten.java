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

class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}