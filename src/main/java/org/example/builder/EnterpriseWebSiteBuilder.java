package org.example.builder;

public class EnterpriseWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Second site");
    }

    @Override
    void buildCms() {
webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
webSite.setPrice(200);
    }
}
