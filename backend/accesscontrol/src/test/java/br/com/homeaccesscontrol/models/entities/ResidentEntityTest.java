package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.ResidentEntityDataBuilder;
import br.com.homeaccesscontrol.models.enums.ResidentSituationEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("ResidentEntity")
class ResidentEntityTest {

    @Test
    @DisplayName("Should test ResidentEntity Getters and Setters methods")
    void shouldTestResidentEntityGettersAndSettersMethods(){
        System.err.println(ResidentEntityDataBuilder.builder().build());
        Assertions.assertEquals("ResidentEntity(id=1, name=Gabriel Lagrota, cpf=123.456.789-10, " +
                "homeStartDate=16/11/2021, homeEndDate=null, birthDate=21/07/1998, rg=11.111.111-3, " +
                "residentSituation=LIVING, residence=ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null), token=null, residentAccesses=null)",
                ResidentEntityDataBuilder.builder().build().toString());
    }

    @Test
    @DisplayName("Should test ResidentEntity All args constructor method")
    void shouldTestResidentEntityAllArgsConstructorMethod(){
        ResidentEntity residentEntity = new ResidentEntity(1L, "Gabriel Lagrota", "123.456.789-10",
                "16/11/2021", null, "21/07/1998", "11.111.111-3",
                ResidentSituationEnum.LIVING, null, null, null);
        Assertions.assertEquals("ResidentEntity(id=1, name=Gabriel Lagrota, cpf=123.456.789-10, " +
                "homeStartDate=16/11/2021, homeEndDate=null, birthDate=21/07/1998, rg=11.111.111-3, " +
                "residentSituation=LIVING, residence=null, token=null, residentAccesses=null)",
                residentEntity.toString());
    }

    @Test
    @DisplayName("Should test ResidentEntity hashcode method")
    void shouldTestResidentEntityHashcodeMethod(){
        Assertions.assertNotEquals(-1330873242, ResidentEntityDataBuilder.builder().build().hashCode());
    }
}
