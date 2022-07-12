package MaxNumber;

import java.util.*;



class Solution {
    static int listsize;
    //static int[] number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "";
        String num = sc.next();
        String[] list = num.split(",");

        listsize = list.length;  //입력받은 숫자 개수
//        number = new int[listsize]; //개수만큼 배열 선언
//
//        for (int i = 0; i < listsize; i ++) {
//           number[i] = Integer.parseInt(list[i]);//string -> int
//
//        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int i =0;i<listsize;i++){
           // System.out.println(list[i]);
            answer += list[i];
        }
        System.out.println(answer);



    }



}
