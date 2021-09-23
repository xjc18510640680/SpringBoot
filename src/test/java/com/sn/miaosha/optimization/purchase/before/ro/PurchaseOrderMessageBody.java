package com.sn.miaosha.optimization.purchase.before.ro;

import java.io.Serializable;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:38 2021/9/18
 * @description:
 */
public class PurchaseOrderMessageBody implements Serializable {
    private String orderType;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
