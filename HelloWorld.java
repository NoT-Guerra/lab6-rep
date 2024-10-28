public final class HelloWorld {

    public static void main(final String[] args) {
        System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
        System.out.println("Author of this file: " + authorName());
    }

    public static int procNumber() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String authorName() {
        return "Nicholas Guerra"; 
    }

}
