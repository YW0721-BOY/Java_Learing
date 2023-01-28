package com.HM.H_zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    /*
     * 解缩
     */
    public static void main(String[] args) throws IOException {
        File src =new File("");

        File dest =new File("");

        unzip(src,dest);

    }

    public static void unzip(File src,File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地中

        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip =new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            if (entry.isDirectory()){
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File file =new File(dest,entry.toString() );
                file.mkdirs();
            }else {
                //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos =new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
            }
            zip.closeEntry();
        }
        zip.close();
    }
}
