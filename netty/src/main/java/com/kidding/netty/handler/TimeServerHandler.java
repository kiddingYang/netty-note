package com.kidding.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author Administrator
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf)msg;
        System.out.println(byteBuf.toString(CharsetUtil.US_ASCII));
        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Client$$".getBytes()));
        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Client$$".getBytes()));
        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Client$$".getBytes()));
//        TimeUnit.SECONDS.sleep(10);
        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Client$$".getBytes()));
    }
}
