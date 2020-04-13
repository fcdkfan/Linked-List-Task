package com.dhovtvin.task.service;

import com.dhovtvin.task.model.Node;

import java.util.LinkedList;


public class NodeServiceImpl implements NodeService {

    @Override
    public Node[] splitList(Node head) {
        Node current = head;
        Node previousHead;
        Node evenHead = null;
        Node oddHead = null;
        while (current != null) {
            int value = current.getValue();
            if (value % 2 == 0) {
                previousHead = evenHead;
                evenHead = new Node(value);
                evenHead.setNext(previousHead);
            } else {
                previousHead = oddHead;
                oddHead = new Node(value);
                oddHead.setNext(previousHead);
            }
            current = current.getNext();
        }

        return new Node[] {oddHead, evenHead};
    }

    @Override
    public LinkedList[] splitListVersion2(Node head) {
        Node current = head;
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();
        while (current != null) {
            int value = current.getValue();
            if (value % 2 == 0) {
                evenList.add(0, value);
            } else {
                oddList.add(0, value);
            }
            current = current.getNext();
        }
        return new LinkedList[] {oddList, evenList};
    }

    @Override
    public String print(Node head) {
        StringBuilder builder = new StringBuilder();
        while(head != null) {
            builder.append(head.getValue()).append("-->");
            head = head.getNext();
        }
        return builder.append("NULL").toString();
    }
}
