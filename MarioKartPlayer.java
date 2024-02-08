//Wil Burgess
// Mr. John
//Mario Kart MarioKartGame
// feb 8, 2024
//input: none
//output: the players information and how wil beat mr john by a lot after his boost
public class MarioKartPlayer {
    //initializes variables
    private String playerName;
    private String character;
    private double speed;
//default constructor
    public MarioKartPlayer(){
        this.playerName = "Unknown";
        this.character = "Unknowwn";
        this.speed = 0;
    }
    //constructor with all the info
    public MarioKartPlayer(String pn, String c, double s){
        this.playerName = pn;
        this.character = c;
        this.speed = s;
    }
    //method to output playerName
    public String getName(){
        return  playerName;
    }
    //method to output speed
    public double getSpeed(){
        return speed;
    }
    //method to increase the speed
    public void boost(int b){
        speed += b;
    }
    //method that displays the name character and speed of the person
    public void displayInfo(){
        System.out.println("Name: "+playerName+"\nCharacter: "+character+"\nSpeed: "+speed);
    }


}
