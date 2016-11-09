package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class LargeRoom extends  Room {
    public LargeRoom(int peopleCount) {
        super(peopleCount);
    }

    @Override
    public void reply(RoomApply roomApply) {
        roomApply.reply("可使用LargeRoom");
    }
}
