package com.example.restservice;

public record Location(String name, double latitude, double longitude) {
    public String getName() {
        return name;
    }
}
