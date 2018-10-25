package com.wb.shop.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ye on 25/10/18.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private Long id;


    private String uuid;


    private String userName;


    private String password;


    private Long creator;


    private String createTime;


    private Long updater;


    private String updateTime;


    private Integer deleted;
}
