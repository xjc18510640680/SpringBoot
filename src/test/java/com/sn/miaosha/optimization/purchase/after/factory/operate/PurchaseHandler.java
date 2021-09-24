package com.sn.miaosha.optimization.purchase.after.factory.operate;

import com.sn.miaosha.optimization.purchase.after.factory.PurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 10:47 2021/9/24
 * @description:
 */
public class PurchaseHandler {
    public static void purchaseHandler(PurchaseOrderMessageBody purchaseOrder) {
        PurchaseTypeBasic operation = OperatePurchaseTypeBasic.getOperation((purchaseOrder.getOrderType())).orElseThrow(
                ()-> new IllegalArgumentException("Invalid Operator")
        );
        operation.purchaseHandler(purchaseOrder);
    }
}
