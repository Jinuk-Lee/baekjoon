package MaxNumber;

import java.util.*;

class Solution {
    static int MaxNum;
    static int listsize;
    static int[] number;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        String[] list = num.split(",");

        listsize = list.length;  //입력받은 숫자 개수

        number = new int[listsize]; //개수만큼 배열 선언

        for (int i = 0; i < listsize; i ++) {
           number[i] = Integer.parseInt(list[i]);//string -> int
            System.out.println(number[i]);
            //System.out.println(Arrays.toString(list));
            //[3,30,34,5,9]
        }
            System.out.println(Arrays.toString(list)); //[숫자]


        //System.out.println(list[1]+list[2]); //102


       // solution();
    }

//    public String solution(int[] numbers) {
//        String answer = "";
//
//    }

}
