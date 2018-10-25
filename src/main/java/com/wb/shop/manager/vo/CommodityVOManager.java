package com.wb.shop.manager.vo;

import com.wb.shop.constant.Interaction;
import com.wb.shop.model.dto.CommodityDTO;
import com.wb.shop.model.vo.CommodityVO;
import com.wb.shop.util.DateUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ye on 25/10/18.
 */
@Component
public class CommodityVOManager {
    public CommodityVO convertToCommodityVO(CommodityDTO commodityDTO) {
        if (commodityDTO == null) {
            return null;
        }
        CommodityVO commodityVO = new CommodityVO();
        Long id = commodityDTO.getId();
        if (id != null) {
            commodityVO.setId(id.toString());
        }
        Date createTime = commodityDTO.getCreateTime();
        if (createTime != null) {
            commodityVO.setCreateTime(DateFormatUtils.format(createTime, Interaction.DATE_TIME_FORMAT_PATTERN));
        }
        Long creator = commodityDTO.getCreator();
        if (creator != null) {
            commodityVO.setCreator(creator.toString());
        }
        Integer deleted = commodityDTO.getDeleted();
        if (deleted != null) {
            commodityVO.setDeleted(creator.toString());
        }
        commodityVO.setDescription(commodityDTO.getDescription());
        commodityVO.setImg(commodityDTO.getImg());
        commodityVO.setName(commodityDTO.getName());
        BigDecimal price = commodityDTO.getPrice();
        if (price != null) {
            commodityVO.setPrice(price.toPlainString());
        }
        commodityVO.setTitle(commodityDTO.getTitle());

        Date updateTime = commodityDTO.getUpdateTime();
        if (updateTime != null) {
            commodityVO.setUpdateTime(DateFormatUtils.format(updateTime, Interaction.DATE_TIME_FORMAT_PATTERN));
        }
        Long updater = commodityDTO.getUpdater();
        if (updater != null) {
            commodityVO.setUpdater(updater.toString());
        }
        commodityVO.setUuid(commodityDTO.getUuid());
        return commodityVO;
    }

    public CommodityDTO convertToCommodityDTO(CommodityVO commodityVO) {
        if (commodityVO == null) {
            return null;
        }
        CommodityDTO commodityDTO = new CommodityDTO();
        String id = commodityVO.getId();
        if (StringUtils.isNotBlank(id)) {
            commodityDTO.setId(Long.valueOf(id));
        }
        String createTime = commodityVO.getCreateTime();
        if (StringUtils.isNotBlank(createTime)) {
            commodityDTO.setCreateTime(DateUtil.parseDateTime(createTime));
        }
        String creator = commodityVO.getCreator();
        if (StringUtils.isNotBlank(creator)) {
            commodityDTO.setCreator(Long.valueOf(creator));
        }
        String deleted = commodityVO.getDeleted();
        if (StringUtils.isNotBlank(deleted)) {
            commodityDTO.setDeleted(Integer.valueOf(deleted));
        }
        commodityDTO.setDescription(commodityVO.getDescription());
        commodityDTO.setImg(commodityVO.getImg());
        commodityDTO.setName(commodityVO.getName());
        String price = commodityVO.getPrice();
        if (StringUtils.isNotBlank(price)) {
            commodityDTO.setPrice(new BigDecimal(price));
        }
        commodityDTO.setTitle(commodityVO.getTitle());

        String updateTime = commodityVO.getUpdateTime();
        if (StringUtils.isNotBlank(updateTime)) {
            commodityDTO.setUpdateTime(DateUtil.parseDateTime(updateTime));
        }
        String updater = commodityVO.getUpdater();
        if (StringUtils.isNotBlank(updater)) {
            commodityDTO.setUpdater(Long.valueOf(updater));
        }
        commodityDTO.setUuid(commodityVO.getUuid());
        return commodityDTO;
    }

    public List<CommodityVO> convertToCommodityVOList(List<CommodityDTO> commodityDTOList) {
        if (CollectionUtils.isEmpty(commodityDTOList)) {
            return null;
        }
        List<CommodityVO> commodityVOList = new ArrayList<CommodityVO>(commodityDTOList.size());
        for (CommodityDTO commodityDTO : commodityDTOList) {
            CommodityVO commodityVO = convertToCommodityVO(commodityDTO);
            if (commodityVO != null) {
                commodityVOList.add(commodityVO);
            }
        }
        return commodityVOList;
    }
}
