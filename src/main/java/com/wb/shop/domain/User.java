package com.wb.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;


    private String uuid;


    private String userName;


    private String password;


    private Long creator;


    private Date createTime;


    private Long updater;


    private Date updateTime;


    private Integer deleted;
}