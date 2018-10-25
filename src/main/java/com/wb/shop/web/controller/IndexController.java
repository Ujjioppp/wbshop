package com.wb.shop.web.controller;

import com.wb.shop.constant.UrlView;
import com.wb.shop.manager.vo.CommodityVOManager;
import com.wb.shop.model.dto.CommodityDTO;
import com.wb.shop.model.vo.CommodityVO;
import com.wb.shop.page.PageInfo;
import com.wb.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by ye on 24/10/18.
 */
@Controller
public class IndexController {
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private CommodityVOManager commodityVOManager;

    @GetMapping(value = UrlView.Index.INDEX_URL)
    public String index(ModelMap modelMap, PageInfo pageInfo) {
        List<CommodityDTO> commodityDTOList = commodityService.findCommodityList(pageInfo);
        List<CommodityVO> commodityVOList = commodityVOManager.convertToCommodityVOList(commodityDTOList);
        modelMap.put("list", commodityVOList);
        return UrlView.Index.INDEX_VIEW;
    }
}
