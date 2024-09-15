package com.springapp.services;

import com.springapp.Configuration.Config;
import com.springapp.Configuration.Config.Providers;
import com.springapp.services.Interfaces.IServiceProviders;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ServiceProvidersImpl implements IServiceProviders {
    private final Config _config;

    public ServiceProvidersImpl(Config config) {
        this._config = config;
    }

    public List<Providers> getOptimalProvider() {
        var providers = _config.getProviders();
        return providers;
    }
}
