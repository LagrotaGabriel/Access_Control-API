package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.ConciergeEntityDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("ConciergeEntity")
public class ConciergeEntityTest {

    @Test
    @DisplayName("Should test the Entity Concierge getters and setters methods")
    public void shouldTestConciergeEntityGettersAndSetters(){
        Assertions.assertEquals("ConciergeEntity(id=1, name=João da Silva, cpf=123.456.789-20, " +
                "entranceHall=null)", ConciergeEntityDataBuilder.builder().build().toString());
    }

    @Test
    @DisplayName("should test the Entity Concierge All Args Constructor method")
    public void shouldTestConciergeEntityAllArgsConstructor(){
        ConciergeEntity concierge =
                new ConciergeEntity(1L, "João da Silva", "123.456.789-20", null);

        Assertions.assertEquals("ConciergeEntity(id=1, name=João da Silva, cpf=123.456.789-20, " +
                "entranceHall=null)", concierge.toString());
    }

    @Test
    @DisplayName("should test Entity Concierge Hashcode")
    public void shouldTestConciergeEntityHashcode(){
        Assertions.assertEquals(-2129175940, ConciergeEntityDataBuilder.builder().build().hashCode());
    }


}
