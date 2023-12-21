package org.example.proxy;

/**
 * Клиентский класс
 */
public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://github.com/allaivanova1989/Exception.git");
//        project.run();

        //Для прокси нужно сделать чтобы проект загружался при запуске, а не при создании объекта
        Project project = new ProxyProject("https://github.com/allaivanova1989/Exception.git");
        project.run();
    }


}
