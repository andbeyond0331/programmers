package level1.없는_숫자_더하기;

// 2022-03-10 시작 - 성공

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
//        int[] numbers = {5,8,4,0,6,7,9};

        int answer = solution(numbers);
        System.out.println(answer);


    }

    public static int solution(int[] numbers) {

        ArrayList original = new ArrayList<>();
        ArrayList newNum = new ArrayList();
        for (int i = 0; i < 10; i++) {
            original.add(i);
        }
        for (int i = 0; i < numbers.length; i++) {
            newNum.add(numbers[i]);
        }
        original.removeAll(newNum);

        int answer = 0;
        for (int i = 0; i < original.size(); i++) {
            answer+= (Integer)original.get(i);
        }
        return answer;
    }
}
