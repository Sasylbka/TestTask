package com.example.TestTask.Services;

import com.example.TestTask.Entities.DTO.TransportDataDTO;
import com.example.TestTask.Entities.DTO.TransportTypeDTO;
import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Entities.TransportData;
import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Entities.TransportType;
import com.example.TestTask.Repositories.FirmRepository;
import com.example.TestTask.Repositories.TransportDataRepository;
import com.example.TestTask.Repositories.TransportKindRepository;
import com.example.TestTask.Repositories.TransportTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class TransportDataService {
    private final TransportDataRepository transportDataRepository;
    private final TransportKindRepository transportKindRepository;
    private final TransportTypeRepository transportTypeRepository;
    private final FirmRepository firmRepository;

    public void addData(TransportDataDTO data){
        transportDataRepository.save(toTransportData(data));
    }
    public void deleteData(Long dataId){
        transportDataRepository.deleteById(dataId);
    }
    public void updateData(TransportDataDTO dataDTO){
        TransportData data=toTransportData(dataDTO);
        data.setUin(dataDTO.getUin());
        transportDataRepository.update(data.getUnts(),data.getTiptr().getId(),data.getFirm().getId(),data.getGrp(),data.getNormt(),data.getDatasp(),data.getUin());
    }

    public TransportData toTransportData(TransportDataDTO transportDataDTO){
        TransportData transportData= new TransportData();
        transportData.setUnts(transportDataDTO.getUnts());
        transportData.setTiptr(transportTypeRepository.findByTname(transportDataDTO.getTiptrName()));
        transportData.setFirm(firmRepository.findByTlgr(transportDataDTO.getFirm()));
        transportData.setGrp(transportDataDTO.getGrp());
        transportData.setNormt(transportDataDTO.getNormt());
        transportData.setDatasp(transportDataDTO.getDatasp());
        return transportData;
    }

}
