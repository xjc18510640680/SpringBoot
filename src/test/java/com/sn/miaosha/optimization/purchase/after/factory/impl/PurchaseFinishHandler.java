package com.sn.miaosha.optimization.purchase.after.factory.impl;

import com.sn.miaosha.optimization.purchase.after.factory.PurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 09:45 2021/9/18
 * @description:
 */
public class PurchaseFinishHandler implements PurchaseTypeBasic {
    public boolean purchaseHandler(PurchaseOrderMessageBody purchaseOrder) {
        System.out.println("通知采购履约完成");
        return true;
    }
}
