public class FreeParking implements Tile{
    FreeParking(){

    }
    public void executeTile(ISP_Joshua j){
        //Remove money from bank
        //Put into player
        if(j.hasFreeParking) j.collectTax();
    }
    public int getTileType(){
        return 7;
    }
    public String getInfo(){
        return "Free Parking";
    }
}