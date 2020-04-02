package com.kidding.netty.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Administrator on 2019/4/24.
 */
public class DirectByteBuf {

    public static void main(String[] args) throws IOException {
//        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10);

        Selector open = Selector.open();
//        SelectorProvider
    }

}
