package aircraft;

public class Aircraft {
    public String type;
    public int ammo;
    public int damage;

    public Aircraft(String type, int damage){
        this.ammo = 0;
        this.type = type;
        this.damage = damage;
    }

    public int fight(){
        int damageMade = this.ammo * this.damage;
        this.ammo = 0;
        return damageMade;
    }

    public int refill(int numberOfAmmo){
        if (this.type == "F16"){
            numberOfAmmo = numberOfAmmo - 8;
            this.ammo = 8;
        } else if (this.type == "F35"){
            numberOfAmmo = numberOfAmmo -12;
            this.ammo = 12;
        }
        return numberOfAmmo;
    }

    public String getType(){
        return this.type;
    }

    public void setStatus(){
        System.out.println("Type: "+ this.type +", Ammo: "+ this.ammo +", Base Damage: "+ this.damage +", " +
                "All Damage: "+ this.ammo * this.damage);
    }
}
