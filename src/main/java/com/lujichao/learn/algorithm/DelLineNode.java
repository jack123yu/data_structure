package com.lujichao.learn.algorithm;

public class DelLineNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val){
            return head.next;
        }
        //定一个指针
        ListNode p=head;
       //遍历单连表，查找下一个节点等于目标节点，同时防止空指针
        while (p.next.val!=val&&p.next!=null){
            p=p.next;
        }
        //如果是空指针，直接返回head，若非空，执行删除操作
        if (p.next!=null){
            p.next=p.next.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
