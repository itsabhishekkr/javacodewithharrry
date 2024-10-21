public class l19interfaces {
    public static void main(String args[]){
        king k=new king();
        k.moves();
        Queen q=new Queen();
        q.moves();
    }  
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 direction)");
    }

}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("left,right");
    }
}
