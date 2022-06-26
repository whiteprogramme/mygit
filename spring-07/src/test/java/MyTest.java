import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = (User) Context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
