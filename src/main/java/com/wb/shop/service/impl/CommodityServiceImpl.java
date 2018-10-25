package com.wb.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.wb.shop.dao.CommodityMapper;
import com.wb.shop.domain.Commodity;
import com.wb.shop.manager.dto.CommodityDTOManager;
import com.wb.shop.model.dto.CommodityDTO;
import com.wb.shop.page.PageInfo;
import com.wb.shop.service.CommodityService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
@Service
@Slf4j
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private CommodityDTOManager commodityDTOManager;

    public List<CommodityDTO> findCommodityList(PageInfo pageInfo) {
        if (pageInfo != null) {
            PageHelper.startPage(pageInfo);
        }
        List<Commodity> commodityList = commodityMapper.findCommodityList();
        List<CommodityDTO> commodityDTOList = commodityDTOManager.convertToCommodityDTOList(commodityList);
        return commodityDTOList;
    }

    @Override
    public CommodityDTO getCommodityByUuid(String uuid) {
        if (StringUtils.isBlank(uuid)) {
            return null;
        }
        Commodity commodity = commodityMapper.getByUuid(uuid);
        CommodityDTO commodityDTO = commodityDTOManager.convertToCommodityDTO(commodity);
        return commodityDTO;
    }
}
