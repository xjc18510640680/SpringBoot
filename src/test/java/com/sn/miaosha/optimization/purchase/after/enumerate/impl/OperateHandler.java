package com.sn.miaosha.optimization.purchase.after.enumerate.impl;

import com.sn.miaosha.optimization.purchase.after.enumerate.enume.PurchaseTypeEnum;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:14 2021/9/24
 * @description:
 */
public class OperateHandler {
    public boolean handler(PurchaseOrderMessageBody purchaseOrder, PurchaseTypeEnum purchaseTypeEnum) {
        return purchaseTypeEnum.handler(purchaseOrder);
    }
}
