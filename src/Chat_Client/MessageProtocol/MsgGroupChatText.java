package Chat_Client.MessageProtocol;

/**
 * Created by Wu on 2017/5/16.
 * 群聊消息体
 * type 0x06
 */
public class MsgGroupChatText extends MsgHead {
    private String msgText; //destination此时为群聊的ID号

    public String getMsgText() {
        return msgText;
    }
    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }
}
