public class WalkingZombie extends Zombie{

    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal(){
        switch (level){
            case 1:
                health += health * 0.1;
                break;
            case 2:
                health += health * 0.3;
                break;
            case 3:
                health += health * 0.4;
                break;
        }
    }
    @Override 
    public void destroyed(){
        health -= 0.19*health;
    }
    @Override
    public String getZombieInfo(){
        return "Walking Zombie Data = \n"
          + "Health = " + health + "\n"
          + "Level = " + level + "\n";
    }
}