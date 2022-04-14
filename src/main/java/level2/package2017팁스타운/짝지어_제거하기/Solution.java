package level2.package2017팁스타운.짝지어_제거하기;

// 2022-04-13 시작 - 시간초과

// 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작.
// 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
// 그 다음, 그 둘을 제거한 뒤, 앞 뒤로 문자열을 이어 붙입니다.
// 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
// 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해주세요.

// 성공적으로 수행 시 1, 아닐 시 0 리턴

// 예를 들어, 문자열 S = baabaa
// b aa baa -> bb aa > aa > 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.

import java.util.ArrayList;
import java.util.List;

public class Solution {

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

        String temp = s;

        int count = 0;

        while(temp.length()!=0){
            for (int i = 0; i < list.size(); i++) {
                if(temp.contains(list.get(i))){

                    temp = temp.replaceAll(list.get(i), "");
                    count++;

                }
            }
            if(count ==0){
                answer = 0;
                break;
            }

        }

        if(temp.length()==0){
            answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }
}
