package threads;

/**
 * Created by Liliia_Klymenko on 05-May-15.
 */
public class Task extends  Thread{

    Task(Call call, String s){
       t =  new Thread();
        t.start();
    }
    Thread t;
    public void run() {

    }


}

class Call{
    public void work(String s) {
        System.out.println(s + " is working");
    }
}


class Work {
    public static void main(String args[]) {


    }


}