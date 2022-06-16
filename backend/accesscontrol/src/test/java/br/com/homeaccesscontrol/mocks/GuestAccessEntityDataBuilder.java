package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.GuestAccessEntity;

import java.time.LocalDateTime;

public class GuestAccessEntityDataBuilder {

    private GuestAccessEntity guestAccessEntity;
    private GuestAccessEntityDataBuilder(){}

    public static GuestAccessEntityDataBuilder builder(){
        GuestAccessEntityDataBuilder builder = new GuestAccessEntityDataBuilder();
        builder.guestAccessEntity = new GuestAccessEntity();

        builder.guestAccessEntity.setId(1L);
        builder.guestAccessEntity.setDate(LocalDateTime.now());
        builder.guestAccessEntity.setGuest(GuestEntityDataBuilder.builder().build());
        builder.guestAccessEntity.setEntranceHallEntity(EntranceHallEntityDataBuilder
                .builder().withGuestAccesses().withResidentAccesses().build());

        return builder;
    }

    public GuestAccessEntityDataBuilder withStaticDate(){
        guestAccessEntity.setDate(LocalDateTime.parse("2022-06-04T02:06:57.260990900"));
        return this;
    }

    public GuestAccessEntity build(){
        return guestAccessEntity;
    }
}
