package com.pizzahi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpleMailMessage mailMessage;

    public void sendLetter(String name, String mail, String type, String size, int count,
                           String datetime) {
        SimpleMailMessage message = new SimpleMailMessage(mailMessage);
        message.setTo(mail);
        message.setSubject("Заказ от "+datetime);
        message.setText("Здравствуйте, " + name + ". Спасибо за Ваш заказ!" + "\n\n" + "Тип пиццы: " + type +
                "\nРазмер: " + size + "\nКоличество: " + count + "\n\n" + "Дата и время заказа: " + datetime + "\n\n" + "С любовью, PizzaHi.");
        mailSender.send(message);
    }
}
