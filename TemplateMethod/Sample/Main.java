package TemplateMethod.Sample;

abstract class AbstractDisplay {
    abstract void open();
    abstract void print();
    abstract void close();
    final void dislplay() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

class CharDisplay extends AbstractDisplay {
    private char ch;
    CharDisplay(char ch) {
        this.ch = ch;
    }
    void open() {
        System.out.print("<<");
    }
    void print() {
        System.out.print(ch);
    }
    void close() {
        System.out.println(">>");
    }
}

class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    void open() {
        printLine();
    }
    void print() {
        System.out.println("|" + string + "|");
    }
    void close() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("こんにちは。");
        d1.dislplay();
        d2.dislplay();
        d3.dislplay();
    }
}