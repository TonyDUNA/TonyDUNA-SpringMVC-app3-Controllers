package ru.glebov.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // локация спринг конфигурации
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // подставили слеш по аналогии xml
    }
}
