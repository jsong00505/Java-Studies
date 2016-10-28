package jsong00505.study.leetcode.no1;


public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(7);
		//l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(1);
		
		ListNode result = addTwoNumbers(l1, l2);
		
		System.out.println("MINE");
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
		result = addTwoNumbersSolution(l1, l2);
		
		System.out.println("SOLUTION");
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
	}
	
	/*
	 * 
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = null;
		ListNode result = null;
		boolean upCount = false;
		while(l1 != null || l2 != null) {
			int sum = 0;
			
			if(l1 == null) {
				sum = l2.val;
				l2 = l2.next;
			} else if(l2 == null) {
				sum = l1.val;
				l1 = l1.next;
			} else {
				sum = l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}
			
			if(upCount == true) {
				sum++;
			}
			
			if(sum > 9) {
				upCount = true;
				sum -= 10;
			} else {
				upCount = false;
			}
			
			if(temp == null) {
				result = new ListNode(sum);
				temp = result;
			} else {
				temp.next = new ListNode(sum);
				temp = temp.next;
			}
		}
		
		if(upCount == true) {
			temp.next = new ListNode(1);
		}
		
		return result;
	}
	
	public static ListNode addTwoNumbersSolution(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	public void addNode(int x) {
		next = new ListNode(x);
	}
}