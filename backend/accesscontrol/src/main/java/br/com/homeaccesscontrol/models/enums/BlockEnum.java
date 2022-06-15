package br.com.homeaccesscontrol.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BlockEnum {

    BLOCK_NORTH(1, "Block North"),
    BLOCK_SOUTH(2, "Block South");

    private final Integer code;
    private final String desc;

}
