package pl.apka.matura.apkamatura;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.apka.matura.apkamatura.tags.IntegrationTest;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class ApkamaturaApplicationTests {

  @IntegrationTest
  void contextLoads() {
  }

}
