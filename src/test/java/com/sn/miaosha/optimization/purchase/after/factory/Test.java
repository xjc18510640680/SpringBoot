package com.sn.miaosha.optimization.purchase.after.factory;

import com.sn.miaosha.optimization.purchase.after.factory.operate.PurchaseHandler;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:45 2021/9/18
 * @description:
 */
public class Test {
    private static final String[] orderTypes = {"XSD_PC", "TRIANGULAR"};
    public static void main(String[] args) {
        PurchaseOrderMessageBody purchaseOrder = new PurchaseOrderMessageBody();
        for (String orderType : orderTypes) {
            purchaseOrder.setOrderType(orderType);
            PurchaseHandler.purchaseHandler(purchaseOrder);
        }
    }
}
