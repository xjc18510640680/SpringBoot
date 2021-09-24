package com.sn.miaosha.optimization.purchase.after.enumerate;

import com.sn.miaosha.optimization.purchase.after.enumerate.enume.PurchaseTypeEnum;
import com.sn.miaosha.optimization.purchase.after.enumerate.impl.OperateHandler;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:16 2021/9/24
 * @description:
 */
public class Test {
    private static final String[] orderTypes = {"XSD_PC", "TRIANGULAR"};
    public static void main(String[] args) {
        PurchaseOrderMessageBody purchaseOrder = new PurchaseOrderMessageBody();
        OperateHandler operateHandler = new OperateHandler();
        for (String orderType : orderTypes) {
            purchaseOrder.setOrderType(orderType);
            operateHandler.handler(purchaseOrder, PurchaseTypeEnum.valueOf(orderType));
        }
    }
}
