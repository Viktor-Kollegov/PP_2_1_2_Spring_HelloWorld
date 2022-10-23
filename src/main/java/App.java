import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld2 =
                applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld2.getMessage());
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.getName());
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat2.getName());
        System.out.println(helloWorld.equals(helloWorld2));
        System.out.println(cat.equals(cat2));
    }
}