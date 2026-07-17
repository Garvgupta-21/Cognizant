package com.example;

public class MyService {

    private ExternalApi externalApi;

    // dependency injection
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}