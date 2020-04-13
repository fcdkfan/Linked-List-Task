package com.dhovtvin.task;

import com.dhovtvin.task.model.Node;
import com.dhovtvin.task.service.NodeServiceImpl;

import java.util.LinkedList;

public class Task {

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);


        node.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

        NodeServiceImpl nodeService = new NodeServiceImpl();
        Node[] nodes = nodeService.splitList(node);

        System.out.println(nodeService.print(nodes[0]));
        System.out.println(nodeService.print(nodes[1]));

        LinkedList[] array = nodeService.splitListVersion2(node);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
