package snx.dl.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleApp {

  private static ApplicationContext ctx;

  public SimpleApp(ApplicationContext ctx) {
    SimpleApp.ctx = ctx;
  }

  public static void main(String[] args) {
    SpringApplication.run(SimpleApp.class, args);
    System.out.println("Start !!!");

    SimpleBean sb = ctx.getBean(SimpleBean.class);
    sb.methodOne();
    sb.methodThree();
    sb.methodTwo();
  }
}
