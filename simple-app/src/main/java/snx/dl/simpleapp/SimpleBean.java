package snx.dl.simpleapp;

import org.springframework.stereotype.Component;
import snx.dl.simplelib.Audited;


@Component
public class SimpleBean {

  @Audited
  void methodOne() {
    System.out.println("Method 1");
  }

  @Audited
  void methodTwo() {
    System.out.println("Method 2");
  }

  void methodThree() {
    System.out.println("Method 3");
  }
}
