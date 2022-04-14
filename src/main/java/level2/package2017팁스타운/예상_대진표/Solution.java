package level2.package2017팁스타운.예상_대진표;

// 2022-04-13 시작

// 게임대회
// N명이 참가하고, 토너먼트
// N명의 참가자는 각각 1번부터 N번을 차례대로 배정 받음

// 게임 참가자 수 N
// 참가자 번호 A
// 경쟁자 번호 B



public class Solution{

    public static void main(String[] args) {

        int N = 8; // 부전승 없음
        int A = 4; //N 이하
        int B = 7; //N 이하

        System.out.println(solution(N, A, B));

    }

    public static int solution(int N, int A, int B){
        int answer = 1;
        if(A>B){
            while(A-1!=B){
                A = Math.round((float)A/(float)2.0);
                B = Math.round((float)B/(float)2.0);
                answer++;
            }
        }else{
            while(A+1!=B){
                A = Math.round((float)A/(float)2.0);
                B = Math.round((float)B/(float)2.0);
                answer++;
            }
        }
        return answer;
    }
}