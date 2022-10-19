public class Main {
    public static void main(String[] args) {
        Living []livings =  {new Flat(),
                new Dormitary(),
                new Hotel()};
        for (Living living : livings){
            System.out.println(living);
            living.live();
        }
        System.out.println("Family living e Flat, payment of unilities");
        System.out.println("Tourist living in hotel, payment of rent");
        System.out.println("students living in Dormitory, payment of rent ");
    }

}