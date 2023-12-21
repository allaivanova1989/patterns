package org.example.builder;

/**
 * Клиентский класс
 */
public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebsite();
        // Теперь достаточно просто заменить реализацию WebSiteBuilder
        System.out.println(webSite);
    }
}
