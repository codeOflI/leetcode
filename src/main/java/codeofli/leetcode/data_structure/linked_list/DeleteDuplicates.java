package codeofli.leetcode.data_structure.linked_list;

public class DeleteDuplicates {
    /**
     * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                cur.next = cur.next.next;
                continue;
            }
            cur = cur.next;
        }
        return  head;
    }
}
