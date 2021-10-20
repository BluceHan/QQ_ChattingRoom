package com.renfei.qqcommon;

import java.io.Serializable;
import java.util.Date;

/**
 * 表示客户端和服务器端通信时的消息对象
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sender;    //发送者
    private String receiver;  //接收者
    private String content;   //发送的内容
    private String sendTime;  //发送的时间
    private String msgType;   //消息类型[可以在接口中定义消息类型]

    //进行扩展，和文件相关的字段
    private byte[] fileBytes;
    private int fileLen = 0;
    private String dest;    //将文件传输到哪里去
    private String src;     //源文件路径

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public int getFileLen() {
        return fileLen;
    }

    public void setFileLen(int fileLen) {
        this.fileLen = fileLen;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public String getSendTime(Date date) {
        return sendTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
