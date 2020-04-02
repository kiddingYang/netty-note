package com.kidding.netty.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IO2Nio {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("output.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        fileChannel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            byte b = buffer.get();
            System.out.print((char) b);
        }
        fileInputStream.close();
    }
}
