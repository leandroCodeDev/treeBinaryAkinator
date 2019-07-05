package model;

import java.io.Serializable;

public class BinaryTree implements Serializable {

    private NodeBinary node;
    private final int cod = 1;

    public BinaryTree() {
        node = new NodeBinary("vive na agua", true);
        node.setLeaveRight("Baleia");
        node.setLeaveLeft("Cachorro");
    }


    public NodeBinary getRoot() {
        return node;
    }
}