package org.example.templateMethod;

public class WelcomePage extends WebSiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
    //    public void showPage(){
//        System.out.println("Header");
//        System.out.println("Welcome");
//        System.out.println("Footer");
//    }
}
