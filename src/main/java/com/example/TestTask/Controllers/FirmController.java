package com.example.TestTask.Controllers;

import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Services.FirmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class FirmController {
    private final FirmService firmService;
    @PostMapping("/addFirm")
    public Firm addFirm(@RequestBody Firm firm){
         return firmService.addFirm(firm);
    }
    @DeleteMapping("/deleteFirm")
    public void deleteFirm(Long firmId){
        firmService.deleteFirm(firmId);
    }
    @PatchMapping("/updateFirm")
    public void updateFirm(@RequestBody Firm firm){
        firmService.updateFirm(firm);
    }

}
