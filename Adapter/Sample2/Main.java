package Adapter.Sample2;

abstract class Print {
    abstract void printWeak();
    abstract void printStrong();
}

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

class PrintBanner extends Print {
    private Banner banner;
    PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    void printWeak() {
        banner.showWithParen();
    }
    void printStrong() {
        banner.showWithAster();
    }
}

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("HELLO JAVA");
        p.printWeak();
        p.printStrong();
    }
}