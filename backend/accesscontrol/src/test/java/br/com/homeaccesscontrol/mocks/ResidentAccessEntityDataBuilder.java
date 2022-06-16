package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.ResidentAccessEntity;

import java.time.LocalDateTime;

public class ResidentAccessEntityDataBuilder {

    ResidentAccessEntity residentAccessEntity;
    ResidentAccessEntityDataBuilder(){}

    public static ResidentAccessEntityDataBuilder builder(){

        ResidentAccessEntityDataBuilder builder = new ResidentAccessEntityDataBuilder();
        builder.residentAccessEntity = new ResidentAccessEntity();

        builder.residentAccessEntity.setId(1L);
        builder.residentAccessEntity.setDate(LocalDateTime.now());
        builder.residentAccessEntity.setEntranceHallEntity(EntranceHallEntityDataBuilder.builder().build());
        builder.residentAccessEntity.setResident(ResidentEntityDataBuilder.builder().build());

        return builder;
    }

    public ResidentAccessEntityDataBuilder withStaticDate(){
        residentAccessEntity.setDate(LocalDateTime.parse("2022-06-04T02:06:57.260990900"));
        return this;
    }

    public ResidentAccessEntity build(){
        return residentAccessEntity;
    }

}
