package codeofli.leetcode.point_to_offer.data_structure;


import java.util.ArrayList;
import java.util.List;



public class ReversePrint06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        int[] ans = new int[nums.size()];
        int index = 0;
        for(int i = nums.size() -1; i >= 0 ;i--){
            ans[index++] = nums.get(i);
        }
        return ans;
    }
}