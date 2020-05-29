package com.sn.miaosha.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListUtils {

    /**
     * 按给定条数分组
     * @param list
     * @param initSize
     * @return
     */
    public static List<List<Map<String, Object>>> groupList(List<Map<String, Object>> list, int initSize){
        int toIndex = initSize;
        List<List<Map<String, Object>>> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i += initSize){
            // 作用为toIndex最后没有initSize条数据则剩余几条newList中就装几条
            if(i + initSize > list.size()){
                toIndex = list.size() - i;
            }
            newList.add(list.subList(i, i + toIndex));
        }
        return newList;
    }
}
