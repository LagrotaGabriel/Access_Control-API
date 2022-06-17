package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.GuestAccessEntityDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@DisplayName("GuestAccessEntity")
class GuestAccessEntityTest {

    @Test
    @DisplayName("Should test GuestAccessEntity Getters and Setters Methods")
    void shouldTestGuestAccessEntityGettersAndSetters(){
        Assertions.assertEquals("GuestAccessEntity(id=1, date=2022-06-04T02:06:57.260990900, " +
                "entranceHallEntity=EntranceHallEntity(id=1, name=North entrance, concierge=null, residentAccesses=null," +
                " guestAccesses=null), guest=GuestEntity(id=1, name=Steffany Gonçalves, cpf=987.654.321-99, " +
                "residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, residenceSituation=EMPTY, " +
                "residents=null, guests=null), accesses=null))", GuestAccessEntityDataBuilder.builder().withStaticDate().build().toString());
    }

    @Test
    @DisplayName("Should test GuestAccessEntity All args constructor")
    void shouldTestGuestAccessAllArgsConstructor(){
        GuestAccessEntity guestAccess = new GuestAccessEntity(1L, LocalDateTime.parse("2022-06-17T09:18:55.528880700"),
                null, null);
        Assertions.assertEquals("GuestAccessEntity(id=1, date=2022-06-17T09:18:55.528880700, " +
                "entranceHallEntity=null, guest=null)", guestAccess.toString());
    }

    @Test
    @DisplayName("Should test GuestAccessEntity hashcode method")
    void shouldTestGuestAccessHashcode(){
        Assertions.assertNotEquals(0,
                GuestAccessEntityDataBuilder.builder().withStaticDate().build().hashCode());
    }

}
