package com.wb.shop.bean;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by ye on 25/10/18.
 */
@Component
public class UUIDGenerator {
    public String uuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
