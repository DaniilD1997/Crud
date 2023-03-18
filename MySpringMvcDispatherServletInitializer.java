package di.create.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    public Class<?>[] getRootConfigClasses()  {
        return null;
    }

    @Override
    public Class<?>[] getServletConfigClasses(){
        return new Class[]{SpringConfig.class};
    }

    @Override
    public String[] getServletMappings(){
        return new String[]{"/"};
    }

}
