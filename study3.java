package org.example;

import com.sun.org.apache.xpath.internal.objects.XString;

public class study3 {
    public static void main(String[] args) {
// Java 프로그래밍 - 여러가지 연산자_1



//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;



//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println(numZ++);// numZ++ 의 경우 기본 "numZ 값에 1씩 을 더할게~" 라고 말하는것이다
        System.out.println(numZ);

        numZ = 1;
        System.out.println(++numZ);// ++numZ 의 경우 기본 1을 numZ 에 더할게~"라고 말하는것이다
        System.out.println(numZ);

        //따라서 +,- 연산자가 앞이냐 뒤냐 에 따라 상황에 맞게 다르게 사용할수 있다.

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB); // A 가 B 보다 크냐?
        System.out.println(numA < numB); // A 가 B 보다 작냐?
        System.out.println(numA == numB);// A 와 B 의 같은가?
        System.out.println(numA != numB);// A 와 B 가 다른가?


//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 == 0)); // 양쪽 데이터가 모두 true 일 때 결과값이 true
        System.out.println((10 > 9) || (1 == 0)); // 양쪽 데이터중 한쪽이라도 true일 경우 결과 값이 true


//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;
        num1 += num2; // num1 += num2 는 num1 = num1 + num2 와 같음
        System.out.println("num1 = " + num1);
        num1 -= num2;
        num1 *= num2;

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "yes":"no";
        // a == 100 의 값이 참일 경우 yes 를 아닐경우 no를 콜론을 이용하여 지정해줌
        System.out.println("aResult = " + aResult);

    }

}
