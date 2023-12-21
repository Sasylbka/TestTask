package com.example.TestTask.Services;

import com.example.TestTask.Entities.DTO.TransportTypeDTO;
import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Entities.TransportType;
import com.example.TestTask.Repositories.TransportKindRepository;
import com.example.TestTask.Repositories.TransportTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransportTypeService {
    private final TransportTypeRepository transportTypeRepository;
    private final TransportKindRepository transportKindRepository;
    public void addType(TransportTypeDTO transportTypeDTO){
        TransportType type=toTransportType(transportTypeDTO);
        transportTypeRepository.save(type);
    }
    public void deleteType(Long typeId){
        transportTypeRepository.deleteById(typeId);
    }
    public void updateType(TransportTypeDTO typeDTO){
        TransportType type = toTransportType(typeDTO);
        type.setId(typeDTO.getId());
        transportTypeRepository.update(type.getId(),type.getTname(),type.getTransportKind().getId(),type.getPrizngr());
    }

    public TransportType toTransportType(TransportTypeDTO transportTypeDTO){
        TransportType type = new TransportType();
        type.setTname(transportTypeDTO.getTname());
        type.setPrizngr(transportTypeDTO.getPrizngr());
        TransportKind kind=transportKindRepository.findByFullname(transportTypeDTO.getVidtName());
        type.setTransportKind(kind);
        return type;
    }
}
