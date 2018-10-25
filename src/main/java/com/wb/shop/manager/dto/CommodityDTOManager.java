package com.wb.shop.manager.dto;

import com.wb.shop.domain.Commodity;
import com.wb.shop.model.dto.CommodityDTO;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
@Component
public class CommodityDTOManager {
    public CommodityDTO convertToCommodityDTO(Commodity commodity) {
        if (commodity == null) {
            return null;
        }
        CommodityDTO commodityDTO = new CommodityDTO();
        commodityDTO.setId(commodity.getId());
        commodityDTO.setCreateTime(commodity.getCreateTime());
        commodityDTO.setCreator(commodity.getCreator());
        commodityDTO.setDeleted(commodity.getDeleted());
        commodityDTO.setDescription(commodity.getDescription());
        commodityDTO.setImg(commodity.getImg());
        commodityDTO.setName(commodity.getName());
        commodityDTO.setPrice(commodity.getPrice());
        commodityDTO.setTitle(commodity.getTitle());
        commodityDTO.setUpdater(commodity.getUpdater());
        commodityDTO.setUpdateTime(commodity.getUpdateTime());
        commodityDTO.setUuid(commodity.getUuid());

        return commodityDTO;
    }

    public List<CommodityDTO> convertToCommodityDTOList(List<Commodity> commodityList) {
        if (CollectionUtils.isEmpty(commodityList)) {
            return null;
        }
        List<CommodityDTO> commodityDTOList = new ArrayList<CommodityDTO>(commodityList.size());
        for (Commodity commodity : commodityList) {
            CommodityDTO commodityDTO = convertToCommodityDTO(commodity);
            if (commodityDTO != null) {
                commodityDTOList.add(commodityDTO);
            }
        }
        return commodityDTOList;
    }
}
