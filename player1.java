 public class player1 {
    private String name;
    private String weapon;
    private int health;

    public player1(String name, String weapon, int health){
        this.name=name;
        this.weapon=weapon;
     if (health < 0 || health > 100){
         this.health = 100;
     }else this.health =health;
    }
    public void damageGun1() {
        this.health -=30;
        if (this.health <=0){
            this.health=0;
        }
        System.out.println("GOT HIT BY GUN1. HEALTH IS REDUCED BY 30" +
                "NEW HEALTH IS "+this.health );
        if (this.health ==0){
            System.out.println(getName()+" is dead");
        }
     }
     public void damageGun2(){
         this.health -=50;
         if (this.health <=0){
             this.health=0;
         }
         System.out.println("GOT HIT BY GUN1. HEALTH IS REDUCED BY 50" +
                 "NEW HEALTH IS "+this.health );
         if (this.health ==0) {
             System.out.println(getName()+ "is dead");
         }
     }
     public void heal(){
        if (this.health <= 0) System.out.println("player is dead .heal  is not possible");
        else this.health =100;
         System.out.println("health is "+this.health);

     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
      public String getweapon(){
        return weapon;
      }

     public void setWeapon(String weapon) {
         this.weapon = weapon;
     }

     public int getHealth() {
         return health;
     }

     public void setHealth(int health) {
         this.health = health;
     }
 }


