package com.yangq.selfmotivation.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * @author Rui.Zhang
 * @Classname FirstClientHandler
 * @Description TODO
 * @Date 2020/9/3 11:33 上午
 */
public class FirstClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("客户端发送消息...");
        for(int i =0;i<1000;i++){
            // 1. 获取数据
            ByteBuf buffer = getByteBuf(ctx);
            // 2. 写数据
            ctx.channel().writeAndFlush(buffer);
        }

    }
    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        // 1. 获取二进制抽象 ByteBuf
        ByteBuf buffer = ctx.alloc().buffer();
        // 2. 准备数据，指定字符串的字符集为 utf-8
        byte[] bytes = ("【客户端】:这是客户端发送的消息：123456789").getBytes(Charset.forName("utf-8"));
        // 3. 填充数据到 ByteBuf
        buffer.writeBytes(bytes);
        return buffer;
    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf byteBuf = (ByteBuf) msg;
        //接收服务端的消息并打印
        System.out.println(byteBuf.toString(Charset.forName("utf-8")));
    }
}
