# Java Data Structures: Singly Linked List and Arrays

Welcome to the Java Data Structures repository! This repository contains implementations of key data structures in Java, specifically focusing on singly linked lists and arrays.

## Repository Overview

### Singly Linked List

The repository includes code for managing singly linked lists. Key functionalities demonstrated include:
- **Node Definition**: Basic structure for nodes in the linked list.
- **Insertion and Deletion**: Methods to insert and delete nodes at given positions.
- **Traversal**: Methods to traverse and display the linked list.

### Arrays

The repository also contains examples of array manipulations and operations. This includes:
- **Basic Operations**: Examples of common array operations, such as searching, sorting, and updating.

## How to Use

### Singly Linked List

1. **Node Definition**: Defines a `ListNode` class with data and a reference to the next node.
2. **Display Method**: Use the `display` method to print the linked list.
3. **Insertion and Deletion**: Use methods like `DeleteAt` to remove nodes from the list.

### Arrays

1. **Basic Operations**: Review and use provided examples for common array operations.

## Code Examples

### Singly Linked List Example

```java
public class DeleteAtGivenPosition {
    private ListNode head;
    
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public ListNode DeleteAt(ListNode l, int index) {
        if (l == null) return null;
        if (index == 0) {
            return l.next;
        }
        ListNode temp = l;
        ListNode previous = null;
        int count = 0;
        while (temp != null && count < index) {
            previous = temp;
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            previous.next = temp.next;
        }
        return l;
    }

    public static void main(String[] args) {
        DeleteAtGivenPosition dagp = new DeleteAtGivenPosition();
        dagp.head = new ListNode(0);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        dagp.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println("Original Linked List : ");
        dagp.display(dagp.head);
        System.out.println("After deleting the node from linked list at index 1 : ");
        dagp.display(dagp.DeleteAt(dagp.head, 1));
    }
}
```
Soon i will be uploading Doubly , circular , stack and Queue Codes ...
