package level2.package2017팁스타운.짝지어_제거하기;

// 2022-04-14 시작 - stack 버전 시간 초과 해결 !!! 완!!!

import java.util.Stack;

public class Solution_stack1 {

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

            for (int i = 0; i < s.length(); i++) {
                if(stack.size()!=0){
                    if(s.substring(i,i+1).equals(stack.peek())){
                        stack.pop();

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



        if(stack.size()!=0){
            answer = 0;

        }else{
            answer = 1;
        }

        return answer;
    }
}
