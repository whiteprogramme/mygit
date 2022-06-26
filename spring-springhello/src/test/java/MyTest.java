import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来就可以
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
