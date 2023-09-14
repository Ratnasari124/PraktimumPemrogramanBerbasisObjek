public class EncapDemo{
    private String name;
    private int age;
    //penamabahan 2 atribut maks sebagai maksimal dengan nilai 30 dan min sebagai minimum dengan nilai 18
    private int maks = 30;
    private int min = 18;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge <= maks){ //jika nilai yang diinput kurang dari nilai maksimal yaitu 30 akan tertulis
            age = newAge;
        }else if(newAge <=min){ // jika nilai yang diinput kurang dari nilai minimun yaitu 18 akan tertulis
            age = newAge;
        }else{//jika nilai yang diinput tidak aad di rentan tersebut maka tidak akan tercatat

        }
    }
}