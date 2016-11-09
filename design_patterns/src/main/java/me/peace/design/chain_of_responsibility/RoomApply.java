package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class RoomApply {
    private int peopleCount;
    private String reply;

    public RoomApply(int peopleCount){
        this.peopleCount = peopleCount;
    }

    public int getCount() {
        return peopleCount;
    }

    public void obtainReply() {
        System.out.println(reply);
    }

    public void reply(String reply) {
        this.reply = reply;
    }
}
