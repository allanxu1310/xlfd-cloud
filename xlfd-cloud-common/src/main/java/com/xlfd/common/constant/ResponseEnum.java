package com.xlfd.common.constant;

import org.springframework.stereotype.Component;

/**
 * responseEnum
 * @author Allan
 */
@Component
public enum ResponseEnum {
    CODE("200","SUCCESS"),
    MSG("500","FAIL");

    private String type;
    private String comment;

    ResponseEnum(String type, String comment) {
        this.type = type;
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public String getComment() {
        return comment;
    }

}
