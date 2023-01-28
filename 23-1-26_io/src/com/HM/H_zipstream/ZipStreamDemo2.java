package com.HM.H_zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    /*
     * 压缩流
     *      需求：
     *          把test.txt打包成一个压缩包
     */
    public static void main(String[] args) throws IOException {

        File src =new File("23-1-26_io\\test.txt");

        File dest = new File("23-1-26_io\\src\\com\\HM");
        toZip(src,dest);

    }

    public static void toZip(File src,File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"test.zip")));

        ZipEntry entry =new ZipEntry("test.txt");

        zos.putNextEntry(entry);

        FileInputStream fis =new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();

    }
}
