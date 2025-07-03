package oop.finalexam.t1;

import java.util.*;

/**
 * Task1 - Final Exam Task
 *
 * This program performs the following:
 *
 * 1. Builds list3 by:
 *    - For each number `n` in list1, access list2 at index (n + 1)
 *    - Add list2[n + 1] + n to list3
 *    - If (n + 1) is out of bounds, print an error and skip
 *
 * 2. Then, removes from list3 all elements at indices specified in list1
 *    (if the index is valid in list3).
 *
 * Example:
 * list1 = [7, 9, 8, 1, 10, 3, 6, 4, 5, 2]
 * list2 = [uqu, dcs, tpo, scm, eyy, tit, aux, hez, xky, zaf, oyj, uwe]
 * 
 * Step 1 → list3 = [xky7, oyj9, zaf8, tpo1, uwe10, eyy3, hez6, tit4, aux5, scm2]
 * Step 2 → Remove elements at indices [7, 9, 8, 1, 10, 3, 6, 4, 5, 2]
 * Final list3 → [xky7]
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7, 9, 8, 1, 10, 3, 6, 4, 5, 2);
        List<String> list2 = Arrays.asList("uqu", "dcs", "tpo", "scm", "eyy", "tit", "aux", "hez", "xky", "zaf", "oyj", "uwe");
        List<String> list3 = new ArrayList<>();

        // Step 1: Build list3
        for (int i = 0; i < list1.size(); i++) {
            int value = list1.get(i);
            int index = value + 1;

            if (index >= list2.size()) {
                continue;
            }

            String combined = list2.get(index) + value;
            list3.add(combined);
        }

        System.out.println("Initial list3: " + list3);

        // Step 2: Remove elements at indices mentioned in list1
        Set<Integer> indicesToRemove = new HashSet<>(list1);
        List<String> finalList3 = new ArrayList<>();

        for (int i = 0; i < list3.size(); i++) {
            if (!indicesToRemove.contains(i)) {
                finalList3.add(list3.get(i));
            }
        }

        System.out.println("Final list3 after removing indexed elements: " + finalList3);
    }
}
