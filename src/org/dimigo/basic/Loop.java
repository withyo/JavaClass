package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기
        for(int i = 2; i<=9;i++){
            for(int j = 1; j<=9; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.printf("\n");
        }

        // 2. for-each 문

        int[] arr = {1,2,3,4,5};    // == int arr[]
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int value : arr){
            System.out.print(value + " ");
        }

        //엔플라잉 멤버 출력
        String[] idol = {"이승협", "차훈", "김재현", "권광진"};
        for(String member : idol){
            System.out.println(member);
        }

        // while, do~while 문
        // 메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<< 간식 선택 >>");
            System.out.println("1. 치킨");
            System.out.println("2. 냉면");
            System.out.println("3. 피자");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("치킨");
                    break;
                case 2: System.out.println("냉면");
                    break;
                case 3: System.out.println("피자");
                    break;
                case 9: System.out.println("종료합니다");
                    scanner.close();
                    break;
                default: System.out.print("없는 메뉴입니다");

            }
        } while(menu != 9);

    }
}
