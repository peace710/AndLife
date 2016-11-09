package me.peace.design.chain_of_responsibility;

/**
 * Created by User_Kira on 2016/10/21.
 */

//房间规模 SmallRoom < MidRoom < LargeRoom
public abstract class Room {
    //高一规模的房间
    private Room room;
    private int peopleCount;

    public Room(int peopleCount){
        this.peopleCount = peopleCount;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public void handleApply(RoomApply roomApply){
         int count = roomApply.getCount();
         if (count < peopleCount){
             reply(roomApply);
         }else{
             if (null != room){
                 room.handleApply(roomApply);
             }else{
                 roomApply.reply("没有可容纳" + count + "人数的房间!");
             }
         }
    }

    public abstract void reply(RoomApply roomApply);
}
