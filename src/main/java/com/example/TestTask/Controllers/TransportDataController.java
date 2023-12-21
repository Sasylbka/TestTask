package com.example.TestTask.Controllers;

import com.example.TestTask.Entities.DTO.TransportDataDTO;
import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Entities.TransportData;
import com.example.TestTask.Services.TransportDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TransportDataController {
    private final TransportDataService transportDataService;
    @PostMapping("/addData")
    public void addData(@RequestBody TransportDataDTO data){
        transportDataService.addData(data);
    }
    @DeleteMapping("/deleteData")
    public void deleteData(Long dataId){
        transportDataService.deleteData(dataId);
    }
    @PatchMapping("/updateData")
    public void updateData(@RequestBody TransportDataDTO data){
        transportDataService.updateData(data);
    }
}
