import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) Context.getBean("user");
        System.out.println(user.name);
    }
}
