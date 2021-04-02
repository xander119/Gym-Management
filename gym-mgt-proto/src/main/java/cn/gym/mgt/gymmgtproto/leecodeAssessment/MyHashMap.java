package cn.gym.mgt.gymmgtproto.leecodeAssessment;

class MyHashMap {

    Node[] nodes;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {

    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (nodes == null || nodes.length == 0) {
            nodes = new Node[10009];
            nodes[0] = new Node(key, value, null);
        } else {
            boolean hasPut = false;
            for (int i = 0; i < nodes.length; i++) {
                Node node = nodes[i];
                if (node == null) {
                    nodes[i] = new Node(key, value, null);
                }
                if (node != null && node.key == key) {
                    node.value = value;
                    hasPut = true;
                    break;
                }
            }
            if (!hasPut) {
                nodes[nodes.length - 1].next = new Node(key, value, null);
            }
        }

    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        for (Node node : nodes) {
            return node.key == key ? node.value : -1;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        Node previous = null, current = null;
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            if (node.key == key) {
                nodes[i - 1].next = nodes[i + 1];
            }
        }
    }

    private int getIndex(int key) {
        int hash = Integer.hashCode(key);
        hash ^= (hash >>> 16);
        return hash % nodes.length;

    }

    public class Node {
        int key;
        int value;
        Node next;

        public Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // myHashMap 现在为 [[1,1]]
        myHashMap.put(2, 2); // myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.get(1);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.get(3);    // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.put(2, 1); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        myHashMap.get(2);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMap.remove(2); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        myHashMap.get(2);    // 返回 -1（未找到），myHashMap 现在为 [[1,1]]

        for (Node node : myHashMap.nodes) {
            System.out.println(node.toString());
        }
    }
}
