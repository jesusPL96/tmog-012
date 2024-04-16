package org.tfoc;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    List<Integer> valList = new LinkedList();

    public boolean hasCycle(ListNode head) {

        if(valList.contains(head.val)){
            return true;
        } else if (head.next == null){
            return false;
        } else{
            valList.add(head.val);
            return hasCycle(head.next);
        }

    }

}
