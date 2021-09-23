package com.sn.miaosha.optimization.purchase.after.factory.operate;

import com.sn.miaosha.optimization.purchase.after.factory.PurchaseTypeBasic;
import com.sn.miaosha.optimization.purchase.after.factory.impl.PurchaseType_XSD_PC;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:37 2021/9/18
 * @description:
 */
public class OperatePurchaseTypeBasic {
    static Map<String, PurchaseTypeBasic> operationMap = new HashMap<>();
    static {
        operationMap.put("XSD_PC", new PurchaseType_XSD_PC());
    }
    public static Optional<PurchaseTypeBasic> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
