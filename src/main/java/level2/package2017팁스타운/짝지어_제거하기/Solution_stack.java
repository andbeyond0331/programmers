package level2.package2017팁스타운.짝지어_제거하기;

// 2022-04-14 시작 - stack 버전 시간초과남

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_stack {

    public static void main(String[] args) {
        String s = "baabaa";
//        String s = "cdcd";
        System.out.println(solution(s));

    }

    public static int solution(String s){



        int answer = -1;
        String compare = s;


        int count = 0;

        Stack<String> stack = new Stack<>();
//        while(compare.length()!=0){
            for (int i = 0; i < s.length(); i++) {
                if(stack.size()!=0){
                    if(s.substring(i,i+1).equals(stack.peek())){
                        String removeTarget = stack.pop();
                        System.out.println(i+"compare = " + compare);
                        compare= compare.replaceAll(removeTarget+removeTarget, "");
                        System.out.println(i+"compare after = " + compare);

                        count++;


                    }else{

                        stack.push(s.substring(i,i+1));
                    }
                }else{

                    stack.push(s.substring(i,i+1));
                }
            }
            if(count==0){
                answer =0;

            }

//        }

        if(compare.length()!=0){
            answer = 0;

        }else{
            answer = 1;
        }

        return answer;
    }
}
