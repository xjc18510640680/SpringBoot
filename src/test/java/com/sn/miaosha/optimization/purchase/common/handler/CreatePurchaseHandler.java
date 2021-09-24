package com.sn.miaosha.optimization.purchase.common.handler;

import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:45 2021/9/18
 * @description:
 */
public class CreatePurchaseHandler {
    public static boolean handler(PurchaseOrderMessageBody purchaseOrder) {
        System.out.println("创建采购履约单");
        return true;
    }
}
