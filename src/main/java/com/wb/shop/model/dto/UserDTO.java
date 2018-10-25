package com.wb.shop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ye on 25/10/18.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

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
