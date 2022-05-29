import javax.swing.UIDefaults.ProxyLazyValue;

public class App {

    // series 3 **************************************************

    // Question 1
    public static class Account {
        private String AccountOwner;
        private int AccountNumber;
        private int AccountBalance;

        public Account() {
            this.AccountOwner = "John Doe";
            this.AccountNumber = 0;
            this.AccountBalance = 0;
        }

        public Account(String AccountOwner, int AccountNumber, int AccountBalance) {
            this.AccountOwner = AccountOwner;
            this.AccountNumber = AccountNumber;
            this.AccountBalance = AccountBalance;
        }

        public String toString() {
            String owner = "Account Owner : " + this.AccountOwner + "\n";
            String number = "Account Number : " + this.AccountNumber + "\n";
            String balance = "Account Balance : " + this.AccountBalance + " $ " + "\n";

            return owner + number + balance;
        }

        public Account copy() {
            Account Acc = new Account();
            Acc.AccountOwner = this.AccountOwner;
            Acc.AccountNumber = this.AccountNumber;
            Acc.AccountBalance = this.AccountBalance;
            return Acc;
        }

        public boolean equals(Account Acc) {
            return this.AccountOwner == Acc.AccountOwner &&
                    this.AccountNumber == Acc.AccountNumber &&
                    this.AccountNumber == Acc.AccountNumber;
        }

        public int getBalance() {
            return this.AccountBalance;
        }

        public void add(int money) {
            this.AccountBalance += money;
        }

        public void withdraw(int money) {
            if (this.AccountBalance - money < 0) {
                System.out.println("You Don't Have Enough Balance");
                System.out.println("Current Balance : " + this.AccountBalance + " $ ");
            } else {
                this.AccountBalance -= money;
                System.out.println("money withdrawn successfully!");
                System.out.println("New Balance : " + this.AccountBalance + " $ ");
            }
        }

    }

    // Question 2
    public static class Country {
        private String countryName;
        private double countryPupolation;
        private double individualAnnualIncome;
        private double countryArea;
        private String countryCapital;

        public Country() {
            this.countryName = "Unknown";
            this.countryPupolation = 0;
            this.individualAnnualIncome = 0;
            this.countryArea = 0;
            this.countryCapital = "";
        }

        public Country(String countryName, double countryPupolation, double individualAnnualIncome, double countryArea,
                String countryCapital) {
            this.countryName = countryName;
            this.countryPupolation = countryPupolation;
            this.individualAnnualIncome = individualAnnualIncome;
            this.countryArea = countryArea;
            this.countryCapital = countryCapital;
        }

        public Country copy() {
            Country C = new Country();
            C.countryName = this.countryName;
            C.countryPupolation = this.countryPupolation;
            C.individualAnnualIncome = this.individualAnnualIncome;
            C.countryArea = this.countryArea;
            C.countryCapital = this.countryCapital;
            return C;
        }

        public String toString() {
            String name = "Country Name : " + this.countryName + "\n";
            String pupolation = "Country Population : " + this.countryPupolation + "\n";
            String area = "Countryy Area : " + this.countryArea + "\n";

            return name + pupolation + area;
        }

        public boolean equals(Country C) {
            return this.countryName == C.countryName &&
                    this.countryPupolation == C.countryPupolation &&
                    this.individualAnnualIncome == C.individualAnnualIncome &&
                    this.countryArea == C.countryArea &&
                    this.countryCapital == C.countryCapital;
        }

        public double density() {
            return this.countryPupolation / countryArea;
        }

    }

    // Question 3
    public static class Complex {
        private double realNumber;
        private double imaginaryNumber;

        public Complex() {
            this.realNumber = 0;
            this.imaginaryNumber = 0;
        }

        public Complex(double realNumber, double imaginaryNumber) {
            this.realNumber = realNumber;
            this.imaginaryNumber = imaginaryNumber;
        }

        public String toString() {
            String real = Double.toString(this.realNumber) + " + ";
            String img = Double.toString(this.imaginaryNumber) + "i";

            return real + img;
        }

        public double getRealNumber() {
            return this.realNumber;
        }

        public void setRealNumber(double realNumber) {
            this.realNumber = realNumber;
        }

        public double getImaginaryNumber() {
            return this.imaginaryNumber;
        }

        public void setImaginaryNumber(double imaginaryNumber) {
            this.imaginaryNumber = imaginaryNumber;
        }

        public boolean equals(Complex num) {
            return this.getRealNumber() == num.getRealNumber() && this.getImaginaryNumber() == num.getImaginaryNumber();
        }

        public Complex copy() {
            Complex complexCopy = new Complex();
            complexCopy.setRealNumber(this.realNumber);
            complexCopy.setImaginaryNumber(this.imaginaryNumber);
            return complexCopy;
        }

        public Complex complexAdd(Complex num) {
            Complex result = new Complex();
            double addedReals = this.getRealNumber() + num.getRealNumber();
            double addedImaginary = this.getImaginaryNumber() + num.getImaginaryNumber();
            result.setRealNumber(addedReals);
            result.setImaginaryNumber(addedImaginary);
            return result;
        }

        public Complex complexMultply(Complex num) {
            Complex result = new Complex();
            double real = (this.getRealNumber() * num.getRealNumber())
                    + ((this.getImaginaryNumber() * num.getImaginaryNumber()) * (-1));
            double img = (this.getRealNumber() * num.getImaginaryNumber())
                    + (this.getImaginaryNumber() * num.getRealNumber());
            result.setRealNumber(real);
            result.setImaginaryNumber(img);
            return result;
        }

        public Complex complexSubtract(Complex num) {
            Complex result = new Complex();
            double subedReals = this.getRealNumber() - num.getRealNumber();
            double subedImaginary = this.getImaginaryNumber() - num.getImaginaryNumber();
            result.setRealNumber(subedReals);
            result.setImaginaryNumber(subedImaginary);
            return result;
        }

        public Complex complexDivision(Complex num) {
            Complex result = new Complex();
            double first = ((this.getRealNumber() * num.getRealNumber())
                    + (this.getImaginaryNumber() * num.getImaginaryNumber()))
                    / ((num.getRealNumber() * num.getRealNumber())
                            + num.getImaginaryNumber() * num.getImaginaryNumber());

            double second = ((this.getImaginaryNumber() * num.getRealNumber())
                    - (this.getRealNumber() * num.getImaginaryNumber()))
                    / ((num.getRealNumber() * num.getRealNumber())
                            + num.getImaginaryNumber() * num.getImaginaryNumber());
            result.setRealNumber(first);
            result.setImaginaryNumber(second);
            return result;
        }

        public Complex complexInverse() {
            Complex result = new Complex();
            double inversedReal = (this.getRealNumber()) / ((this.getRealNumber() * this.getRealNumber())
                    + (this.getImaginaryNumber() * this.getImaginaryNumber()));
            double inversedImg = (this.getImaginaryNumber()) / ((this.getRealNumber() * this.getRealNumber())
                    + (this.getImaginaryNumber() * this.getImaginaryNumber()));
            result.setRealNumber(inversedReal);
            result.setImaginaryNumber(inversedImg);
            return result;
        }

        public Complex complexConjugate() {
            Complex result = new Complex();
            double real = this.getRealNumber();
            double img = -this.getImaginaryNumber();
            result.setRealNumber(real);
            result.setImaginaryNumber(img);
            return result;
        }

    }

    // Question 4
    public static class Conic {
        private double A;
        private double B;
        private double C;
        private double D;
        private double E;
        private double F;

        public Conic() {
            this.A = 1;
            this.B = 1;
            this.C = 1;
            this.D = 1;
            this.E = 1;
            this.F = 1;
        }

        public Conic(double A, double B, double C, double D, double E, double F) {
            this.A = A;
            this.B = B;
            this.C = C;
            this.D = D;
            this.E = E;
            this.F = F;
        }

        public boolean equals(Conic conic) {
            return this.A == conic.A &&
                    this.B == conic.B &&
                    this.C == conic.C &&
                    this.D == conic.D &&
                    this.E == conic.E &&
                    this.F == conic.F;
        }

        public String toString() {
            String a = this.A > 0 ? Double.toString(this.A) + "x^2 + " : "";
            String b = this.B > 0 ? Double.toString(this.B) + "xy + " : "";
            String c = this.C > 0 ? Double.toString(this.C) + "y^2 + " : "";
            String d = this.D > 0 ? Double.toString(this.D) + "x + " : "";
            String e = this.E > 0 ? Double.toString(this.E) + "y + " : "";
            String f = this.F > 0 ? Double.toString(this.F) : "";

            return a + b + c + d + e + f;
        }

        public void setA(double A) {
            this.A = A;
        }

        public void setB(double B) {
            this.B = B;
        }

        public String getShape() {
            if (this.A == this.C && this.B == 0) {
                return "Circle";
            } else if ((this.A > 0 && this.B > 0 && this.A != this.B)
                    || (this.A < 0 && this.B < 0 && this.A != this.B)) {
                return "Oval";
            } else if ((this.A == 0 && this.B == 0 && this.C != 0) || (this.A != 0 && this.B == 0 && this.C == 0)) {
                return "Parabolic ";
            } else if ((this.A > 0 && this.C < 0 && this.B == 0) || (this.A < 0 && this.C > 0 && this.B == 0)) {
                return "Hyperbolic";
            } else {
                return "Another Shape";
            }
        }
    }

    public static void main(String[] args) {

        // Qeustion 1 Examples
        /*
         * String name = "Jeffrey";
         * int number = 23421;
         * int balance = 200;
         * 
         * Account Acc = new Account(name, number, balance);
         * Acc.add(300);
         * Acc.withdraw(700);
         */

        // Question 2 Examples
        /*
         * String countryName = "Iran";
         * double countryPupolation = 84000000.00;
         * double individualAnnualIncome = 10000000.00;
         * double countryArea = 1648000;
         * String countryCapital = "Tehran";
         *
         * Country IR = new Country(countryName, countryPupolation,
         * individualAnnualIncome, countryArea, countryCapital);
         * System.out.println(IR.density());
         */

        // Question 3 Examples
        /*
         * double realNumber = 2.0;
         * double imaginaryNumber = -1.0;
         * 
         * double realNumber2 = 2.0;
         * double imaginaryNumber2 = 1.0;
         *
         * Complex complexNumber = new Complex(realNumber, imaginaryNumber);
         * Complex complexNumber2 = new Complex(realNumber2, imaginaryNumber2);
         * System.out.println(complexNumber.complexConjugate());
         */

        // Question 4 Examples
        double A = -2;
        double B = 0;
        double C = 2;
        double D = 4;
        double E = 5;
        double F = 1;

        Conic shape = new Conic(A, B, C, D, E, F);
        System.out.println(shape.toString());

    }
}