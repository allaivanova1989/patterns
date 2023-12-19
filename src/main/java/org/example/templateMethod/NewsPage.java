package org.example.templateMethod;

public class NewsPage extends WebSiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
//    public void showPage() {
//        System.out.println("Header");
//        System.out.println("News");
//        System.out.println("Footer");
//    }
}
