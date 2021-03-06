package Chat_Client.DataBase;

import Chat_Client.Chat_Client;
import Chat_Client.UI.AddFriendUI.AddFriendUI;
import Chat_Client.UI.AddGroupUI.AddGroupUI;
import Chat_Client.UI.GroupDialogUI.GroupDialogUI;
import Chat_Client.UI.CustomizedUI.ListPane;
import Chat_Client.UI.MainInterfaceUI.MainInterfaceUI;

/**
 * Created by Wu on 2017/5/6.
 */
public class FigureProperty {
    public static final int ServerID = 2000000000;// 服务器的ID号
    public static final int LoginID = 2000000001;// 登陆界面的ID号
    public static Chat_Client cc;
    public static int IDNum;
    public static int Pic;
    public static String NickName;
    public static ListPane list;    //好友列表
    public static AddFriendUI addFriendUI;
    public static AddGroupUI addGroupUI;
    public static MainInterfaceUI mainInterfaceUI;
    public static ListPane groupList; //群聊列表
}
