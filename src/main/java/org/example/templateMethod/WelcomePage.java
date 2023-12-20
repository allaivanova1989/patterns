package org.example.templateMethod;

public class WelcomePage extends WebSiteTemplate {

    //    public void showPage(){
//        System.out.println("Header");
//        System.out.println("Welcome");
//        System.out.println("Footer");
//    }

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }

}
