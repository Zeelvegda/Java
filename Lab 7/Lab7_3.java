public class Lab7_3 {
 public static void main(String[] args) {
    Animal[] arr={
        new Tiger(),
        new Deer(),
        new Donkey(),
        new Camel()

    };
    for(Animal a : arr)
    {
        if(a instanceof Transport){
            ((Transport)a).deliver();
        }

    }
 }
}
interface Transport{
    public void deliver();
     
}
abstract class Animal{

}
class Tiger extends Animal{

}

class Deer extends Animal{

}
class Camel extends Animal implements Transport{
        public void deliver(){
            System.out.println(" camel");
        }
        
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println(" donkey");
    }

}