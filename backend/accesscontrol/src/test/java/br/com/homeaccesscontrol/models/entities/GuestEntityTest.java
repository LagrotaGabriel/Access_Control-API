package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.GuestEntityDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("GuestEntity")
class GuestEntityTest {

    @Test
    @DisplayName("Should test GuestEntity Getters and Setters methods")
    void shouldTestGuestEntityGettersAndSettersMethods(){
        Assertions.assertEquals("GuestEntity(id=1, name=Steffany Gonçalves, cpf=987.654.321-99, " +
                "residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, residenceSituation=EMPTY, " +
                "residents=null, guests=null), accesses=null)", GuestEntityDataBuilder.builder().build().toString());
    }

    @Test
    @DisplayName("Should test GuestEntity All args constructor")
    void shouldTestGuestEntityAllArgsConstructor(){
        GuestEntity guestEntity = new GuestEntity(1L, "Steffany Gonçalves", "987.654.321-99", null,
                null);
        Assertions.assertEquals("GuestEntity(id=1, name=Steffany Gonçalves, cpf=987.654.321-99, residence=null, " +
                "accesses=null)", guestEntity.toString());
    }

    @Test
    @DisplayName("Should test GuestEntity hashcode")
    void shouldTestGuestEntityHashcode(){
        Assertions.assertNotEquals(0, GuestEntityDataBuilder.builder().build().hashCode());
    }
}
