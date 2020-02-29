$(function(){
    $('.slider_inner').slick({
        nextArrow: '<button type ="button" class="slick-btn slick-next"></button>',
        prevArrow: '<button type ="button" class="slick-btn slick-prev"></button>',
        infinite: false
    });

    $(`.header_btn-menu`).on(`click`, function(){
        $(`.menu ul`).slideToggle();
    })

});

var http = require("http");
setInterval(function() {
    http.get("https://pizza-hi.herokuapp.com/main_page");
}, 300000);
