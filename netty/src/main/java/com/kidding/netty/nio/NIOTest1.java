package com.kidding.netty.nio;

import com.sun.tools.attach.VirtualMachine;
import sun.management.ConnectorAddressLink;

import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NIOTest1 {

    public static void main(String[] args) throws IOException {
        IntBuffer buffer = IntBuffer.allocate(10);
        System.out.println(buffer.capacity());
        for (int i = 0; i < buffer.capacity(); i++) {
            int random = new SecureRandom().nextInt(20);
            buffer.put(random);
        }
//        buffer.flip();
//        System.out.println(buffer.get());
//        System.out.println(buffer.get());
//        buffer.flip();
//        for (int i = 0; i < 2; i++) {
//            int random = new SecureRandom().nextInt(20);
//            buffer.put(random);
//        }



    }

}
