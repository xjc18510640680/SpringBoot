package com.sn.miaosha.optimization.purchase.common.handler;

import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:45 2021/9/18
 * @description:
 */
public class PurchaseFinishHandler {
    public static boolean handler(PurchaseOrderMessageBody purchaseOrder) {
        System.out.println("通知采购履约完成");
        return true;
    }
}
