package br.com.homeaccesscontrol.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidenceSituationEnum {

    FILLED(1, "Filled"),
    EMPTY(2, "Empty");

    private final Integer code;
    private final String desc;

}
