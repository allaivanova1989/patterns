package org.example.builder;

public class Director {
    WebsiteBuilder websiteBuilder;
    public void setWebsiteBuilder(WebsiteBuilder builder){
        this.websiteBuilder = builder;
    }

    WebSite buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();
        WebSite webSite = websiteBuilder.getWebsite();
        return webSite;
    }
}
