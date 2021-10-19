package snx.dl.simplelibspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import snx.dl.simplelib.Library;

@Configuration
@ConditionalOnClass(Library.class)
public class SimpleLibAutoConfiguration {

  @Bean
  public Library getLibrary() {
    return new Library();
  }
}
