public class CommunityChestTile implements Tile{
    CommunityChestTile(){

    }
    public void executeTile(ISP_Joshua j){
        //Same thing as ChanceTile
        j.pickCommunityChestCard();
    }
    public int getTileType(){
        return 5;
    }
    public String getInfo(){
        return "Community Chest";
    }
}