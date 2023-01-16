public class Gladius extends Kilic {
    double gladiusBonusu = 1.3;

    public Gladius(double saldiriGucu, String silah_ismi) {

        super(saldiriGucu, silah_ismi);
    }

    @Override
    double saldir(double hamleGucu) {
        return super.saldir(hamleGucu)*gladiusBonusu;
    }

    @Override
    public String toString() {
        return "[Gladius] Saldiri Gucu: "+this.saldiriGucu;
    }

    @Override
    public String ses() {
        return silah_ismi +" savruluyor!";
    }
    @Override
    public void bilgi() {
        System.out.println("Gladius:\n" + "Isim: "+this.silah_ismi + "\nSaldiri Gucu: "+this.saldiriGucu);
    }
}

