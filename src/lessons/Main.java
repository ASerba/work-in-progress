package lessons;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
//        System.out.println("Hello");
//            int a = 2;
//            int b = 10;
//
//        System.out.println(b/a);
//
//        char c = 'A';
//        char d = 'A'+ 1;
//        char e = 67;
//
//        System.out.println("char c as ancii code = " + (int)(c));
//        System.out.println("char d as ancii code = " + (int)(d));
//
//        System.out.println("char c as ancii code = " + (c+0));
//        System.out.println("char d as ancii code = " + (d+0));
//
//        System.out.println("------------------------------" );
//
//        System.out.println("char c as char = " + c);
//        System.out.println("char d as char = " + d);
//        System.out.println("char e as char = " + e);
//
//        System.out.println("------------------------------" );
//
//        boolean isTrue = true;
//        Boolean isFalse = 1 != 1;
//        System.out.println("isTrue = " + isTrue);
//        System.out.println("isFalse = " + isFalse);
//
//        System.out.println("------------------------------" );
//
//        System.out.println("true && false = " + (true && false));
//        System.out.println("true && true = " + (true && true));
//        System.out.println("false && false = " + (false && false));
//        System.out.println("false && true = " + (false && true));
//
//        System.out.println("------------------------------" );
//
//        System.out.println("true || false = " + (true || false));
//        System.out.println("true || true = " + (true || true));
//        System.out.println("false || false = " + (false || false));
//        System.out.println("false || true = " + (false || true));

//        int a = 6;
//
//        if (a % 2 == 0) {
//            System.out.println("a is even");
//        }
//        else {
//            System.out.println("a is odd");
//        }
//
//        int b = 7;
//
//        if (b % 2 == 0) {
//            System.out.println("b is even");
//        }
//        else if (b == 5) {
//            System.out.println("b = 5");
//        }
//        else {
//            System.out.println("b is odd");
//        }
//      for( int i = 48; i < 58; i = i + 1) {
//          if (i == 54) {
//         continue;
//          }
//          System.out.println((char)i);
//          }
//      int a = 2;
//      int b = 3;
//        System.out.println((int)(Math.pow(2, Math.abs(a+b)))); //делает инт из даблаб возведение в степень



//      МАССИВЫ ARRAYS урок 3

//        int [] arr1 = {1, 2, 5, -6, 4};
//
//        int[] arr2 = new int[5];
//        arr2[0] = 1;
//        arr2[1] = 2;
//        arr2[2] = 3;
//        arr2[3] = 4;
//        arr2[4] = 5;
//
//        // \t - tab , \n - new line
//
//        System.out.println(Arrays.toString(arr2));
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print("\ti" + i + " arr2[i]= " + arr2[i]);
//        }
//        System.out.println();
//        System.out.println("Печатаем массив в одну строку переводя его в стринг Arrays.toString(arr2)");
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("continue пропускает действие");
//        for (int i = 0; i < arr2.length; i++) {
//
//            if (arr2[i] == 3) {
//                continue;
//            }
//            System.out.println(arr2[i]);
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print((arr2[i] = arr2[i]*2) + ", ");
//        }
//        System.out.println("\n" + Arrays.toString(arr2));
//        System.out.println("массив равный null");
//        String[] strings = null;
//        System.out.println(strings);
//        System.out.println("массив не равный null, но пустой, инициализированный через {}");
//        strings = new String[] {};
//        System.out.println(strings);
//        System.out.println(strings.length);
//        System.out.println(Arrays.toString(strings));
//        System.out.println("массив не равный null, НЕ пустой, инициализированный через new String[4]");
//        strings = new String[4];
//        System.out.println(Arrays.toString(strings));
//        System.out.println("length=" + strings.length);


//      TWO DIMENSIONAL ARRAY

//        int [][] c1 = {
//         {1, 2, 3},
//         {10, 11, 12}
//        };
//        System.out.println(c1[1][1]);
//        System.out.println(Arrays.toString(c1[1]));
//        System.out.println(Arrays.deepToString(c1));
//        System.out.println();

        //      THREE DIMENSIONAL ARRAY

//        int [][][] c2 = {
//                {{1, 2, 3},{10, 11, 12}},
//                {{10, 11, 12},{13, 14, 15}}
//        };
//        System.out.println(c2[1][1][1]);
//        System.out.println(Arrays.toString(c2[0][1]));
//        System.out.println(Arrays.deepToString(c2));

//        int [] arr = {-6, 5 , -89 , 6 , 78 , -100};
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println(String.format("min element is %d" , min));
//        System.out.println(String.format("max element is %d" , max));
//
//        int k = 0;
//        while (k  < 10) {
//            System.out.println(k + " ");
//            k++;
//        }
//
//        int j = 0;
//        while (j  < 10) {
//            System.out.println(j + " ");
//            j++;
//        }

// Console input

//        Scanner input = new Scanner (System.in);
//        int sum = 0;
//        int number = 1;
////        while (number !=0) {
////            System.out.print("Enter num, to stop enter 0: ");
////            number = input.nextInt();
////            sum+=number;
////            System.out.println("sum so far is: " + sum);
////        }
//
//        number = 8;
//        do {
//            System.out.print("Enter num, to stop enter 0: ");
//            number = input.nextInt();
//            sum+=number;
//            System.out.println("sum so far is: " + sum);
//        } while (number != 0);

//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        System.out.println(array.length);
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
//        System.out.println("sum = " + sum);

//              4 STRINGS

        String s1 = "Apple";
        String s2 = new String ("Apple"); /// method is not used
        String s3 = "Apple";
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1.charAt(0)); // A
        System.out.println(s1.indexOf('l')); // 3
        System.out.println(s1.indexOf('l',3+1)); // -1
        System.out.println(s1.toUpperCase().indexOf('P')); // 1
        System.out.println(s1.toLowerCase().indexOf('p')); // 1
        System.out.println(s1.lastIndexOf('p')); // from the end - 2
        System.out.println(s1.contains("ppl")); // true
        String a = "a";
        System.out.println(String.join(" ", a, "1", "2", "3"));
        String b = "1 2 3 4 5";
        String g = "a | b | c | d | e";
        String[] c = b.split(" ");
        String[] e = g.split("\\|");
        System.out.println(Arrays.toString(c)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(e)); // [a ,  b ,  c ,  d ,  e]
        int[] arr = {1, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println("new string from array arr = " + Lesson04.arrayToString(arr));



        } /// end main

    // FUNCTIONS

    static void printString () {};



    } // end lessons.Main

