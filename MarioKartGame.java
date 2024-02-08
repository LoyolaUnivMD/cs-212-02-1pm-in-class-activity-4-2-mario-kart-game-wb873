public class MarioKartGame {
    public static void main(String[] args){
        //creates the mario kart players
        MarioKartPlayer p1 = new MarioKartPlayer("Mr. John", "Toad", 1);
        MarioKartPlayer p2 = new MarioKartPlayer("Wil", "Luigi", 83);
        MarioKartPlayer p3 = new MarioKartPlayer();

        //original information for players
        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        p3.displayInfo();
        System.out.println();
        //prints out what the accelerated to and accelerates them using the boost method
        p1.boost(30);
        System.out.println(p1.getName()+" accelerates to "+p1.getSpeed()+"!");

        p2.boost(50);
        System.out.println(p2.getName()+" accelerates to "+p2.getSpeed()+"!");
        //outputs who is better at mario kart :)
        System.out.println("Wil beats Mr. John by ALOT!!!!");
    }
}
