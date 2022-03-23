package level1.SummerWinter_Coding2018.예산;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
//        int[] d = {1,3,2,5,4};
        int[] d = {2,2,3,3};
//        int budget = 9;
        int budget = 10;
        System.out.println(solution(d,budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < d.length; i++) {
            list.add(d[i]);
        }
        list.sort(Comparator.naturalOrder());

                int count = 0;
                int sums = 0;
                for (int j = 0; j < d.length; j++) {
                    if(sums<budget){
                        if((sums+list.get(j))<budget){
                            sums+=list.get(j);
                            count++;
                        }else if((sums+list.get(j))==budget){
                            count++;
                            break;
                        }else{
                            break;
                        }


                    }
                }

                answer = count;



        return answer;
    }
}
