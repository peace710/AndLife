package me.peace.design;

/**
 * Created by User_Kira on 2016/10/21.
 */
//原型模式
public class Prototype {
    public static void main(String[] args){
        Document document = new Document();
        document.setName("360云盘服务转型公告");
        document.setContent("当前部分不法分子利用360云盘存储传播非法文件、侵权盗版牟利、传播淫秽色情信息等违法犯罪行为屡有发生，严重侵犯正版企业的合法权益，更给社会带来了巨大的危害。\n" +
                "\n" +
                "     近年来，360云盘始终严格遵守互联网法律法规要求，持续投入大量人力物力以及技术资源，对非法行为进行严厉打击。但是，由于云盘存储的私密性，管理的复杂性，依然使企业面临巨大的安全风险。\n" +
                "\n" +
                "    因此，360云盘决定停止个人云盘服务，在网盘存储、传播内容的合法性和安全性得到彻底解决之前不再考虑恢复，之后转型企业云服务。\n" +
                "\n" +
                "      我们即将采取以下措施：\n" +
                "\n" +
                "     2016年10月20日至2017年2月1日进行会员退款。仍是会员身份的用户，无论剩余多少天，均全额退款；\n" +
                "\n" +
                "      2016年11月1日起停止云盘上传服务，包括上传、转存等数据写入功能均关闭；\n" +
                "\n" +
                "      2017年2月1日起不再保留云盘数据，关闭所有用户云盘服务并清空数据，请您务必在此之前下载备份数据 。\n" +
                "\n" +
                "对此给您造成的不便，我们深表歉意，感谢您的一路相伴。    \n" +
                "\n" +
                "360云盘\n" +
                "\n" +
                "2016年10月20日");
        System.out.println("文档的内容");
        document.print();

        Document doc = null;
        try {
            doc = (Document)document.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (null != doc) {
            doc.setName("360云盘服务转型公告[修订]");
            System.out.println("复制文档的内容");
            doc.print();
        }
    }
}

class Document implements Cloneable{
    private String name;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Document doc =  (Document)super.clone();
        doc.name = this.name;
        doc.content = this.content;
        return doc;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}