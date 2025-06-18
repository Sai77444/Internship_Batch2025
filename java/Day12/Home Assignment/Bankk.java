abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.2;
    }
}

public class Bankk{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
 sbi.getInterestRate();
        hdfc.getInterestRate();
    }
}
