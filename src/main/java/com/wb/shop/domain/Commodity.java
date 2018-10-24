package com.wb.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {

    private Long id;


    private String uuid;


    private String name;


    private String title;


    private BigDecimal price;


    private Long creator;


    private Date createTime;


    private Long updater;


    private Date updateTime;


    private Integer deleted;


    private String description;
}