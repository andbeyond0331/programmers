package level2.package2017팁스타운.짝지어_제거하기;

// 2022-04-13 시작 - 시간초과버전

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        String s = "baabaa";
//        String s = "cdcd";
        System.out.println(solution(s));

    }

    public static int solution(String s){

        List<String> list = new ArrayList<>();

        for (char i = 'a'; i <= 'z' ; i++) {
            list.add(String.valueOf(i)+String.valueOf(i));
        }


        int answer = -1;

        int count = 0;
        while(s.length()!=0){
            for (int i = 0; i < s.length(); i++) {



                if(i<s.length()-1 && s.substring(i,i+1).equals(s.substring(i+1,i+2))){

                    s = s.replaceAll(s.substring(i,i+2),"");

                    count++;
                    break;
                }

            }
            if(count==0){
                answer = 0;
                break;
            }
        }


        if(s.length()==0){
            answer =1;
        }else{
            answer = 0;
        }



        return answer;
    }
}
