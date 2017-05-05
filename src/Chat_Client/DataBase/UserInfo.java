package Chat_Client.DataBase;

/**
 * Created by Wu on 2017/5/6.
 * 此类为用户的基本信息
 */
public class UserInfo {
    private int IDNum;// 保存该用户的ID号
    private String NickName;// 保存该用户的昵称
    private String PassWord;// 保存该用户的密码
    private int Picture;//用户的头像号

    //好友信息
    private byte listCount;// 保存有多少组好友
    private String ListName[];// 保存每个分组的名称
    private byte[] bodyCount;// 每组有多少个人
    private int bodyNum[][];// 每个好友的ID号
    private int bodypic[][];//好友头像
    private String friendNickName[][];// 每个好友的昵称

    //群组信息 getter 和 setter 还没写
    private byte groupCount;//保存有多少组群聊
    private String ListGroup[];//群聊名称
    private byte[] grouperCount;//群聊中人数
    private int grouperNum[][]; //群聊人中的ID号
    private String grouperNickName[][]; //群聊中每个人的昵称
    private boolean isFriend[][]; //群聊中每个人是否为自己的好友


    public byte getListCount() {return listCount;}
    public void setListCount(byte listCount) {this.listCount = listCount;}

    public String[] getListName() {return ListName;}
    public void setListName(String[] listName) {ListName = listName;}

    public byte[] getBodyCount() {return bodyCount;}
    public void setBodyCount(byte[] bodyCount) {this.bodyCount = bodyCount;}

    public int[][] getBodyNum() {return bodyNum;}
    public void setBodyNum(int[][] bodyNum) {this.bodyNum = bodyNum;}

    public String[][] getFriendNickName() {return friendNickName;}
    public void setFriendNikeName(String[][] nikeName) {this.friendNickName = nikeName;}

    public int getIDNum() {return IDNum;}
    public void setIDNum(int IDNum) {this.IDNum = IDNum;}

    public String getNickName() {return NickName;}
    public void setNickName(String nickName) {NickName = nickName;}

    public String getPassWord() {return PassWord;}
    public void setPassWord(String passWord) {PassWord = passWord;}

    public int getPic() {return Picture;}
    public void setPic(int pic) {Picture = pic;}

    public int[][] getBodypic() {return bodypic;}
    public void setBodypic(int bodypic[][]) {this.bodypic = bodypic;}

    public boolean equals(UserInfo compare) {
        if (compare.getIDNum() == IDNum && compare.getPassWord().equals(PassWord)) {
            return true;
        }
        return false;
    }
}
