package org.example.templateMethod;

public class WebSiteRunner {
    public static void main(String[] args) {
//        WelcomePage welcomePage = new WelcomePage();
//        NewsPage newsPage = new NewsPage();
//
//        welcomePage.showPage();
//        newsPage.showPage();

        //Для того, чтобы не писать методы, где одинаково выводяться футер и хедер, создадим класс WebSiteTemplate

        WebSiteTemplate welcomePage = new WelcomePage();
        welcomePage.showPage();
        System.out.println("----------");
        WebSiteTemplate newsPage = new NewsPage();
        newsPage.showPage();
    }
}
