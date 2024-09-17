
/**
 * question1
 */
interface Company {
    void getSales();
    void getInfo();
}

class Hardware implements Company {
    String category;
    String manu;
    int itemBought;
    static int hardwareSold;

    public Hardware(String cat, String manu, int itemBought) {
        this.category = cat;
        this.manu = manu;
        this.itemBought = itemBought;
        hardwareSold += itemBought;
    }

    @Override
    public void getSales() {
        System.out.println("Hardware sold = " + hardwareSold);
    }

    @Override
    public void getInfo() {
        System.out.println("Category: " + category + " Manufacturer: " + manu);
    }
}

class Software implements Company {
    String type;
    String os;
    int itemBought;
    static int softwareSold;

    public Software(String type, String os, int itemBought) {
        this.type = type;
        this.os = os;
        this.itemBought = itemBought;
        softwareSold += itemBought;
    }

    @Override
    public void getSales() {
        System.out.println("Software sold = " + softwareSold);
    }

    @Override
    public void getInfo() {
        System.out.println("Type: " + type + " OS: " + os);
    }
}

public class question1 {
    public static void main(String[] args) {
        Hardware h1 = new Hardware("embeddedSystem", "dell", 5);
        Hardware h2 = new Hardware("embeddedSystem", "dell", 5);
        Hardware h3 = new Hardware("embeddedSystem", "dell", 5);
        Hardware h4 = new Hardware("embeddedSystem", "dell", 5);
        Software s1 = new Software("virus", "arch linux", 100);
        Software s2 = new Software("virus", "arch linux", 100);
        Software s3 = new Software("virus", "arch linux", 100);
        Software s4 = new Software("virus", "arch linux", 100);
        Software s5 = new Software("virus", "arch linux", 100);

        s5.getSales(); // Should display: Software sold = 500
        s5.getInfo();  // Should display: Type: virus OS: arch linux
        h1.getSales(); // Should display: Hardware sold = 20
        h1.getInfo();  // Should display: Category: embeddedSystem Manufacturer: dell
    }
}

