package com.sn.miaosha.optimization.purchase.before.listener;

import com.sn.miaosha.optimization.purchase.before.enums.PurchaseTypeEnum;
import com.sn.miaosha.optimization.purchase.before.listener.handler.CreatePurchaseHandler;
import com.sn.miaosha.optimization.purchase.before.listener.handler.PurchaseFinishHandler;
import com.sn.miaosha.optimization.purchase.before.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:32 2021/9/18
 * @description:
 */
public class PurchaseFulfilFinishListener {
    public static void main(String[] args) {
        PurchaseOrderMessageBody purchaseOrder = new PurchaseOrderMessageBody();
        purchaseOrder.setOrderType("ORDER_XSDPC");
        consume(purchaseOrder);
    }

    public static boolean consume(PurchaseOrderMessageBody purchaseOrder) {
        PurchaseTypeEnum purchaseTypeEnum = PurchaseTypeEnum.getPurchaseTypeEnumByName(purchaseOrder.getOrderType());
        switch (purchaseTypeEnum) {
            case XSD_PC:
            case ZYCS:
                return CreatePurchaseHandler.handler(purchaseOrder);
            default:
                return PurchaseFinishHandler.handler(purchaseOrder);
        }
    }
}
