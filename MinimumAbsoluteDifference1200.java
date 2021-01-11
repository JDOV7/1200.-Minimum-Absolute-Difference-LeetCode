/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAbsoluteDifference1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        System.out.println(arr.length);
        List<List<Integer>> lListDif = new ArrayList();
        Arrays.sort(arr);
        int iDifMin = 99999999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) != 0 && Math.abs(arr[i] - arr[j]) < iDifMin) {
                    iDifMin = Math.abs(arr[i] - arr[j]);
                    if (iDifMin == 1) {
                        break;
                    }
                }
            }
            if (iDifMin == 1) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) != 0 && Math.abs(arr[i] - arr[j]) == iDifMin) {
                    lListDif.add(new ArrayList(Arrays.asList(arr[i], arr[j])));
                    break;
                } else if (Math.abs(arr[i] - arr[j]) > iDifMin) {
                    break;
                }

            }

        }
        return lListDif;
    }
}
