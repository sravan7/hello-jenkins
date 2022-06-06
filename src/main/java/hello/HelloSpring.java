package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpring {
    public static void main(String[] args){
        System.out.println(System.getProperty("http.proxyHost")+"  proxy ********************");
        SpringApplication.run(HelloSpring.class,args);
    }
}
