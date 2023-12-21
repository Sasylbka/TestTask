package com.example.TestTask.Entities.Structures;

import com.example.TestTask.Entities.Firm;

import java.util.List;

public class FirmNode {
    Firm firm;
    List<KindNode> kindNodes;

    public FirmNode(Firm firm, List<KindNode> kindNodes) {
        this.firm = firm;
        this.kindNodes = kindNodes;
    }

    public void setKindNodes(List<KindNode> kindNodes) {
        this.kindNodes = kindNodes;
    }

    public List<KindNode> getKindNodes() {
        return kindNodes;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }
}
