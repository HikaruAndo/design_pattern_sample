package Adapter.Sample1;

class Banner {
    private String string;
    Banner(String string) {
        this.string = string;
    }
    void showWithParen() {
        System.out.println("(" + string + ")");
    }
    void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

class PrintBanner extends Banner implements Print {
    PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("HELLO");
        p.printWeak();
        p.printStrong();
    }
}