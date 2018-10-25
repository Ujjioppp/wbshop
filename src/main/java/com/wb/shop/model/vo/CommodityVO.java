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
public class CommodityVO {
    private String id;


    private String uuid;


    private String name;


    private String title;


    private String price;


    private String img;


    private String creator;


    private String createTime;


    private String updater;


    private String updateTime;


    private String deleted;


    private String description;

}
