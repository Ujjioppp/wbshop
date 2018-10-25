package com.wb.shop.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
@Data
@AllArgsConstructor
public class ResultVO<K> {
    public static final int SUCCESS = 0;
    public static final int ERROR = 9999;


    private int code;

    private String msg;

    private List<K> datas;

    public ResultVO() {
        setCode(SUCCESS);
    }

    public void setFail(String msg) {
        setCode(ERROR);
        setMsg(msg);
    }
}
