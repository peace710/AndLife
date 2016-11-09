package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class MidRoom extends Room {
    public MidRoom(int peopleCount) {
        super(peopleCount);
    }

    @Override
    public void reply(RoomApply roomApply) {
        roomApply.reply("可使用MidRoom");
    }
}
