package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.GuestEntity;
import br.com.homeaccesscontrol.models.entities.ResidenceEntity;
import br.com.homeaccesscontrol.models.entities.ResidentEntity;
import br.com.homeaccesscontrol.models.enums.BlockEnum;
import br.com.homeaccesscontrol.models.enums.ResidenceSituationEnum;

import java.util.ArrayList;
import java.util.List;

public class ResidenceEntityDataBuilder {

    private ResidenceEntity residenceEntity;
    private ResidenceEntityDataBuilder (){}

    public static ResidenceEntityDataBuilder builder(){

        ResidenceEntityDataBuilder builder = new ResidenceEntityDataBuilder();
        builder.residenceEntity = new ResidenceEntity();

        builder.residenceEntity.setId(1L);
        builder.residenceEntity.setFloor(5);
        builder.residenceEntity.setNumber(45);
        builder.residenceEntity.setBlock(BlockEnum.BLOCK_NORTH);
        builder.residenceEntity.setResidenceSituation(ResidenceSituationEnum.EMPTY);
        builder.residenceEntity.setResidents(null);
        builder.residenceEntity.setGuests(null);

        return builder;
    }

    public ResidenceEntityDataBuilder withResidents(){
        List<ResidentEntity> residents = new ArrayList<>();
        residents.add(ResidentEntityDataBuilder.builder().withResidentAccesses().build());
        residenceEntity.setResidents(residents);
        residenceEntity.setResidenceSituation(ResidenceSituationEnum.FILLED);
        return this;
    }

    public ResidenceEntityDataBuilder withGuests(){
        List<GuestEntity> guests = new ArrayList<>();
        guests.add(GuestEntityDataBuilder.builder().build());
        residenceEntity.setGuests(guests);
        residenceEntity.setResidenceSituation(ResidenceSituationEnum.FILLED);
        return this;
    }

    public ResidenceEntity build(){
        return residenceEntity;
    }

}
