package pl.apka.matura.apkamatura;

import static org.assertj.core.api.Assertions.assertThat;

import pl.apka.matura.apkamatura.tags.UnitTest;

class UnitTestExample {

  @UnitTest
  void unitTest() {
    assertThat(true).isTrue();
  }

}
