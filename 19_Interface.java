import java.util.*;
interface playable{
    void play();
}
class Guitar implements playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements playable{
    public void play(){
        System.out.println("Playing Piano");
    }
}
class Interface {
    public static void main(String[] args) {
        playable guitar = new Guitar();
        playable piano = new Piano();
        
        guitar.play();
        piano.play();
    }
}
