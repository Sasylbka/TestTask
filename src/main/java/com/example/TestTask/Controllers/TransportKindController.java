package com.example.TestTask.Controllers;

import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Services.TransportDataService;
import com.example.TestTask.Services.TransportKindService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TransportKindController {
    private final TransportKindService transportKindService;
    @PostMapping("/addKind")
    public TransportKind addKind(@RequestBody TransportKind kind){
        return transportKindService.addKind(kind);
    }
    @DeleteMapping("/deleteKind")
    public void deleteKind(Long kindId){
        transportKindService.deleteKind(kindId);
    }
    @PatchMapping("/updateKind")
    public void updateKind(@RequestBody TransportKind kind){
        transportKindService.updateKind(kind);
    }
}
