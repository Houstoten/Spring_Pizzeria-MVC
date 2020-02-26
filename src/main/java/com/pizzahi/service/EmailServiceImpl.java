package com.pizzahi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpleMailMessage mailMessage;

    public void sendInfoLetter(String name, String mail, String datetime) {
        SimpleMailMessage message = new SimpleMailMessage(mailMessage);
        message.setTo(mail);
        message.setSubject("Информация от " + datetime);
        message.setText("Наш склад пиццы предоставляет широкий спектр услуг для малого и среднего бизнеса.\n\n" +
                "В наличии имеются такие предложения:\n\n· Утилизация пиццы профессионалами\n· Продажа пожирателей на ваше предприятие\n" +
                "· Установка пиц-стандарта для выращивания собственных пожирателей.\n\nТак как мы заботимся о конфиденциальности наших клиентов," +
                " все вопросы будут обсуждаться в личном порядке. С вами свяжутся наши люди. В скором времени они к вам наведаются для обсуждения дальнейшего ведения дел.\n\n" +
                "С любовью, PizzaHi.");
        try {
            mailSender.send(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sendLetter(String name, String mail, String type, String size, int count,
                           String datetime) {
        SimpleMailMessage message = new SimpleMailMessage(mailMessage);
        message.setTo(mail);
        message.setSubject("Заказ от " + datetime);
        message.setText("Здравствуйте, " + name + ". Спасибо за Ваш заказ!" + "\n\n" + "Тип пиццы: " + type +
                "\nРазмер: " + size + "\nКоличество: " + count + "\n\n" + "Дата и время заказа: " + datetime + "\n\n" + "С любовью, PizzaHi.");
        try {
            mailSender.send(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
