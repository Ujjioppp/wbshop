package com.wb.shop.web.controller;

import com.wb.shop.constant.UrlView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ye on 24/10/18.
 */
@Controller
public class IndexController {

    @GetMapping(value = UrlView.Index.INDEX_URL)
    public String index() {
        return UrlView.Index.INDEX_VIEW;
    }
}
