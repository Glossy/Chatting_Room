package Chat_Server.MessageProtocol;

import java.io.*;

/**
 * Created by Wu on 2017/5/8.
 */
public class MsgHead {
    private int totalLen;
    private byte type;
    private int destination;
    private int source;

    /**
     * 从 `socket` 输入流中读取并解析出 Message
     * @param stream 输入流
     * @return 客户端发送的消息
     * @throws IOException IO异常
     */
    public static MsgHead readMessageFromStream(DataInputStream stream) throws IOException {
        int totalLen = stream.readInt();
        byte[] data = new byte[totalLen - 4];
        stream.readFully(data);
        MsgHead message = MsgParser.parseMsg(data);// 解包该信息
        return message;
    }

    public void send(OutputStream outputStream) throws IOException {
        byte[] message = this.packMessage();// 将传输的信息打包
        outputStream.write(message);
        outputStream.flush();
    }
    protected void packMessageHead(DataOutputStream dous) throws IOException {
        dous.writeInt(getTotalLen());
        dous.writeByte(getType());
        dous.writeInt(getDestination());
        dous.writeInt(getSource());
    }
    protected void writeString(DataOutputStream dous, int len, String s) throws IOException {
        byte[] data = s.getBytes();
        if (data.length > len) {
            throw new IOException("写入长度超长");
        }
        dous.write(data);
        while (data.length < len) {
            dous.writeByte('\0');
            len--;
        }
    }
    public byte[] packMessage() throws IOException {
        ByteArrayOutputStream bous = new ByteArrayOutputStream();
        DataOutputStream dous = new DataOutputStream(bous);
        packMessageHead(dous);
        dous.flush();
        byte[] data = bous.toByteArray();
        return data;
    }


    public int getTotalLen() {
        return totalLen;
    }

    public void setTotalLen(int totalLen) {
        this.totalLen = totalLen;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}