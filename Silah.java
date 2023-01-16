public class Silah {
    double saldiriGucu;
    String silah_ismi ="" ;
    public Silah(double saldiriGucu, String silah_ismi) {
        this.saldiriGucu=saldiriGucu;
        this.silah_ismi =silah_ismi;
    }
    double saldir(double hamleGucu){
        double verilecekzarar= hamleGucu*saldiriGucu;
        return verilecekzarar;
    }
   public void bilgi() {
       // if(this.isim.equals("Isimsiz Silah")) {
       System.out.println("Tanimlanmayan Silah:\n" + "Isim: "+this.silah_ismi+ "\nSaldiri Gucu: "+this.saldiriGucu);
   //}
    }
    public String toString(){
        return "[Tanimlanmayan Silah] Saldiri Gucu: "+this.saldiriGucu;
    }
    public String ses(){
        return silah_ismi +" gorundu!";
    }
}

