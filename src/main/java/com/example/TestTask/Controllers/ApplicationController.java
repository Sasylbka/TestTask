package com.example.TestTask.Controllers;

import com.example.TestTask.Services.ApplicationService;
import com.example.TestTask.Services.FirmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@AllArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;
    @GetMapping(path = "/treeView")
    public String showTree(Model model){
        model.addAttribute("tree", applicationService.createTreeStructure());
        return "tree";
    }
    @GetMapping(path = "/add-firm-form")
    public String addFirm(Model model){
        return "add-firm-form";
    }
    @GetMapping(path = "/add-transport-type-form")
    public String addType(Model model){
        return "add-transport-type-form";
    }
    @GetMapping(path = "/add-transport-kind-form")
    public String addKind(Model model){
        return "add-transport-kind-form";
    }
    @GetMapping(path = "/add-transport-data-form")
    public String addData(Model model){
        return "add-transport-data-form";
    }
    @GetMapping(path = "/update-firm-form")
    public String updateFirm(Model model){
        return "update-firm-form";
    }
    @GetMapping(path = "/update-transport-type-form")
    public String updateType(Model model){
        return "update-transport-type-form";
    }
    @GetMapping(path = "/update-transport-kind-form")
    public String updateKind(Model model){
        return "update-transport-kind-form";
    }
    @GetMapping(path = "/update-transport-data-form")
    public String updateData(Model model){
        return "update-transport-data-form";
    }
}
