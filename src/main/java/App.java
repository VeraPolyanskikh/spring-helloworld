import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Original beans instances comparison result="+(bean == bean2));

        Cat cat =
                (Cat) applicationContext.getBean("cat");

        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Cat beans instances comparison result="+(cat == cat2));
        System.out.println(bean.getMessage());
    }
}