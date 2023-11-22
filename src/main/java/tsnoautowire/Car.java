package tsnoautowire;


import org.springframework.stereotype.Component;

// https://blog.csdn.net/m0_46571920/article/details/112557332
// 组件扫描： 去寻找带有@Component注解的类，并为其创建bean。
//.创建一个多个参数构造器的pojo类 并且配置bean .
@Component
public class Car {
	   private String brand;
	   private String corp;
       private double price;
       private int maxSpeed;

	public Car() {
	}

	public Car(String brand, String corp, double price) {
   		super();
   		this.brand = brand;
   		this.corp = corp;
   		this.price = price;
   	}
       
       public Car(String brand, String corp, int maxSpeed) {
   		super();
   		this.brand = brand;
   		this.corp = corp;
   		this.maxSpeed = maxSpeed;
   	}

       @Override
   	public String toString() {
   		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
   	}

}

