public class main {
    public static void main(String[] args) {
        System.out.println(" SAMPLE GAME PROJECT OF 2PLAYERS FIGHTING TO EACH OTHER WITH WEAPONS");
        player1 player =new player1("hammad","sword",500);
        System.out.println(player.getName());
      System.out.println(player.getHealth());
        System.out.println(player.getweapon());
    player.damageGun1();
    player.damageGun1();
    player.damageGun2();
    player.heal();

      player2 betterplayer=new player2("subhan","machine gun",80,true);
        System.out.println(betterplayer.getName());
        System.out.println(betterplayer.getHealth());
        System.out.println(betterplayer.getweapon());
    //  betterplayer.damageGun1();
    //  betterplayer.damageGun1();
      betterplayer.damageGun2();
      betterplayer.heal();
    }
}
