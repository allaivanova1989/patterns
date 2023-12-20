package org.example.builder;

public abstract class WebsiteBuilder {
    WebSite webSite;
    void createWebsite(){
        webSite = new WebSite();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    WebSite getWebsite(){
        return webSite;
    }
}
