package level1.SummerWinter_Coding2018.소수_만들기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4};
        int[] nums = {1,2,7,6,4};
        System.out.println(solution(nums));

    }

    public static int solution(int[] nums) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);

        }
        list.sort(Comparator.naturalOrder());


        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                for (int k = j+1; k < list.size(); k++) {
                    int first = list.get(i);
                    int second = list.get(j);
                    int third = list.get(k);
                    int count = 0;
                    int triple = first+second+third;
                    for (int l = 1; l <=Math.sqrt(triple) ; l++) {
                        if(triple%l==0){
                            count++;
                        }
                        if(count>2){
                            break;
                        }
                    }
                    if(count==1){
                        answer++;
                    }

                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
