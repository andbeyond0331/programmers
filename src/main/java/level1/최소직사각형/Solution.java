package level1.최소직사각형;

//2022-03-20 시작 - 해결
// https://programmers.co.kr/learn/courses/30/lessons/86491

public class Solution {

    public static void main(String[] args) {
        int[][] sizes={{60, 50},{30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution(sizes));


    }

    public static int solution(int[][] sizes) {

        for (int i = 0; i < sizes.length; i++) { // sizes 가로 세로를 더 짧은 애, 더 긴 애
            if(sizes[i][0]>sizes[i][1]){
                int bigger = sizes[i][0];
                int smaller = sizes[i][1];
                sizes[i][0] = smaller;
                sizes[i][1] = bigger;

            }
        }

        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {

            if(sizes[i][0]>maxWidth){
                maxWidth = sizes[i][0];
            }
            if(sizes[i][1]>maxHeight){
                maxHeight = sizes[i][1];
            }

        }

        int answer = maxHeight*maxWidth;
        return answer;
    }

}
