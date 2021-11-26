package com.sn.miaosha.io;

import java.io.IOException;
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

    private static final String pathname = "/Users/xujiucheng/Desktop/idea-workspace/GitSelf/miaosha/src/test/java/com/sn/miaosha/io/test.txt";

    public static void main(String[] args) {
        System.out.println(getIdLists(BufferedReader.getTexts()));
    }

    /**
     * 获取文件中的内容放入List<String>
     */
    public static List<String> getTexts() {
        List<String> readLists = new ArrayList<>();
        try {
            System.out.println(pathname);
            readLists = Files.lines(Paths.get(pathname), Charset.defaultCharset()).flatMap(line -> Arrays.stream(line.split("\n"))).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readLists;
    }

    public static List<String> getIdLists(List<String> list) {
        List<String> resultList = new ArrayList<>();
        list.forEach(idList->{
            resultList.add(idList.substring(1, idList.indexOf("]")));
        });
        return resultList;
    }

}
