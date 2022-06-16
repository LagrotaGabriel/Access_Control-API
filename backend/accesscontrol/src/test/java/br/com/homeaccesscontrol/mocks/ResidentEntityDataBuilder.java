package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.ResidentAccessEntity;
import br.com.homeaccesscontrol.models.entities.ResidentEntity;
import br.com.homeaccesscontrol.models.enums.ResidentSituationEnum;

import java.util.ArrayList;
import java.util.List;

public class ResidentEntityDataBuilder {

    private ResidentEntity residentEntity;
    private ResidentEntityDataBuilder(){}

    public static ResidentEntityDataBuilder builder(){

        ResidentEntityDataBuilder builder = new ResidentEntityDataBuilder();
        builder.residentEntity = new ResidentEntity();

        builder.residentEntity.setId(1L);
        builder.residentEntity.setName("Gabriel Lagrota");
        builder.residentEntity.setCpf("123.456.789-10");
        builder.residentEntity.setHomeStartDate("16/11/2021");
        builder.residentEntity.setHomeEndDate(null);
        builder.residentEntity.setBirthDate("21/07/1998");
        builder.residentEntity.setRg("11.111.111-3");
        builder.residentEntity.setResidentSituation(ResidentSituationEnum.LIVING);
        builder.residentEntity.setResidence(ResidenceEntityDataBuilder.builder().withResidents().withGuests().build());
        builder.residentEntity.setToken(TokenEntityDataBuilder.builder().build());
        builder.residentEntity.setResidentAccesses(null);

        return builder;
    }

    public ResidentEntityDataBuilder withResidentAccesses(){
        List<ResidentAccessEntity> residentAccesses = new ArrayList<>();
        residentAccesses.add(ResidentAccessEntityDataBuilder.builder().withStaticDate().build());
        residentEntity.setResidentAccesses(residentAccesses);
        return this;
    }

    public ResidentEntity build(){
        return residentEntity;
    }
}
