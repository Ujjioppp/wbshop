package com.wb.shop.constant;

/**
 * Created by ye on 24/10/18.
 */
public class UrlView {

    /**
     * 首页
     */
    public static final class Index {
        public static final String INDEX_URL = "";
        public static final String INDEX_VIEW = "index";
    }

    public static final class Commodity {
        public static final String BASE = "commodity";


        public static final String PRODUCT_URL = "product/{uuid}";
        public static final String PRODUCT_VIEW = "product";

        public static final String PRODUCT_LITS_URL = "list";



        public static final String PRODUCT_ADD_URL = "add";
        public static final String PRODUCT_ADD_VIEW = "add";


    }
}
