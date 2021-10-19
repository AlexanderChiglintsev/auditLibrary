package snx.dl.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApp {

  private static SimpleBean sb;

  public SimpleApp(SimpleBean sb) {
    SimpleApp.sb = sb;
  }

  public static void main(String[] args) {
    SpringApplication.run(SimpleApp.class, args);
    System.out.println("Start !!!");

    sb.methodOne();
    sb.methodTwo();
    sb.methodThree();
  }
}
