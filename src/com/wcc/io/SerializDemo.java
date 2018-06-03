package com.wcc.io;

import javassist.util.proxy.ProxyObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/6/3 17:51
 */
public class SerializDemo {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setAge(20);
        user.setName("wcc");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.seri"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.seri"));
        User user1 = (User) ois.readObject();
        System.out.println(user1.getAge()+","+user1.getName());
    }
}
