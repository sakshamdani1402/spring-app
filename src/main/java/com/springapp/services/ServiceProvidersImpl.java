package com.springapp.services;

import com.springapp.services.Interfaces.IServiceProviders;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ServiceProvidersImpl implements IServiceProviders {
    public List<String> getOptimalProvider() {
        return List.of("ji", "sew", "dsf");
    }
}
