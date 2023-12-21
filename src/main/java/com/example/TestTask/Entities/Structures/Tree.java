package com.example.TestTask.Entities.Structures;

import java.util.List;

public class Tree {
    List<FirmNode> firmNodes;
    public Tree(List<FirmNode> firmNodes) {
        this.firmNodes = firmNodes;
    }

    public List<FirmNode> getFirmNodes() {
        return firmNodes;
    }

    public void setFirmNodes(List<FirmNode> firmNodes) {
        this.firmNodes = firmNodes;
    }
}
