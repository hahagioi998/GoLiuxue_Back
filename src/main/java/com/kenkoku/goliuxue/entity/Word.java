package com.kenkoku.goliuxue.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class Word implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    private String kana;

    private String kanji;

    private String cn;

    private Integer level;

    private String classification;

    private String homoionym;

    private String antonym;

    private String example;

    private boolean isMastered;
}
