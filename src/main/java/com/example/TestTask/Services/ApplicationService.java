package com.example.TestTask.Services;

import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Entities.Structures.*;
import com.example.TestTask.Entities.TransportData;
import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Entities.TransportType;
import com.example.TestTask.Repositories.FirmRepository;
import com.example.TestTask.Repositories.TransportDataRepository;
import com.example.TestTask.Repositories.TransportTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationService {
    private final TransportTypeRepository transportTypeRepository;
    private final TransportDataRepository transportDataRepository;
    private final FirmRepository firmRepository;

    public Tree createTreeStructure() {
        List<Firm> firmList= firmRepository.findAll();
        List<FirmNode> firmNodes= new ArrayList<>();
        for (Firm firm: firmList) {
            List<TransportData> dataList=transportDataRepository.findAllByFirmId(firm.getId());
            List<KindNode> kindNodes=new ArrayList<>();
            List<TransportKind> kinds=new ArrayList<>();
            for (TransportData data : dataList) {
                if(!kinds.contains(data.getTiptr().getTransportKind())){
                    kinds.add(data.getTiptr().getTransportKind());
                }
            }
            for (TransportKind kind:kinds) {
                List<TypeNode> typeNodes=new ArrayList<>();
                List<TransportType> types=transportTypeRepository.findAllByKindId(kind.getId());

                for (TransportType type:types) {
                    List<DataNode> dataNodes=new ArrayList<>();
                    for (TransportData data:dataList) {
                        if(data.getTiptr().getId().equals(type.getId())){
                            dataNodes.add(new DataNode(data));
                        }
                    }
                    typeNodes.add(new TypeNode(type,dataNodes));
                }
                kindNodes.add(new KindNode(typeNodes,kind));
            }
            firmNodes.add(new FirmNode(firm,kindNodes));
        }
        return new Tree(firmNodes);
    }
}

