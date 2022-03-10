package level1.신고_결과_받기;

//https://programmers.co.kr/learn/courses/30/lessons/92334

import java.util.Vector;

class Solution_practice {

    public static void main (String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = solution(id_list, report, k);
        for (int num:result
             ) {
            System.out.println(num);
        }
    }
    public static int[] solution(String[] id_list, String[] report, int k) {

        //필드

        //id_list == 이용자의 ID가 담긴 문자열 배열
        //report == 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열
        //k == 정지 기준이 되는 신고 횟수

        //제한 사항

        // 2 ≤ id_list의 길이 ≤ 1,000
        //1 ≤ id_list의 원소 길이 ≤ 10
        //id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
        //id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
        //1 ≤ report의 길이 ≤ 200,000
        //3 ≤ report의 원소 길이 ≤ 21
        //report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
        //예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
        //id는 알파벳 소문자로만 이루어져 있습니다.
        //이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
        //자기 자신을 신고하는 경우는 없습니다.
        //1 ≤ k ≤ 200, k는 자연수입니다.
        //return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.

        int[] count = new int[id_list.length]; //신고 횟수
        int[] mail = new int[id_list.length]; // 보낼 메일


        for (int i = 0; i < id_list.length; i++) {
            count[i] = 0;
        }

        Vector<String> newReport = new Vector<>();

        for (int i = 0; i < report.length; i++) {

            int isThere = 0;


            for (int j = 0; j < newReport.size(); j++) {


                if(report[i].equals(newReport.get(j)) ){
                    System.out.println("report["+i+"] == newReport.get["+j+"] : " + report[i]+" == "+newReport.get(j));


                    ++isThere;
                }

            }
            if(isThere==0){
                newReport.add(report[i]);
                System.out.println("isThere==0 : " + report[i]);

            }


        }

        //새로운 신고목록 준비 완료(중복 제거)
        for (int i = 0; i < newReport.size(); i++) {

            for (int j = 0; j < id_list.length; j++) {
                String[] strings = newReport.get(i).split(" ");
                if(strings[1].equals(id_list[j]) ){
                    count[j]++;
                }
            }

        }

        for (int i = 0; i < count.length; i++) {
            System.out.println("count["+i+"] : " + count[i]);
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i]>=k){
                for (int j = 0; j < newReport.size(); j++) {
                    String[] names = newReport.get(j).split(" ");
                    if(names[1].equals(id_list[i])){
                        for (int l = 0; l < id_list.length; l++) {
                            if(names[0].equals(id_list[l])){
                                System.out.println("names[0] == id_list["+l+"] : " + names[0] + " == " + id_list[l]);
                                mail[l]++;
                            }
                        }
                    }
                }
//                String[] names = newReport.get(i).split(" ");
////                for (int j = 0; j < names.length; j++) {
////                    System.out.println("i : " + i + ", names : " + names[j]);
////                }
//                
//                if(names[1].equals(id_list[i])){
//                    
//                }
            }
        }

        return mail;
//
//
//        int[] answer = {};
//        return answer;
    }
}

