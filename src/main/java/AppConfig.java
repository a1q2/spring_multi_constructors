import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//配置参考：https://blog.csdn.net/asksl/article/details/128554799
//springmvc配置类，本质上还是一个spring配置类


@Configuration
//@ComponentScan({"com.itheima.dao","com.itheima.service"})
@ComponentScan("testautowire")
public class AppConfig {
}
