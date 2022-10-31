
package org.example;

import java.util.Arrays;

public class study4 {
    public static void main(String[] args) {


//      1. 비트 논리 연산자
                System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        System.out.println( "===== AND 연산자 ======="); // 둘다 1일경우 1로 출력
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result = " + result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(result)));

//      1-2. OR 연산자 (|)
        System.out.println( "===== OR 연산자 ======="); // 둘중 하나만 1일경우 1로 출력
        result = num1 | num2;
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(result)));


//      1-3. XOR 연산자 (^)
        System.out.println( "===== XOR 연산자 =======");// 둘중 하나의 값이 다릉경우 1로 같을 경우 0으로 출력

        result = num1 ^ num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n" , Integer.parseInt(Integer.toBinaryString(result)));



//      1-4. 반전 연산자 (~)
        System.out.println( "===== 반전 연산자 =======");// 값을 반전시켜 출력됨
        num1 = 5;

        result = ~num1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));


//      2. 비트 이동 연산자
                System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int numA = 3;
        result = numA << 1;

        System.out.println("result = "+ result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      2-2. >> 연산자
        result = numA >> 1;

        System.out.println("result = "+ result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));


            }

        }
