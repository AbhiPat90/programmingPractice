public class AB{
    AB(){
        System.out.println("A");
    }
}

class BC extends AB{
    BC()
    {
        System.out.println("B");
    }

    public static void main(String[] args) {
        AB a = new BC();
    }
}