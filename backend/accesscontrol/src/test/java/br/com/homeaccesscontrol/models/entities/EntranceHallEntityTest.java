package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.EntranceHallEntityDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("EntranceHallEntity")
public class EntranceHallEntityTest {

    @Test
    @DisplayName("Should test the Entity EntranceHall getters and setters methods")
    public void shouldTestEntranceHallEntityGettersAndSettersMethods(){
        Assertions.assertEquals("EntranceHallEntity(id=1, name=North entrance, concierge=null, " +
                        "residentAccesses=null, guestAccesses=null)",
                EntranceHallEntityDataBuilder.builder().build().toString());
    }

    @Test
    @DisplayName("Should test the Entity EntranceHall All Args Constructor method")
    public void shouldTestEntranceHallEntityAllArgsConstructorMethod(){
        EntranceHallEntity entranceHall = new EntranceHallEntity(1L, "North entrance", null,
                null, null);

        Assertions.assertEquals("EntranceHallEntity(id=1, name=North entrance, concierge=null, " +
                        "residentAccesses=null, guestAccesses=null)", entranceHall.toString());
    }

    @Test
    @DisplayName("Should test Entity EntranceHall Hashcode method")
    public void shouldTestEntranceHallEntityHashcodeMethod(){
        Assertions.assertEquals(111151670, EntranceHallEntityDataBuilder.builder().build().hashCode());
    }

}
