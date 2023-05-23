public class player2 extends player1{
    private int health;
    private boolean armour;
    public player2(String name,String weapon, int health,boolean armour){
        super(name, weapon, health);
        this.health=health;
        this.armour=armour;
    }
    @Override
    public void damageGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
            System.out.println("ARMOUR IS ON: GOT HIT BY GUN1:HEALTH IS REDUCED BY 20: NEW HEALTH IS  " + this.health);

        }
        if (!armour) {
            this.health -= 30;

            if (this.health <= 0) this.health = 0;
            System.out.println("ARMOUR IS OFF: GOT HIT BY GUN1:HEALTH IS REDUCED BY 30: NEW HEALTH IS  "
                    + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + "is dead");
        }
    }
    @Override
    public void damageGun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;
            System.out.println("ARMOUR IS ON: GOT HIT BY GUN1:HEALTH IS REDUCED BY 40: NEW HEALTH IS  " + this.health);

        }
        if (!armour) {
            this.health -= 50;

            if (this.health <= 0) this.health = 0;
            System.out.println("ARMOUR IS OFF: GOT HIT BY GUN1:HEALTH IS REDUCED BY 50: NEW HEALTH IS  "
                    + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + "is dead");
        }

    }
    @Override
    public void heal(){
        super.heal();
    }
}
