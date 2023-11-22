package testautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//https://blog.csdn.net/tjd5214/article/details/120066029
@Component
public class OrderService {
    private UserService userService;
    @Autowired
    public OrderService() {
        this.userService = userService;
        System.out.println("0");
    }
//    @Autowired(required = false)
    public OrderService(UserService userService) {
        this.userService = userService;
        System.out.println("1");
    }
//    @Autowired(required = false)
    public OrderService(UserService userService, UserService userService1) {
        this.userService = userService;
        System.out.println("2");
    }
//    @Autowired(required = false)
    public OrderService(UserService userService, UserService userService1, UserService userService3) {
        this.userService = userService;
        System.out.println("3");
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "userService=" + userService +
                '}';
    }
}