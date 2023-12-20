package org.example.templateMethod;

public class NewsPage extends WebSiteTemplate {

    //    public void showPage() {
//        System.out.println("Header");
//        System.out.println("News");
//        System.out.println("Footer");
//    }
    @Override
    public void showPageContent() {
        System.out.println("News");
    }

}
