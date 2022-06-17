package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.ResidentAccessEntityDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@DisplayName("ResidentAccessEntity")
class ResidentAccessEntityTest {

    @Test
    @DisplayName("Should test ResidentAccessEntity Getters and Setters methods")
    void shouldTestResidentAccessEntityGettersAndSettersMethods(){
        Assertions.assertEquals("ResidentAccessEntity(id=1, date=2022-06-04T02:06:57.260990900, " +
                "entranceHallEntity=EntranceHallEntity(id=1, name=North entrance, concierge=null, residentAccesses=null, " +
                "guestAccesses=null), resident=ResidentEntity(id=1, name=Gabriel Lagrota, cpf=123.456.789-10, " +
                "homeStartDate=16/11/2021, homeEndDate=null, birthDate=21/07/1998, rg=11.111.111-3, " +
                "residentSituation=LIVING, residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null), token=null, residentAccesses=null))",
                ResidentAccessEntityDataBuilder.builder().withStaticDate().build().toString());
    }

    @Test
    @DisplayName("Should test ResidentAccessEntity All Args Constructors")
    void shouldTestResidentAccessEntityAllArgsConstructors(){
        ResidentAccessEntity residentAccess = new ResidentAccessEntity(1L,
                LocalDateTime.parse("2022-06-04T02:06:57.260990900"), null, null);
        Assertions.assertEquals("ResidentAccessEntity(id=1, date=2022-06-04T02:06:57.260990900, " +
                "entranceHallEntity=null, resident=null)", residentAccess.toString());
    }

    @Test
    @DisplayName("Should test ResidentAccessEntity hashcode method")
    void shouldTestResidentAccessHashcodeMethod(){
        Assertions.assertNotEquals(225678397, ResidentAccessEntityDataBuilder.builder().withStaticDate().build().hashCode());
    }

}
