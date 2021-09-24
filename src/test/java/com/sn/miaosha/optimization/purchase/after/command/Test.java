package com.sn.miaosha.optimization.purchase.after.command;

import com.sn.miaosha.optimization.purchase.after.command.execute.PurchaseExecute;
import com.sn.miaosha.optimization.purchase.after.command.impl.CreatePurchaseCommand;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 15:05 2021/9/24
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        PurchaseOrderMessageBody purchaseOrder = new PurchaseOrderMessageBody();
        purchaseOrder.setOrderType("XSD_PC");
        PurchaseExecute purchaseExecute = new PurchaseExecute();
        purchaseExecute.execute(new CreatePurchaseCommand(purchaseOrder));
    }
}
