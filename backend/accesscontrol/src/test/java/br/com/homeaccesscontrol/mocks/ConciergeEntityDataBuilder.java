package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.ConciergeEntity;

public class ConciergeEntityDataBuilder {

    private ConciergeEntity conciergeEntity;
    private ConciergeEntityDataBuilder(){}

    public static ConciergeEntityDataBuilder builder(){

        ConciergeEntityDataBuilder builder = new ConciergeEntityDataBuilder();
        builder.conciergeEntity = new ConciergeEntity();

        builder.conciergeEntity.setId(1L);
        builder.conciergeEntity.setName("João da Silva");
        builder.conciergeEntity.setCpf("123.456.789-20");
        builder.conciergeEntity.setEntranceHall(EntranceHallEntityDataBuilder.builder().build());

        return builder;
    }

    public ConciergeEntity build(){
        return conciergeEntity;
    }

}
