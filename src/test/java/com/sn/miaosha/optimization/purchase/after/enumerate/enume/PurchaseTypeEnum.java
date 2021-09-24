package com.sn.miaosha.optimization.purchase.after.enumerate.enume;

import com.sn.miaosha.optimization.purchase.common.handler.CreatePurchaseHandler;
import com.sn.miaosha.optimization.purchase.common.handler.PurchaseFinishHandler;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 13:57 2021/9/24
 * @description:
 */
public enum PurchaseTypeEnum{
    XSD_PC{
        @Override
        public boolean handler(PurchaseOrderMessageBody purchaseOrder) {
            return CreatePurchaseHandler.handler(purchaseOrder);
        }
    },
    TRIANGULAR{
        @Override
        public boolean handler(PurchaseOrderMessageBody purchaseOrder) {
            return PurchaseFinishHandler.handler(purchaseOrder);
        }
    };

    public abstract boolean handler(PurchaseOrderMessageBody purchaseOrder);
}
