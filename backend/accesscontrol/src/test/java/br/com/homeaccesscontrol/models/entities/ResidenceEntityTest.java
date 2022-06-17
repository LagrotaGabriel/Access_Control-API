package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.mocks.ResidenceEntityDataBuilder;
import br.com.homeaccesscontrol.models.enums.BlockEnum;
import br.com.homeaccesscontrol.models.enums.ResidenceSituationEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("ResidenceEntity")
class ResidenceEntityTest {

    @Test
    @DisplayName("Should test residence entity getters and setters methods")
    void shouldTestResidenceEntityGettersAndSetters(){
        Assertions.assertEquals("ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null)", ResidenceEntityDataBuilder.builder().build()
                .toString());
    }

    @Test
    @DisplayName("Should test residence entity All args constructor")
    void shouldTestResidenceAllArgsConstructor(){
        ResidenceEntity residenceEntity = new ResidenceEntity(1L, 5, 45, BlockEnum.BLOCK_NORTH,
                ResidenceSituationEnum.EMPTY, null, null);
        Assertions.assertEquals("ResidenceEntity(id=1, floor=5, number=45, block=BLOCK_NORTH, " +
                "residenceSituation=EMPTY, residents=null, guests=null)", residenceEntity.toString());
    }

    @Test
    @DisplayName("Should test residence hashcode")
    void shouldTestResidenceHashcode(){
        Assertions.assertNotEquals(-2004454488, ResidenceEntityDataBuilder.builder().build().hashCode());
    }

}
