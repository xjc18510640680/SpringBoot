package com.sn.miaosha.http;

/**
 * @author: XuJiuCheng
 * @date: Created in 10:56 2021/10/12
 * @description:
 */
public class HttpRequestTest {
    public static void main(String[] args) {
        //发送 GET 请求
        String result = HttpRequest.sendGet("https://pre-i0-nczgateway.carzone360.com/gateway/i0/logmanager/api/v1/search_log", "key=username=702693&page=1&page_size=100&app_name=ordercenter&start_time=2021-10-09+00:00:00&end_time=2021-10-09+23:59:59&host=&path=&message_and=&message_or=SALE_FINISH,SaleFulfilFinishListener&message_not=");
        System.out.println(result);
    }
}
