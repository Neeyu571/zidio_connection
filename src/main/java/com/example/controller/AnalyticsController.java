package com.example.controller;

import com.example.DTO.AnalysticsResponse;
import com.example.DTO.ApplicationDTO;
import com.example.service.AnalyticsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analystics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping
    public ResponseEntity<AnalysticsResponse> getAllAnalytics() {
        return ResponseEntity.ok(analyticsService.collectData());
    }

    @GetMapping("/applications/weekly")
    public ResponseEntity<List<ApplicationDTO>> getWeeklyTrackers() {
        return ResponseEntity.ok(analyticsService.getWeeklyApplicationsTracker());
    }
}