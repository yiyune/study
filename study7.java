//Java 프로그래밍 - 다차원 배열
package org.example;

public class study7 {

    public static void main(String[] args) {

        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] myArray = {1,2,3};
        System.out.println("myArray[1] = " + myArray[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i : myArray) {
            System.out.println(i);
        }



        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");
        int[][] myArray2 = {{1,2,3},{4,5,6}}; // 괄호 안 {{행},{열}} 을 뜻 하며 0 붵 시작 이다 현 기준 {{1,2,3},{4,5,6}} 일 때
        System.out.println("myArray2[1][2] = " + myArray2[1][2]);// [1]행[2]열 열에 있는 데이터 [0] 1, 2, 3  이니 즉 "6" 이 나옴
                                                                 //                       [1] 4, 5, 6
                                                                 //                          [0][1][2]

        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++){
                System.out.println(myArray2[i][j]);
            }
        }
        for (int[] ints : myArray2) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }


//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                testArray1[i][j] = 1;

                if (i == j) {
                    testArray1[i][j] = 10;
                }
            }
        }
        for (int[] itemRow: testArray1) {
            for (int itemCol: itemRow) {
                System.out.print(itemCol + " ");
            }
            System.out.println();
        }
    }
}
