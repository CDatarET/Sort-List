# Sort Linked List in Java

This project provides a simple Java implementation to sort a **singly linked list** using an auxiliary list and built-in Java sorting.

## Problem Description

Given the head of a singly linked list, sort the list in ascending order and return its head.

This implementation uses a basic strategy:

1. Traverse the list and copy all node values into an ArrayList.
2. Sort the ArrayList.
3. Rewrite the sorted values back into the original linked list.

> Note: This approach uses extra space and does not follow the constant space requirement for advanced solutions like Merge Sort.

---

## Example

### Input

```
ListNode head = new ListNode(4);
head.next = new ListNode(2);
head.next.next = new ListNode(1);
head.next.next.next = new ListNode(3);
```

## Output
```
1 -> 2 -> 3 -> 4
```

---
