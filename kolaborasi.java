public class kolaborasi {
    public static void main(String[] args) {
        System.out.println("Halo ini adalah projek kolaborasi");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Saya punya "+i+" nama");
            System.out.println("Nama saya adalah: " + args[i]);
            System.out.println("Ini adalah nama ke-" + (i+1));
        }
    }
}
