package _03_abstract_factory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
