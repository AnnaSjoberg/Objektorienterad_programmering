package sprint4.uppg15;

public class Main {

    public Main(){
        GenericQ <Integer> genInt = new GenericQ<>();
        GenericQ<String> genString = new GenericQ<>();
        GenericNumberQ <Double> numDoub = new GenericNumberQ<>();

        for (int i = 0; i < 5; i++) {
            genInt.put(i-1);
            genString.put(""+i);
            numDoub.put((i+1)/Math.pow(6,i));
        }

        genInt.take();
        numDoub.take();
        numDoub.take();


        System.out.println("Size: " + genInt.size());
        System.out.println("Size: " + genString.size());
        System.out.println("Size: " + numDoub.size());
        System.out.println("Sum: " + numDoub.calcSum());

    }


    public static void main(String[] args) {
        Main a = new Main();
    }
}
