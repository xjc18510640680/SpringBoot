package com.sn.miaosha.optimization.purchase.before.enums;

import org.junit.platform.commons.util.StringUtils;

/**
 * 采购单类型
 *
 * @author wujiao
 * @since 2020/10/13
 */
public enum PurchaseTypeEnum {
    /**
     * 零星采购 属于标准采购单
     */
    STANDARD(1, "ORDER_PO", "康众标准采购订单"),

    DIRECT(2, "ORDER_PD", "康众直发订单"),

    CONSINGN(3, "ORDER_PC", "康众寄售订单"),

    FREE(4, "ORDER_PF", "康众免费订单"),

    MANUAL(5, "ORDER_PI", "康众手工创建订单"),

    DISPOSABLE(6, "ORDER_POF", "康众一次性采购订单"),

    TRIANGULAR(7, "ORDER_PT", "康众三角订单"),

    XSD_PC(8, "ORDER_XSDPC", "销转采订单"),

    ZYCS(11, "ORDER_ZYCS", "自营厂送业务"),;

    private Integer purchaseType;
    private String purchaseName;
    private String purchaseDesc;

    PurchaseTypeEnum(Integer purchaseType, String purchaseName, String purchaseDesc) {
        this.purchaseType = purchaseType;
        this.purchaseName = purchaseName;
        this.purchaseDesc = purchaseDesc;
    }

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * 通过采购name,获取采购类型
     * @param purchaseName
     * @return
     */
    public static Integer getPurchaseTypeByName(String purchaseName) {
        if (null == purchaseName || StringUtils.isBlank(purchaseName.trim())) {
            return null;
        }
        for (PurchaseTypeEnum purchaseTypeEnum : values()) {
            if (purchaseTypeEnum.getPurchaseName().equals(purchaseName.trim())) {
                return purchaseTypeEnum.getPurchaseType();
            }
        }
        return null;
    }

    /**
     * 通过采购name,获取采购类型
     * @param purchaseName
     * @return
     */
    public static PurchaseTypeEnum getPurchaseTypeEnumByName(String purchaseName) {
        if (null == purchaseName || StringUtils.isBlank(purchaseName.trim())) {
            return null;
        }
        for (PurchaseTypeEnum purchaseTypeEnum : values()) {
            if (purchaseTypeEnum.getPurchaseName().equals(purchaseName.trim())) {
                return purchaseTypeEnum;
            }
        }
        return null;
    }

    /**
     * 通过采购type,获取采购类型
     * @param type
     * @return
     */
    public static PurchaseTypeEnum getPurchaseType(Integer type) {
        if (null == type) {
            return null;
        }
        for (PurchaseTypeEnum purchaseTypeEnum : values()) {
            if (purchaseTypeEnum.getPurchaseType().equals(type)) {
                return purchaseTypeEnum;
            }
        }
        return null;
    }
    /**
     * 通过采购type,获取采购类型
     * @param type
     * @return
     */
    public static boolean isAutoPurchaseType(Integer type) {
        if(PurchaseTypeEnum.XSD_PC.getPurchaseType().equals(type)){
            return true;
        }
        return PurchaseTypeEnum.ZYCS.getPurchaseType().equals(type);
    }
}
