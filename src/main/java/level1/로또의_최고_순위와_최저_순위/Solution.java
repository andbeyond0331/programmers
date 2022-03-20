package level1.로또의_최고_순위와_최저_순위;

// 2022-03-10 시작 - 성공

// https://programmers.co.kr/learn/courses/30/lessons/77484

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {




    public int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = new int[2];

        ArrayList<Integer> mine = new ArrayList<>();
        ArrayList<Integer> winners = new ArrayList<>();
        ArrayList<Integer> compareMineWinners = new ArrayList<>();
        ArrayList<Integer> compareZero = new ArrayList<>();

        for (int i = 0; i < lottos.length; i++) {
            mine.add(lottos[i]);
            winners.add(win_nums[i]);
            compareMineWinners.add(lottos[i]);
            compareZero.add(lottos[i]);
        }
        mine.sort(Comparator.naturalOrder());
        winners.sort(Comparator.naturalOrder());
        compareMineWinners.sort(Comparator.naturalOrder());
        compareZero.sort(Comparator.naturalOrder());

        if(mine.contains(0)){ // 손상된 번호가 있을 때

            int amIWon = 0;
            ArrayList<Integer> zero = new ArrayList<>();
            zero.add(0);

            compareMineWinners.removeAll(winners); //로또 번호와 일치하는 번호가 사라진 내 꺼
            compareZero.removeAll(zero); //0이 사라진 내꺼


            answer[0] = compareZero.size()+compareMineWinners.size()-5;
            if(compareZero.size()==0){
                answer[1] = 6;
            }else{
                answer[1] = compareMineWinners.size()+1;
            }




        }else{ //손상된 번호가 없을 때
            int amIWon = 0;
            for (int i = 0; i < mine.size(); i++) {
                if(winners.contains(mine.get(i))){
                    amIWon++;
                }
            }

            if(amIWon==1 || amIWon ==0){
                answer[0]=6;
                answer[1]=6;
            }else{
                answer[0] = 7-amIWon;
                answer[1] = 7-amIWon;
            }


        }

        return answer;
    }
}
