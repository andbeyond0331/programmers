package level1.신고_결과_받기;

//https://programmers.co.kr/learn/courses/30/lessons/92334
// 2022-03-09 시작

import java.util.Vector;

class Solution {

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

        int[] count = new int[id_list.length]; //신고 횟수
        int[] mail = new int[id_list.length]; // 보낼 메일

        Vector<String> newReport = new Vector<>();

        for (int i = 0; i < report.length; i++) {

            int isThere = 0;


            for (int j = 0; j < newReport.size(); j++) {


                if(report[i].equals(newReport.get(j)) ){

                    ++isThere;
                }

            }
            if(isThere==0){
                newReport.add(report[i]);
                String[] strings = report[i].split(" ");
                for (int j = 0; j < id_list.length; j++) {
                    if(strings[1].equals(id_list[j])){
                        count[j]++;
                        break;
                    }
                }

            }


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

            }
        }

        return mail;

    }
}

