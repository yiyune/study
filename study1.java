package org.example;

public class study1 {
    public static void main(String[] args) {


//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "hello world";
        System.out.println("s1 = " + s1);
        String s2 = "1234";
        System.out.println("s2 = " + s2);

//      1-1. equals
        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("hi");
        System.out.println(s3.equals(s5));
        System.out.println(s3 == s5);

//      1-2. indexOf (데이터의 위치를 표시함 0 부터)
        String s6 = "hello! world!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!") + 1));

//      1-3. replace (지정 데이터를 변경할수 있음)
        String s7 = s6.replace("hello","bye");
        System.out.println("s7 = " + s7);

//      1-4. substring(원하는 위치의 값을 불러옴)
        System.out.println(s7.substring(0,3));
        System.out.println(s7.substring(0, s7.indexOf("!")+1));



//      1-5. toUpperCase (모두 대문자로 변경시켜줌)
        System.out.println(s7.toUpperCase());



//      2. 자료형 - StringBuffer (데이터를 추가함(주로 데이터 변화가 자주 있는 작업일 경우 사용하는 것이 좋음 ))
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b;
        System.out.println(a);
        System.out.println(a == bak);


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "나는";
        myArray3[1] = " ";
        myArray3[2] = "할수있다!";

        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);



    }
}