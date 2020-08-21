package master.springbootmvc.tmall.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
public class HttpUtils {

    public static String submitPostData(String strUrlPath, Map<String, String> params, String encode) {

        byte[] data = getRequestData(params, encode).toString().getBytes();
        try {

            URL url= new URL(strUrlPath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(10000);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", String.valueOf(data.length));
            //获得输出流，向服务器写入数据
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(data);
            int response = connection.getResponseCode();            //获得服务器的响应码
            if(response == HttpURLConnection.HTTP_OK) {
                InputStream inptStream = connection.getInputStream();
                return dealResponseResult(inptStream);                     //处理服务器的响应结果
            }
        } catch (Exception e) {
            return "err: " + e.getMessage().toString();
        }
        return "-1";
    }


    /**
     * 将请求的信息封装
     *
     * @param params
     * @param encode
     * @return
     */
    private static StringBuffer getRequestData(Map<String, String> params, String encode) {
        StringBuffer stringBuffer = new StringBuffer();
        try {

            for (Map.Entry<String, String> entry : params.entrySet()) {
                stringBuffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), encode)).append("&");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer;
    }

    private static String dealResponseResult(InputStream inputStream) {
        String resultData = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        try {
            while ((len = inputStream.read(data)) != -1) {
                baos.write(data, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        resultData = new String(baos.toByteArray());
        return resultData;
    }

}
