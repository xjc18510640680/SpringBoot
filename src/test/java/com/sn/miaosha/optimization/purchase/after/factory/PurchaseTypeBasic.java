package com.sn.miaosha.optimization.purchase.after.factory;

import com.sn.miaosha.optimization.purchase.before.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 11:15 2021/9/18
 * @description:
 */
public interface PurchaseTypeBasic {
    boolean purchaseHandler (PurchaseOrderMessageBody purchaseOrder);
}