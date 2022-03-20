package level1.부족한_금액_계산하기;

// 2022-03-20 시작 - 해결 ( int, long 정확히 보고 하기)
// https://programmers.co.kr/learn/courses/30/lessons/82612

public class Solution {

    public static void main(String[] args) {
        int price = 3; // 이용료
        int money = 20; // 처음 가지고 있던 금액
        int count = 4; //이용 횟수

        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
        long total = 0;

        for (long i = 1; i <= count; i++) {
            total+=price*i;
        }

        long answer = 0;

        if((total-money)>0){
            answer = total-money;
        }



        return answer;
    }

}
