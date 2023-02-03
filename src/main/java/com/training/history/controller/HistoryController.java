package com.training.history.controller;
import com.training.history.model.History;
import com.training.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vi")
public class HistoryController {
    @Autowired
    private HistoryService historyService;
    @GetMapping("/getAllStudentData")
    public List<History>getall(){
        return historyService.getall();
    }

    @PostMapping("/saveHistoryData")
    public History saveHistory(@RequestBody History history) {
        return historyService.addHistory(history);
    }
    @DeleteMapping("/deletestudent/{id}")
    public String getDelete(@PathVariable int id){
        return historyService.deleteHistory(id);
    }
    @PostMapping("/updateHistory")
    public History updateHistory(@RequestBody History history){
        return historyService.updateHistory(history);
    }
}
