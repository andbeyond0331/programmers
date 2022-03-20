package level1.소수_만들기;

//2022-03-10 시작
//https://programmers.co.kr/learn/courses/30/lessons/12977

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result = solution(nums);

        System.out.println(result);
    }

    public static int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < nums.length; i++) {
            int target = list.get(i);
            for (int j = i+1; j < nums.length; j++) {

            }
        }
        int answer = -1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
