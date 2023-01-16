public class Savasci {
    Silah silah;
    String silah_ismi ="";
    double can;
        public Savasci(Silah silah, String silah_ismi) {
            this.silah = silah;
            this.silah_ismi = silah_ismi;
            this.can = 100;
    }
    void zararGor(double zarar) {
        if(this.can>=zarar) {
            System.out.println("["+this.silah_ismi+"]"+" can kaybediyor! Kalan can: "+(this.can-zarar));
            this.can=this.can-zarar;
        }
        else {
            System.out.println("["+this.silah_ismi+"]"+" yenildi!");
            this.can=0;
        }

    }

    public double saldir(double hamleGucu) {

        System.out.println("["+this.silah_ismi +"] "+""+silah.ses()+" Saldiri Gucu:"+" "+silah.saldir(hamleGucu));
        return silah.saldir(hamleGucu);
    }

    @Override
    public String toString()
    {
        return "["+ silah_ismi +"] "+"Kalan can:"+" "+this.can +" "+"Silah: "+silah;

    }
}

