package com.kidding.netty.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 2019/4/22.
 */
public class NioBuffer {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.txt");

        FileOutputStream fos = new FileOutputStream("output.txt");


        FileChannel inputChannel = fis.getChannel();
        FileChannel outputChannel = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            buffer.clear();
            int read = inputChannel.read(buffer);
            if (read == -1) {
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
        }
        inputChannel.close();
        outputChannel.close();
    }

}
