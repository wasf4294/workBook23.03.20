public class This {
}

class Car {
    String color;
    String GearType;
    int door;

    Car(String color, String GearType, int door)    {
        this.color = color;
        this.GearType = GearType;
        this.door = door;
    }

    Car()   {
        this("white", "auto", 4);
    }

    Car(String color)   {
        this(color, "auto", 4);
    }
}
