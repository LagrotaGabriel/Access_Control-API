package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.GuestAccessEntity;
import br.com.homeaccesscontrol.models.entities.GuestEntity;

import java.util.ArrayList;
import java.util.List;

public class GuestEntityDataBuilder {

    private GuestEntity guestEntity;
    private GuestEntityDataBuilder(){}

    public static GuestEntityDataBuilder builder(){

        GuestEntityDataBuilder builder = new GuestEntityDataBuilder();
        builder.guestEntity = new GuestEntity();

        builder.guestEntity.setId(1L);
        builder.guestEntity.setName("Steffany Gonçalves");
        builder.guestEntity.setCpf("987.654.321-99");
        builder.guestEntity.setResidence(ResidenceEntityDataBuilder.builder().build());
        builder.guestEntity.setAccesses(null);

        return builder;
    }

    public GuestEntityDataBuilder withAccesses(){
        List<GuestAccessEntity> accesses = new ArrayList<>();
        accesses.add(GuestAccessEntityDataBuilder.builder().withStaticDate().build());
        guestEntity.setAccesses(accesses);
        return this;
    }

    public GuestEntity build(){
        return guestEntity;
    }

}
