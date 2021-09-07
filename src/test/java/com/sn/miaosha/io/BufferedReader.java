package com.sn.miaosha.io;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: XuJiuCheng
 * @date: Created in 14:45 2021/9/2
 * @description:
 */
public class BufferedReader {

    private static final String pathname = "/Users/xujiucheng/Desktop/work/idea-workspace/GitSelf/miaosha/src/test/java/com/sn/miaosha/io/test.txt";

    public static void main(String[] args) {
        //发送 GET 请求
//        String s = HttpRequest.sendGet("http://localhost:6144/Home/RequestString", "key=123&v=456");
//        System.out.println(s);

        //发送 POST 请求
//        String sr = HttpRequest.sendPost("https://prod-i0-scfcoord.carzone360.com/backdoor/event/retry?", "id=[100000718228473226]");
//        System.out.println(sr);
        getIdLists(BufferedReader.getTexts()).forEach(System.out::println);
        System.out.println(new BigDecimal("25000").subtract(new BigDecimal("499.72").add(new BigDecimal("1500")).add(new BigDecimal("1479.07"))));
    }

    /**
     * 获取文件中的内容放入List<String>
     */
    public static List<String> getTexts() {
        List<String> readLists = new ArrayList<>();
        try {
            System.out.println(pathname);
            readLists = Files
                    .lines(Paths.get(pathname), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split("\n")))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readLists;
    }

    public static List<String> getIdLists(List<String> list) {
        List<String> resultList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder().append("[");
        list.forEach(idList->{
            stringBuilder.append(idList.substring(1, idList.indexOf("]"))).append(",");
        });
        resultList.add(stringBuilder.append("]").toString());
        return resultList;
    }

}
