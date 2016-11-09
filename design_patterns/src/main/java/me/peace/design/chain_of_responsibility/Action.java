package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */
//责任链模式
public class Action {
    public static void main(String[] args){
        LargeRoom largeRoom = new LargeRoom(40);
        MidRoom midRoom = new MidRoom(20);
        midRoom.setRoom(largeRoom);
        SmallRoom smallRoom = new SmallRoom(8);
        smallRoom.setRoom(midRoom);

        RoomApply roomApply4 = new RoomApply(4);
        smallRoom.handleApply(roomApply4);
        roomApply4.obtainReply();

        RoomApply roomApply16 = new RoomApply(16);
        smallRoom.handleApply(roomApply16);
        roomApply16.obtainReply();

        RoomApply roomApply32 = new RoomApply(32);
        smallRoom.handleApply(roomApply32);
        roomApply32.obtainReply();

        RoomApply roomApply48 = new RoomApply(48);
        smallRoom.handleApply(roomApply48);
        roomApply48.obtainReply();
    }
}
