package com.sn.miaosha.optimization.purchase.after.factory.impl;

import com.sn.miaosha.optimization.purchase.after.factory.PurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:45 2021/9/18
 * @description:
 */
public class CreatePurchaseHandler implements PurchaseTypeBasic {
    public boolean purchaseHandler(PurchaseOrderMessageBody purchaseOrder) {
        System.out.println("创建采购履约单");
        return true;
    }
}
