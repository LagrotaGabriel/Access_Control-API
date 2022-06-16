package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.EntranceHallEntity;
import br.com.homeaccesscontrol.models.entities.GuestAccessEntity;
import br.com.homeaccesscontrol.models.entities.ResidentAccessEntity;

import java.util.ArrayList;
import java.util.List;

public class EntranceHallEntityDataBuilder {

    private EntranceHallEntity entranceHallEntity;
    private EntranceHallEntityDataBuilder(){}

    public static EntranceHallEntityDataBuilder builder(){

        EntranceHallEntityDataBuilder builder = new EntranceHallEntityDataBuilder();
        builder.entranceHallEntity = new EntranceHallEntity();

        builder.entranceHallEntity.setId(1L);
        builder.entranceHallEntity.setName("North entrance");
        builder.entranceHallEntity.setGuestAccesses(null);
        builder.entranceHallEntity.setResidentAccesses(null);
        builder.entranceHallEntity.setConcierge(null);

        return builder;
    }

    public EntranceHallEntityDataBuilder withGuestAccesses(){
        List<GuestAccessEntity> guestAccesses = new ArrayList<>();
        guestAccesses.add(GuestAccessEntityDataBuilder.builder().withStaticDate().build());
        entranceHallEntity.setGuestAccesses(guestAccesses);
        return this;
    }

    public EntranceHallEntityDataBuilder withResidentAccesses(){
        List<ResidentAccessEntity> residentAccesses = new ArrayList<>();
        residentAccesses.add(ResidentAccessEntityDataBuilder.builder().withStaticDate().build());
        entranceHallEntity.setResidentAccesses(residentAccesses);
        return this;
    }

    public EntranceHallEntity build(){
        return entranceHallEntity;
    }

}
