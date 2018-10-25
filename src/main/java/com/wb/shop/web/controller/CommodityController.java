package com.wb.shop.web.controller;

import com.wb.shop.constant.UrlView;
import com.wb.shop.manager.vo.CommodityVOManager;
import com.wb.shop.model.dto.CommodityDTO;
import com.wb.shop.model.vo.CommodityVO;
import com.wb.shop.model.vo.ResultVO;
import com.wb.shop.page.PageInfo;
import com.wb.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
@Controller
@RequestMapping(value = UrlView.Commodity.BASE)
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
    @Autowired
    private CommodityVOManager commodityVOManager;

    @GetMapping(value = UrlView.Commodity.PRODUCT_URL)
    public String product(@PathVariable("uuid") String uuid, ModelMap modelMap) {
        CommodityDTO commodityDTO = commodityService.getCommodityByUuid(uuid);
        CommodityVO commodityVO = commodityVOManager.convertToCommodityVO(commodityDTO);
        modelMap.put("commodity", commodityVO);
        return UrlView.Commodity.PRODUCT_VIEW;
    }

    @GetMapping(value = UrlView.Commodity.PRODUCT_LITS_URL)
    @ResponseBody
    public ResultVO list(PageInfo pageInfo) {
        ResultVO resultVO = new ResultVO();
        List<CommodityDTO> commodityDTOList = commodityService.findCommodityList(pageInfo);
        List<CommodityVO> commodityVOList = commodityVOManager.convertToCommodityVOList(commodityDTOList);
        resultVO.setDatas(commodityVOList);
        return resultVO;
    }

    @GetMapping(value = UrlView.Commodity.PRODUCT_ADD_URL)
    public String add() {
        return UrlView.Commodity.PRODUCT_ADD_VIEW;
    }

    @PostMapping(value = UrlView.Commodity.PRODUCT_ADD_URL)
    public String save(CommodityVO commodityVO) {
        CommodityDTO commodityDTO = commodityVOManager.convertToCommodityDTO(commodityVO);
        commodityService.saveCommodity(commodityDTO);
        return "redirect:/" + UrlView.Index.INDEX_URL;
    }
}
