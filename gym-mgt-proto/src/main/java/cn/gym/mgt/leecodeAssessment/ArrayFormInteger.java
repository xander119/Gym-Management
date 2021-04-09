package cn.gym.mgt.leecodeAssessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 */
public class ArrayFormInteger {

    public static void main(String[] args) {
        ArrayFormInteger arrayFormInteger = new ArrayFormInteger();
//        List<Integer> integers = arrayFormInteger.addToArrayForm(new int[]{1, 2, 0, 0}, 54);
//        List<Integer> integers = arrayFormInteger.addToArrayForm(new int[]{9, 9, 9, 9}, 1);
//        List<Integer> integers = arrayFormInteger.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 912);
        List<Integer> integers = arrayFormInteger.addToArrayFormOfficial(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 912);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        System.out.println(K % 10);
        int length = A.length;
        int additional = 0;

        List<Integer> integersOne = new ArrayList<>();

        return integersOne;
    }

    public List<Integer> addToArrayFormOfficial(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            res.add(sum);
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
}
