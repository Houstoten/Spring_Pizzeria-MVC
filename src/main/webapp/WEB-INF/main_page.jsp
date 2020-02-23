<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <%@ page isELIgnored="false" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PizzaHi</title>
    <link rel="shortcut icon" href="../webres/img/logo.ico" type="image/x-icon">
    <link rel="stylesheet" href="../webres/css/normalize.css">
    <link rel="stylesheet" href="../webres/css/fonts.css">
    <link rel="stylesheet" href="../webres/css/style.css">
    <link rel="stylesheet" href="../webres/css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="../webres/css/slick.css">
</head>

<body>
<header class="header">
    <div class="header_top">
        <div class="container">
            <div class="header_contacts">
                <a class="header_phone" href="tel:380123456789"> +380123456789</a>
                <a class="header_email" href="mail:email-example@mail.com"> email-example@mail.com</a>
                <a data-fancybox data-src="#modal" href="javascript:;" class="header_btn" href="#"> Консультация с
                    пиццей</a>
            </div>
        </div>
    </div>
    <div class="header_content">
        <div class="container">
            <div class="header_content-innerblock">
                <div class="header_logo">
                    <a href="#">
                        <img src="../webres/img/logo.png" alt="">
                    </a>
                    <a href="#">PizzaHi Restaurant</a>
                </div>
                <nav class="menu">
                    <ul>
                        <li><a href="#">Главная</a></li>
                        <li><a href="#">О пицце</a></li>
                        <li><a href="#">Меню</a></li>
                        <li><a href="#">Контакты</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</header>
<section class="slider">
    <div class="container">
        <div class="slider_inner">
            <div class="slider_item">
                <div class="slider_item-content">
                    <div class="slider_title">
                        РАСПРОДАЖА СКЛАДА ПИЦЦЫ
                    </div>
                    <div class="slider_text">
                        У вас есть возможность забрать кучу пиццы оптом от 30-ти штук по самой низкой цене на рынке
                    </div>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="slider_btn default_btn">
                        Составить заказ
                    </a>
                </div>
            </div>

            <div class="slider_item">
                <div class="slider_item-content">
                    <div class="slider_title">
                        РАСПРОДАЖА СКЛАДА ПИЦЦЫ
                    </div>
                    <div class="slider_text">
                        У вас есть возможность забрать кучу пиццы оптом от 30-ти штук по самой низкой цене на рынке
                    </div>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="slider_btn default_btn">
                        Составить заказ
                    </a>
                </div>
            </div>

            <div class="slider_item">
                <div class="slider_item-content">
                    <div class="slider_title">
                        РАСПРОДАЖА СКЛАДА ПИЦЦЫ
                    </div>
                    <div class="slider_text">
                        У вас есть возможность забрать кучу пиццы оптом от 30-ти штук по самой низкой цене на рынке
                    </div>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="slider_btn default_btn">
                        Составить заказ
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="services">
    <div class="container">
        <div class="services_top">
            <div class="services_title-box">
                <div class="services_title">
                    Наши пицца-услуги
                </div>
                <div class="services_text">
                    Хранение вашей пиццы, употребление вашей пиццы,
                    продажа пиццы, закупка пожирателей пиццы.
                </div>
            </div>
            <div class="services_btn">
                <a href="#">
                    Показать больше услуг
                </a>
            </div>
        </div>
        <div class="services_items">
            <div class="services_item">
                <img src="../webres/img/services-1.png" alt="">
                <div class="services_item-title">
                    Утилизация пиццы
                </div>
                <div class="services_item-text">
                    Полная утилизация вашей пиццы нашими профессионалами за считанные минуты
                </div>
                <div class="services_item-btn">
                    <a class="services_item-link" href="#">Подробнее</a>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="services_btn default_btn">
                        Заказать
                    </a>
                </div>
            </div>

            <div class="services_item">
                <img src="../webres/img/services-1.png" alt="">
                <div class="services_item-title">
                    Продажа пожирателей пиццы
                </div>
                <div class="services_item-text">
                    Продажа опытных пожирателей на ваше предприятие
                </div>
                <div class="services_item-btn">
                    <a class="services_item-link" href="#">Подробнее</a>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="services_btn default_btn">
                        Заказать
                    </a>
                </div>
            </div>

            <div class="services_item">
                <img src="../webres/img/services-1.png" alt="">
                <div class="services_item-title">
                    Установка пиц-стандарта
                </div>
                <div class="services_item-text">
                    Установка и получение абсолютно легального пиц-сертификата
                </div>
                <div class="services_item-btn">
                    <a class="services_item-link" href="#">Подробнее</a>
                    <a data-fancybox data-src="#modal" href="javascript:;" class="services_btn default_btn">
                        Заказать
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="about">
    <div class="container">
        <div class="about_title">
            О компании
        </div>
        <div class="about_text">
            Наша компания оказывает всевозможные услуги, связанные с пиццей и её ингридиентами.
            В нашей команде работают только профессионалы высшего звена пиццеров.
            Обратившись за помощью к нашей команде, ваша пицца окажется в надёжных животах.
        </div>
        <a data-fancybox data-src="#modal" href="javascript:;" class="about_btn default_btn">
            Узнать больше
        </a>
    </div>
</section>

<form id="modal" action="/main_page" class="default_modal" method="POST" onsubmit="alert('Заказ принят в работу!');">
    <div class="modal_title">
        Введите пожалуйства ваши контактные данные ниже для получения дополнительных материалов по вашему вопросу
    </div>
    <div class="modal_sides">
        <div class="left_side">
            <div class="modal_nameinput-item">
                <label>
                    <div class="modal_name">
                        Укажите Ваше имя:
                    </div>
                    <input name="name" class="name_input" type="text" maxlength="30" required>
                </label>
            </div>
            <div class="modal_emailinput-item">
                <label>
                    <div class="modal_email">
                        Укажите контактный адрес электронной почты:
                    </div>
                    <input name="email" class="email_input" type="text" maxlength="30" required>
                </label>
            </div>
            <div class="send_all-item">
                <input class="default_btn submit_btn" type="submit" value="Отправить заказ">
            </div>
        </div>
        <div class="right_side">
            <div class="pizza_type-item">
                <label>
                    <div class="pizza_type">
                        Укажите тип пиццы:
                    </div>
                    <select class="pizza_type-input" name="typesItem" id="TypesList">
                        <c:forEach items="${TypesList}" var="type">
                            <option>${type}</option>
                        </c:forEach>
                    </select>
                </label>
            </div>
            <div class="pizza_size-item">
                <label>
                    <div class="pizza_size">
                        Укажите размер пиццы:
                    </div>
                    <select class="pizza_size-input" name="sizesItem" id="SizesList">
                        <c:forEach items="${SizesList}" var="size">
                            <option>${size}</option>
                        </c:forEach>
                    </select>
                </label>
            </div>
            <div class="pizza_count-item">
                <label>
                    <div class="pizza_count">
                        Укажите количество пиццы:
                    </div>
                    <input name="count" class="pizza_count-input" type="number" value="1" min="1" max="255" required>
                </label>
            </div>
        </div>
    </div>
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="../webres/js/jquery.fancybox.min.js"></script>
<script src="../webres/js/slick.min.js"></script>
<script src="../webres/js/main.js"></script>
</body>

</html>