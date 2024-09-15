package com.springapp.Configuration;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class Config {
    private List<Providers> providers;

    public List<Providers> getProviders() {
        return providers;
    }

    public void setProviders(List<Providers> providers) {
        this.providers = providers;
    }

    public static class Providers {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String url;

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        private int rateLimit;

        public void setRateLimit(int rateLimit) {
            this.rateLimit = rateLimit;
        }

        public int getRateLimit() {
            return rateLimit;
        }
    }

}
