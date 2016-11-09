package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */

public class SmallRoom extends Room {

    public SmallRoom(int peopleCount) {
        super(peopleCount);
    }

    @Override
    public void reply(RoomApply roomApply) {
        roomApply.reply("可使用SmallRoom");
    }
}
