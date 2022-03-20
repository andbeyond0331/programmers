package level1.로또의_최고_순위와_최저_순위;

// 2022-03-10 시작

// https://programmers.co.kr/learn/courses/30/lessons/77484

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution_practice {

    //로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의 순위를 정하는 방식입니다.
    //로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다.
    // 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
    //알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다.
    // 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.

    //순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
    //알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
    //3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
    //알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
    //5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
    //민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
    // 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
    //
    //제한사항
    //lottos는 길이 6인 정수 배열입니다.
    //lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
    //0은 알아볼 수 없는 숫자를 의미합니다.
    //0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
    //lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
    //win_nums은 길이 6인 정수 배열입니다.
    //win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
    //win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
    //win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.

    public static void main(String[] args) {
//
//        int[] lottos = {44,1,0,0,31,25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] answer = solution(lottos, win_nums);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }


    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        //lottos == 로또 번호를 담은 배열
        //win_nums == 당첨 번호를 담은 배열

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

        System.out.println("mine");

        for (int i = 0; i < mine.size(); i++) {
            System.out.print(mine.get(i));
        }

        System.out.println("=========");

        System.out.println("winners");

        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
        }

        System.out.println("=========");

        System.out.println("compareMineWinners");

        for (int i = 0; i < compareMineWinners.size(); i++) {
            System.out.print(compareMineWinners.get(i));
        }

        System.out.println("=========");

        System.out.println("compareZero");

        for (int i = 0; i < compareZero.size(); i++) {
            System.out.print(compareZero.get(i));
        }


        System.out.println("=========");

        if(mine.contains(0)){ // 손상된 번호가 있을 때
            
            int amIWon = 0;
            ArrayList<Integer> zero = new ArrayList<>();
            zero.add(0);
            
            compareMineWinners.removeAll(winners); //로또 번호와 일치하는 번호가 사라진 내 꺼
            compareZero.removeAll(zero); //0이 사라진 내꺼

            System.out.println("compareZero 크기 : " + compareZero.size());
            System.out.println("compareMineWinners 크기 : " + compareMineWinners.size());

            answer[0] = compareZero.size()+compareMineWinners.size()-5;
            if(compareZero.size()==0){
                answer[1] = 6;
            }else{
                answer[1] = compareMineWinners.size()+1;
            }


//            if(compareZero.size()==0){
//                answer[0] = 1;
//                answer[1] = 6;
//            }else if(compareZero.size()==1){
//                if(compareMineWinners.size()==5){
//                    answer[0] = 1;
//                    answer[1] = 6;
//                }else{
//                    answer[0] = 2;
//                    answer[1] = 6;
//                }
//            }else if(compareZero.size()==2){
//
//            }
            
            
            

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
