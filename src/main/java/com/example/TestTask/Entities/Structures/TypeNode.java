package com.example.TestTask.Entities.Structures;

import com.example.TestTask.Entities.TransportData;
import com.example.TestTask.Entities.TransportType;

import java.util.List;

public class TypeNode {
    TransportType type;
    List<DataNode> dataNodes;
    public TypeNode(TransportType type, List<DataNode> dataNodes) {

        this.type = type;
        this.dataNodes = dataNodes;
    }
    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public List<DataNode> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<DataNode> dataNodes) {
        this.dataNodes = dataNodes;
    }
}
