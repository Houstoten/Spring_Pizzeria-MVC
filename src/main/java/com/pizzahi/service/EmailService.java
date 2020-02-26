package com.pizzahi.service;

public interface EmailService {
    void sendLetter(String name, String mail, String type, String size, int count,
                    String datetime);
    void sendInfoLetter(String name, String mail, String datetime);
}
