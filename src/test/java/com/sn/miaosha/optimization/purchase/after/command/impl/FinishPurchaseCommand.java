package com.sn.miaosha.optimization.purchase.after.command.impl;

import com.sn.miaosha.optimization.purchase.after.command.Command;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 15:01 2021/9/24
 * @description:
 */
public class FinishPurchaseCommand implements Command {

    private PurchaseOrderMessageBody purchaseOrder;

    public FinishPurchaseCommand(PurchaseOrderMessageBody purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @Override
    public boolean execute() {
        System.out.println("通知采购履约完成");
        return true;
    }
}
