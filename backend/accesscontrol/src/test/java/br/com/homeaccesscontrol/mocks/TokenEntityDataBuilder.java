package br.com.homeaccesscontrol.mocks;

import br.com.homeaccesscontrol.models.entities.TokenEntity;
import br.com.homeaccesscontrol.models.enums.TokenStatusEnum;

public class TokenEntityDataBuilder {

    private TokenEntity tokenEntity;
    private TokenEntityDataBuilder(){}

    public static TokenEntityDataBuilder builder(){
        TokenEntityDataBuilder builder = new TokenEntityDataBuilder();
        builder.tokenEntity = new TokenEntity();

        builder.tokenEntity.setId(1L);
        builder.tokenEntity.setValidateDate("31/12/2025");
        builder.tokenEntity.setKey(12345678910111213L);
        builder.tokenEntity.setStatus(TokenStatusEnum.ACTIVE);
        builder.tokenEntity.setResident(ResidentEntityDataBuilder.builder().withResidentAccesses().build());

        return builder;
    }

    public TokenEntity build(){
        return tokenEntity;
    }
}
