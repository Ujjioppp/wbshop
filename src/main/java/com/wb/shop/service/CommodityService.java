package com.wb.shop.service;

import com.wb.shop.model.dto.CommodityDTO;
import com.wb.shop.page.PageInfo;

import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
public interface CommodityService {
    List<CommodityDTO> findCommodityList(PageInfo pageInfo);

    CommodityDTO getCommodityByUuid(String uuid);

    void saveCommodity(CommodityDTO commodityDTO);
}
