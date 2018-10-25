package com.wb.shop.bean;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by ye on 25/10/18.
 */
@Component
@Slf4j
public class FileUploader {
    @Autowired
    private UUIDGenerator uuidGenerator;

    public String upload(MultipartFile file) {
        String destFilePath = getImageResourcePath();
        String suffix = getSuffixWithDot(file.getOriginalFilename());
        String fileName = uuidGenerator.uuid() + suffix;
        String fullPath = destFilePath + File.separator + fileName;
        File destFile = new File(fullPath);
        try {
            file.transferTo(destFile);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        return fileName;
    }

    private String getImageResourcePath() {
        String path = ClassLoader.getSystemResource("").getPath() + "static/product";
        return path;
    }

    private String getSuffixWithDot(String fileName) {
        if (StringUtils.isBlank(fileName)) {
            return StringUtils.EMPTY;
        }
        int dotPosition = fileName.lastIndexOf(".");
        String suffix = fileName.substring(dotPosition);
        return suffix;
    }
}
