package _03_abstract_factory;

public class WhiteshipPartsFactory implements ShipPartsFactory{

    public Anchor createAnchor(){
        return new WhiteAnchor();
    }

    public Wheel createWheel(){
        return new WhiteWheel();
    }

}
