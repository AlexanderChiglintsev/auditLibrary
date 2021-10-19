package snx.dl.simpleapp;

import org.springframework.stereotype.Component;
import snx.dl.simplelib.Audited;


@Component
public class SimpleBean {

  @Audited
  void methodOne() {
    System.out.println("Method 1 call");
  }

  void methodTwo() {
    System.out.println("Method 2 call");
  }

  @Audited
  void methodThree() {
    System.out.println("Method 3 call");
  }
}
