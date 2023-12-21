package com.example.TestTask.Services;

import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Repositories.FirmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FirmService {
    private final FirmRepository firmRepository;
    public List<Firm> getAllFirms(){
        return firmRepository.findAll();
    }
    public Firm addFirm(Firm firm){
        return firmRepository.save(firm);
    }
    public void deleteFirm(Long firmId){
        firmRepository.deleteById(firmId);
    }
    public void updateFirm(Firm firm){
        firmRepository.update(firm.getId(),firm.getTlgr(),firm.getDisloc());
    }
}
