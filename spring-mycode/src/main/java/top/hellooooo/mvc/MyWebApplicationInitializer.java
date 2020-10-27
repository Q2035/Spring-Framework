//package top.hellooooo.mvc;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//import top.hellooooo.mvc.config.AppConfig;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletRegistration;
//
//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletCxt) {
//
//        // Load Spring web application configuration
//        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//        ac.register(AppConfig.class);
//        ac.refresh();
//
//        // Create and register the DispatcherServlet
//        DispatcherServlet servlet = new DispatcherServlet(ac);
//        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/app/*");
//    }
//}