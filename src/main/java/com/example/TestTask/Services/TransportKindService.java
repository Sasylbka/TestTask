package com.example.TestTask.Services;

import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Entities.TransportType;
import com.example.TestTask.Repositories.TransportKindRepository;
import com.example.TestTask.Repositories.TransportTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransportKindService {
    private final TransportKindRepository transportKindRepository;
    public TransportKind addKind(TransportKind kind){
        return transportKindRepository.save(kind);
    }
    public void deleteKind(Long kindId){
        transportKindRepository.deleteById(kindId);
    }
    public void updateKind(TransportKind kind){
        transportKindRepository.update(kind.getId(),kind.getShname(),kind.getFullname());
    }
}
