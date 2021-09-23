package com.sn.miaosha.optimization.purchase.after.factory.impl;

import com.sn.miaosha.optimization.purchase.after.factory.PurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.before.listener.handler.CreatePurchaseHandler;
import com.sn.miaosha.optimization.purchase.before.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:32 2021/9/18
 * @description:
 */
public class PurchaseType_XSD_PC implements PurchaseTypeBasic {
    @Override
    public boolean purchaseHandler(PurchaseOrderMessageBody purchaseOrder) {
        return CreatePurchaseHandler.handler(purchaseOrder);
    }
}
