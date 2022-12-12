package cci.ch_2_linked_lists;

/* Remove dups from unordered linked list */
public class T_2_2_ReturnKthToLast {

    //    Runtime : O(n)
    //    Memory  : O(1)
    public static Node returnKthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            if (p1.next == null) {
                return null;
            }
            p1 = p1.next;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }


    //    Runtime : O(n)
    //    Memory  : O(n)
    public static Node returnKthToLastRecursively(Node head, int k) {
        NodeSearch nodeSearch = new NodeSearch(k);
        searchKthToLast(head, nodeSearch);
        return nodeSearch.result;
    }

    private static void searchKthToLast(Node node, NodeSearch nodeSearch) {
        if (node == null) {
            return;
        }
        nodeSearch.maxDepth++;
        nodeSearch.currentDepth++;
        searchKthToLast(node.next, nodeSearch);
        if (nodeSearch.maxDepth - nodeSearch.currentDepth + 1 == nodeSearch.resultNodeDistanceToLast) {
            nodeSearch.result = node;
        }
        nodeSearch.currentDepth--;
    }

    static class NodeSearch {
        int maxDepth;
        int currentDepth;
        int resultNodeDistanceToLast;
        Node result;
        public NodeSearch(int resultNodeDistanceToLast) {
            this.resultNodeDistanceToLast = resultNodeDistanceToLast;
        }
    }

}
