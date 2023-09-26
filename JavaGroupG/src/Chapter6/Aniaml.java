package Chapter6;

public class Aniaml {
    private int age;
    protected String name;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age =newAge;
    }
}

class lion extends Aniaml{
    protected void setProperties(int age,String n){
        setAge(age);
        name =n;
    }

    public void roar(){
        System.out.println(name + ", age: " + getAge() + ", says: Roar!");
    }

    public static void main(String[] args) {
        var lion = new lion();
        lion.setProperties(3,"Kion");
        lion.roar();
    }

}
