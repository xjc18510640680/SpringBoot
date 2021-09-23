package com.sn.miaosha.optimization.purchase.after.factory;

import com.sn.miaosha.optimization.purchase.after.factory.operate.OperatePurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.before.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:45 2021/9/18
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        PurchaseOrderMessageBody purchaseOrder = new PurchaseOrderMessageBody();

        purchaseOrder.setOrderType("XSD_PC");
        purchaseHandler(purchaseOrder);
    }
    public static void purchaseHandler(PurchaseOrderMessageBody purchaseOrder) {
        PurchaseTypeBasic operation = OperatePurchaseTypeBasic.getOperation((purchaseOrder.getOrderType())).orElseThrow(
                ()-> new IllegalArgumentException("Invalid Operator")
        );
        operation.purchaseHandler(purchaseOrder);
    }
}
