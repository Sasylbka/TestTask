package com.example.TestTask.Controllers;

import com.example.TestTask.Entities.DTO.TransportTypeDTO;
import com.example.TestTask.Entities.TransportType;
import com.example.TestTask.Services.TransportTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TransportTypeController {
    private final TransportTypeService transportTypeService;
    @PostMapping("/addType")
    public void addType(@RequestBody TransportTypeDTO type){
        transportTypeService.addType(type);
    }
    @DeleteMapping("/deleteType")
    public void deleteType(Long typeId){
        transportTypeService.deleteType(typeId);
    }
    @PatchMapping("/updateType")
    public void updateType(@RequestBody TransportTypeDTO typeDTO){
        transportTypeService.updateType(typeDTO);
    }
}
