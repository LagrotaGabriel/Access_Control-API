package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.TokenEntityDataBuilder;
import br.com.homeaccesscontrol.models.enums.TokenStatusEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Status;

@SpringBootTest
@DisplayName("TokenEntity")
class TokenEntityTest {

    @Test
    @DisplayName("Should test TokenEntity Getters and Setters methods")
    void shouldTestTokenEntityGettersAndSettersMethods(){
        Assertions.assertEquals("TokenEntity(id=1, validateDate=31/12/2025, key=12345678910111213, " +
                "status=ACTIVE, resident=ResidentEntity(id=1, name=Gabriel Lagrota, cpf=123.456.789-10, " +
                "homeStartDate=16/11/2021, homeEndDate=null, birthDate=21/07/1998, rg=11.111.111-3, " +
                "residentSituation=LIVING, residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null), token=null, " +
                "residentAccesses=[ResidentAccessEntity(id=1, date=2022-06-04T02:06:57.260990900, " +
                "entranceHallEntity=EntranceHallEntity(id=1, name=North entrance, concierge=null, " +
                "residentAccesses=null, guestAccesses=null), resident=ResidentEntity(id=1, name=Gabriel Lagrota, " +
                "cpf=123.456.789-10, homeStartDate=16/11/2021, homeEndDate=null, birthDate=21/07/1998, rg=11.111.111-3, " +
                "residentSituation=LIVING, residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null), token=null, residentAccesses=null))]))",
                TokenEntityDataBuilder.builder().build().toString());
    }

    @Test
    @DisplayName("Should test TokenEntity All args constructor")
    void shouldTestTokenEntityAllArgsConstructor(){
        TokenEntity tokenEntity = new TokenEntity(1L, "31/12/2025", 12345678910111213L,
                TokenStatusEnum.ACTIVE, null);

        Assertions.assertEquals("TokenEntity(id=1, validateDate=31/12/2025, key=12345678910111213, " +
                "status=ACTIVE, resident=null)", tokenEntity.toString());
    }

    @Test
    @DisplayName("Should test TokenEntity Hashcode method")
    void shouldTestTokenEntityHashcodeMethod(){
        Assertions.assertNotEquals(0, TokenEntityDataBuilder.builder().build());
    }
}
