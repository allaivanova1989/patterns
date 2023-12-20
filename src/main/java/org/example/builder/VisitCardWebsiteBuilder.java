package org.example.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
webSite.setName("Site first");
    }

    @Override
    void buildCms() {
webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
webSite.setPrice(500);
    }


}
