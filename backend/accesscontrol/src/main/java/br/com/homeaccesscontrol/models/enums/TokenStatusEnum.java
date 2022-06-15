package br.com.homeaccesscontrol.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenStatusEnum {

    ACTIVE(1, "Active"),
    INACTIVE(2, "Inactive");

    private final Integer code;
    private final String desc;

}
