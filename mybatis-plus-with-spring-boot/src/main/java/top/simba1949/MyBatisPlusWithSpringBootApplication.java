package top.simba1949;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @date 2023/3/29
 */
@SpringBootApplication
@MapperScan(basePackages = "top.simba1949.mapper")
public class MyBatisPlusWithSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusWithSpringBootApplication.class, args);
    }
}
