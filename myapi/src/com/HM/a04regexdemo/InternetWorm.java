package com.HM.a04regexdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InternetWorm {
    public static void main(String[] args)throws IOException {

        URL url =new URL("https://juejin.cn/post/7174240587585945631");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex="Java//w";
        Pattern p=Pattern.compile(regex);
        while((line=br.readLine())!=null){
            Matcher matcher = p.matcher(line);
            while(matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        br.close();

    }
}
