package com.example.TestTask.Entities.Structures;

import com.example.TestTask.Entities.TransportData;

public class DataNode {
    TransportData data;
    public DataNode(TransportData data) {
        this.data = data;
    }

    public TransportData getData() {
        return data;
    }

    public void setData(TransportData data) {
        this.data = data;
    }
}
