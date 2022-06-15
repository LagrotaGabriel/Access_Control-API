package br.com.homeaccesscontrol.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidentSituationEnum {

    LIVING(1, "Living"),
    TRAVELING(2, "Traveling"),
    FORMER_RESIDENT(3, "Former resident");

    private final Integer code;
    private final String desc;

}
