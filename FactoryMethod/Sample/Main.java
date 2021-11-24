package FactoryMethod.Sample;

import FactoryMethod.Sample.framework.*;
import FactoryMethod.Sample.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("田中太郎");
        Product card2 = factory.create("taro");
        Product card3 = factory.create("花子田中");
        card1.use();
        card2.use();
        card3.use();
    }
}