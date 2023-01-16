public class Spatha extends Kilic{
    double spathaBonusu = 1.45;
    public Spatha(double saldiriGucu, String silah_ismi) {

        super(saldiriGucu, silah_ismi);
    }

    @Override
    double saldir(double hamleGucu) {
        return super.saldir(hamleGucu)*spathaBonusu;
    }

    @Override
    public String toString() {
        return "[Spatha] Saldiri Gucu: "+this.saldiriGucu;
    }


    @Override
    public String ses() {
        return silah_ismi +" saldiriyor!";
    }

    @Override
    public void bilgi() {
        System.out.println("Spatha:\n" + "Isim: "+this.silah_ismi + "\nSaldiri Gucu: "+this.saldiriGucu);
    }
}

