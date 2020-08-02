package com.kenkoku.goliuxue.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel
@Data
public class WordQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty
    private String name;
}
