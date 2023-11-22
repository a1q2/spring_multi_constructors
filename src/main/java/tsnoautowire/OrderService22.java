package tsnoautowire;

import org.springframework.stereotype.Component;
import testautowire.UserService;

//定单服务，无参构造
//https://blog.csdn.net/tjd5214/article/details/120066029
@Component
public class OrderService22 {

    private UserService22 userService;

    public OrderService22() {
    }

    public OrderService22(UserService22 userService) {
        this.userService = userService;
    }

    public OrderService22(UserService22 userService, UserService userService1) {
        this.userService = userService;
    }

    public void showResult() {
        if (userService == null) {
            System.out.println("用户服务未注入");
        } else {
            System.out.println("用户服务已注入");
        }
    }

    @Override
    public String toString() {
        return "OrderService22{" +
                "userService=" + userService +
                '}';
    }
}