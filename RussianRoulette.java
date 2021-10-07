package RussianRoulette.g;

public class RussianRoulette {

    public static void main(String[] args) {

//same = shot (ignore)

        int empty = (int)Math.ceil (Math.random() *6);
        int bullet = (int)Math.ceil (Math.random() *6);
/*        System.out.println(empty);
        System.out.println(bullet);*/
        if (empty == bullet){
            System.out.println("bang");

        } else {
            System.out.println("empty");
        }

    }
}
