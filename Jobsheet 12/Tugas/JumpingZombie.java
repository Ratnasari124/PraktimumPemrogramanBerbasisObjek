public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.3;
                break;
            case 2:
                health += health * 0.4;
                break;
            case 3:
                health += health * 0.5;
                break;
        }
    }
    @Override 
    public void destroyed(){
        health -= health * 1.906;
    }
    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data = \n"
          + "Health = " + health + "\n"
          + "Level = " + level + "\n";
    }
}