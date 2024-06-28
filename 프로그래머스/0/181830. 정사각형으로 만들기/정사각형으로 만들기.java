import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> solution(int[][] arr) {
        int row = arr[0].length;   // 행: 3
        int col = arr.length;       // 열 : 4

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        for (int[] r : arr) {   // 2차원 리스트 생성
            ArrayList<Integer> listRow = new ArrayList<>();
            for (int num : r) {
                listRow.add(num);
            }
            arrList.add(listRow);
        }
        // System.out.println(arrList);

        if (row > col) {  // col에 행의 수와 같아지도록 0추가

            for (int i = 0; i < row - col; i++) {
                ArrayList<Integer> addList = new ArrayList<>();
                for (int j = 0; j < row; j++) {
                    addList.add(0);
                }
                arrList.add(addList);
            }
            return arrList;

        } else if (col > row) {  // row에 열의 수와 같아지도록 0추가
            for (ArrayList<Integer> r : arrList) {
                for (int i = 0; i < col - row; i++) {
                    r.add(0);
                }
            }
            // System.out.println(arrList);
            return arrList;
        }

        return arrList;
    }
}