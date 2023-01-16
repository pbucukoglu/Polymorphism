public class Pilum extends Silah {
    double pilumBonusu = 1.1;
    public Pilum(double saldiriGucu, String silah_ismi) {

        super(saldiriGucu,silah_ismi);
    }

    @Override
    double saldir(double hamleGucu) {
        return super.saldir(hamleGucu)*pilumBonusu;
    }

    @Override
    public String toString() {
        return "[" +"Pilum"+"]" + " Saldiri Gucu: "+this.saldiriGucu;
    }

    @Override
    public String ses() {
        return silah_ismi+" saplandi!";
    }
    @Override
    public void bilgi() {
        System.out.println("Pilum:\n" + "Isim: "+this.silah_ismi + "\nSaldiri Gucu: "+this.saldiriGucu);
    }
}

