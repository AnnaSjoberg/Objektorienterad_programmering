package sprint4.uppg15;

public class Main {

    public Main(){
        GenericNumberQ <Float> numFloat = new GenericNumberQ<>();
        GenericNumberQ <Double> numDoub = new GenericNumberQ<>();
        GenericNumberQ <Byte> numByte = new GenericNumberQ<>();
        GenericNumberQ <Integer> numInt = new GenericNumberQ<>();
        GenericNumberQ <Short> numShort = new GenericNumberQ<>();
        GenericNumberQ <Long> numLong = new GenericNumberQ<>();
        GenericNumberQ <Number> numNum = new GenericNumberQ<>();



        for (int i = 1; i < 10; i++) {
            numDoub.put((i+1)/Math.pow(6,i));
            numInt.put(i*10);
            numByte.put((byte)i);
            numLong.put(i*40000l);
            numFloat.put(i-50f);
            numShort.put((short)(i*8));
        }
/*
        System.out.println("D: " + numDoub.calcSum2());
        System.out.println("I: " + numInt.calcSum2());
        System.out.println("B: " + numByte.calcSum2());
        System.out.println("L: " + numLong.calcSum2());
        System.out.println("F: " + numFloat.calcSum2());
        System.out.println("S: " + numShort.calcSum2());


 */
        numNum.put(Byte.MAX_VALUE);
        numNum.put(Integer.MAX_VALUE);
        numNum.put(Short.MAX_VALUE);
        numNum.put(Long.MAX_VALUE);
        numNum.put(Double.MIN_VALUE);
        numNum.put(Float.MIN_VALUE);

        for (Number num: numNum.getNumList()) {
            System.out.println(num);
        }

        System.out.println("numNum: " + numNum.calcSum2());



    }


    public static void main(String[] args) {
        Main a = new Main();
    }
}
