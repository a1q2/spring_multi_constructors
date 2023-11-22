import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import testautowire.OrderService;
import tsnoautowire.OrderService22;

public class App {
    //要把配置文件改为@ComponentScan("testautowire")，否则出现NoSuchBeanDefinitionException错误



    //test autowire
    public static void main(String[] args) {
        // 在启动Spring项目时，直接获取到ApplicationContext的引用，然后将其存储到工具类当中;
        // 在使用时，则从工具类中获取ApplicationContext容器，进而从中获得Bean对象。
        //1. 注解方式 加载配置文件, 创建spring的IOC容器对象
        //ApplicationContext则在初始化应用上下文时就实例化所有单实例的Bean，
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //2. 从Spring容器(应用上下文)中获取bean实例(对象)：使用bean名称获取并指定类型
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
    }

    // test autowire=AUTOWIRE_CONSTRUCTOR
//    public static void main(String[] args) {
//        // 在启动Spring项目时，直接获取到ApplicationContext的引用，然后将其存储到工具类当中;
//        // 在使用时，则从工具类中获取ApplicationContext容器，进而从中获得Bean对象。
//        //1. 注解方式 加载配置文件, 创建spring的IOC容器对象
//        //ApplicationContext则在初始化应用上下文时就实例化所有单实例的Bean，
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(OrderService.class);
//        beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
//        applicationContext.registerBeanDefinition("orderService",beanDefinition);
//        applicationContext.register(AppConfig.class);
//        //刷新当前spring所处的上下文
//        applicationContext.refresh();
//    }


    //tsnoautowire22

//    //main方法测试
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService22 orderService22 = context.getBean("orderService22", OrderService22.class);
//        System.out.println(orderService22);
//        orderService22.showResult();
//    }

    //tsnoautowire
/*
    public static void main(String[] args) {
        // 在启动Spring项目时，直接获取到ApplicationContext的引用，然后将其存储到工具类当中;
        // 在使用时，则从工具类中获取ApplicationContext容器，进而从中获得Bean对象。
        //1. 注解方式 加载配置文件, 创建spring的IOC容器对象
        //ApplicationContext则在初始化应用上下文时就实例化所有单实例的Bean，
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //2. 从Spring容器(应用上下文)中获取bean实例(对象)：使用bean名称获取并指定类型
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
*/


//    //main方法测试
//    public /*static*/ void main22(String[] args) {
//        // 在启动Spring项目时，直接获取到ApplicationContext的引用，然后将其存储到工具类当中;
//        // 在使用时，则从工具类中获取ApplicationContext容器，进而从中获得Bean对象。
//        //1. 注解方式 加载配置文件, 创建spring的IOC容器对象
//        //ApplicationContext则在初始化应用上下文时就实例化所有单实例的Bean，
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        //2. 从Spring容器(应用上下文)中获取bean实例(对象)：使用bean名称获取并指定类型
//        OrderService22 orderService22 = context.getBean("orderService", OrderService22.class);
//        orderService22.showResult();
//    }

    //重要一点：BeanFactory是Spring框架的最底层接口，
    // 表面上BeanFactory只能getBean，实际上，控制反转、基本的依赖注入、直到Bean的生命周期的各种功能都由它的实现类提供。
    // ApplicationContext是BeanFactory的子接口，由BeanFactory派生而来。
//    ----------------------------------------------
    // BeanFactory是IoC容器的顶层接口，初始化BeanFactory对象时，加载的bean延迟加载
    // ApplicationContext接口是Spring容器的核心接口，初始化时bean立即加载
    // ====
    // BeanFactory在初始化的时候，不会加载任何bean实例；而ApplicationContext初始化的时候，会提前加载xml中配置的所有单例 bean。
}
