package snx.dl.simplelib;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Library {

  Logger logger = LoggerFactory.getLogger(Library.class);

  @Pointcut("@annotation(Audited)")
  public void callAnnotated() {
  }

  @Before("callAnnotated()")
  public void beforeCall(JoinPoint jp) {
    logger.info("Method call detected: " + jp.getSignature());
  }
}
