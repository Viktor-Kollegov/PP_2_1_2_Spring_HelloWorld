import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hbean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hbean.getMessage());
        HelloWorld hbean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hbean2.getMessage());
        Cat cbean = (Cat) applicationContext.getBean("cat");
        System.out.println(cbean.getName());
        Cat cbean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cbean2.getName());
        System.out.println(hbean.equals(hbean2));
        System.out.println(cbean.equals(cbean2));
    }
}