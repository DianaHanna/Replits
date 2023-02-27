package Replits;

public class AA {

    int i=10;

}
class BB extends AA{
    int i=20;

   public void display(){
       System.out.println(this.i);
       System.out.println(super.i);
   }

    public static void main(String[] args) {
        BB bb=new BB();
        bb.display();
    }
}