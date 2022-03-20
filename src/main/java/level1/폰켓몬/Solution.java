package level1.폰켓몬;

// 2022-03-20 시작 - 해결
// https://programmers.co.kr/learn/courses/30/lessons/1845

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){


        List list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int answer = 0;
        if(nums.length/2>list.size()){
            answer = list.size();
        }else{
            answer = nums.length/2;
        }



        return answer;
    }
}
