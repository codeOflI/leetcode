package codeofli.my.leetcode;

/**
 * 链表
 */
public class LinkedList {
    /**
     * @param s ,格式：“1->2->4”
     * @return
     */
   public static ListNode StrToLinkedList(String s){
        String[] split = s.split("->");
        ListNode head = new ListNode(Integer.parseInt(split[0]));
        ListNode cur = head;
        for(int i = 1; i < split.length; i++){
            cur.next = new ListNode(Integer.parseInt(split[i]));
            cur = cur.next;
        }
        return head;
    }

    /**
     * @param
     * @return ,格式：“1->2->4”
     */
    public static String LinkedListToStr(ListNode head){
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while(cur != null){
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        if(sb.toString().equals("")){
            return "null";
        }
        return sb.substring(0,sb.length()-2);
    }
}