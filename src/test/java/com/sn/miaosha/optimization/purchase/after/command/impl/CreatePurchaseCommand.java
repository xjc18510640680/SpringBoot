package com.sn.miaosha.optimization.purchase.after.command.impl;

import com.sn.miaosha.optimization.purchase.after.command.Command;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:57 2021/9/24
 * @description:
 */
public class CreatePurchaseCommand implements Command {

    private PurchaseOrderMessageBody purchaseOrder;

    public CreatePurchaseCommand(PurchaseOrderMessageBody purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @Override
    public boolean execute() {
        System.out.println("创建采购履约单");
        return true;
    }
}
