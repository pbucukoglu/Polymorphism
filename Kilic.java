public class Kilic extends  Silah{
    double kilicBonusu = 1.25;

    public Kilic(double saldiriGucu, String silah_ismi) {

        super(saldiriGucu, silah_ismi);
    }

    @Override
    double saldir(double hamleGucu) {
        return super.saldir(hamleGucu)*kilicBonusu;
    }


    @Override
    public String toString() {
        return "[Tanimlanmayan Kilic] Saldiri Gucu: "+this.saldiriGucu;
    }

    @Override
    public String ses() {
        return silah_ismi+" cekildi!";
    }
    @Override
    public void bilgi() {
        System.out.println("Tanimsiz Kilic:\n" + "Isim: "+this.silah_ismi + "\nSaldiri Gucu: "+this.saldiriGucu);
    }

}
