package com.sn.miaosha.optimization.purchase.after.command.execute;

import com.sn.miaosha.optimization.purchase.after.command.Command;
import com.sn.miaosha.optimization.purchase.common.ro.PurchaseOrderMessageBody;

/**
 * @author: XuJiuCheng
 * @date: Created in 15:03 2021/9/24
 * @description:
 */
public class PurchaseExecute {
    public boolean execute(Command command) {
        return command.execute();
    }
}
