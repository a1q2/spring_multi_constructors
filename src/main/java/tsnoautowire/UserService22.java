package tsnoautowire;
 
import org.springframework.stereotype.Component;

@Component
public class UserService22 {
 
    private String name;
 
    private Integer age;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserService22{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}