package com.wcc.io;

import java.io.*;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 19:50
 */
public class ReaderAndWriter {
    public static void main(String[] args) throws Exception {
        try (BufferedWriter bw =new BufferedWriter(new FileWriter("f4.txt"))){
            bw.append("Hello");
            bw.newLine();
            bw.append("yan");
            bw.flush();
        }

        FileReader reader = new FileReader("f4.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
