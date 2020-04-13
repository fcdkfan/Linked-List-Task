package com.dhovtvin.task.service;

import com.dhovtvin.task.model.Node;

import java.util.List;

public interface NodeService {
    /**
     * Split given linked list into two reverse ordered lists:
     *     - that contain only odd elements;
     *     - that contain only even elements;
     *
     * @param head
     *          pointer to head of the list
     * @return array that contains 2 elements:
     *     - first: head of list that contain only odd elements;
     *     - second: head of list that contain only even elements;
     */
    Node[] splitList(Node head);

    /**
     * <b>implemented this method also because didn't get clearly what should be in array: node or linked list </b>
     *
     * Split given linked list into two reverse ordered lists:
     *     - that contain only odd elements;
     *     - that contain only even elements;
     *
     * @param head
     *          pointer to head of the list
     * @return array that contains 2 elements:
     *     - first: list that contain only odd elements;
     *     - second: list that contain only even elements;
     */
    List[] splitListVersion2(Node head);

    /**
     * Transforms given list into string.
     *
     * @param head
     *          pointer to head of the list
     * @return String representation of the list
     */
    String print(Node head);
}
