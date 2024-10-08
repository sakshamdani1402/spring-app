package com.springapp.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.springapp.Configuration.Config.Providers;
import com.springapp.services.Interfaces.IServiceProviders;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LocationController {
    private IServiceProviders _serviceProviders;

    public LocationController(IServiceProviders serviceProviders) {
        this._serviceProviders = serviceProviders;
    }

    @GetMapping("/api/location/")
    public List<Providers> getLocation() {
        return _serviceProviders.getOptimalProvider();
    }

}
