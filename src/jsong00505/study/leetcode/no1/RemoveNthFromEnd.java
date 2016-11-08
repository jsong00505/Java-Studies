package jsong00505.study.leetcode.no1;

import java.util.HashMap;

/**
 * Created by jsong on 11/4/16.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 *
 * beats 4.29%
 *
 */
public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        HashMap<Integer, ListNode> resultMap = new HashMap<>();
        int count = 0;
        while(temp != null) {
            resultMap.put(count++, temp);
            temp = temp.next;
        }
        System.out.println(count);
        // reassign temp to head
        temp = head;

        // count is the ListNode's size
        for(int i=0;i<count-n-1;i++) {
            temp = temp.next;
        }

        if(count == n && n == 1) {
            head = null;
        } else if(count == n){
            head = temp.next;
        } else {
            temp.next = temp.next.next;
        }

        return head;
    }
}
