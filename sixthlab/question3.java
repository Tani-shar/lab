class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0; 
    }
}

class AXIS extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0; 
    }
}

public class question3 {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest() + "%");

        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest() + "%");

        bank = new AXIS();
        System.out.println("AXIS Rate of Interest: " + bank.getRateOfInterest() + "%");
    }
}
