class sepedamotor {
    private String merk;

    public void setmerk(String merkmotor) {
        merk = merkmotor;
    }

    public String getmerk() {
        return merk;
    }

    public long harga(long hargamotor) {
        return hargamotor;
    }
}

public class motor {
    public static void main(String[] args) {
        sepedamotor motor = new sepedamotor();
        motor.setmerk("kawasaki H2");
        System.out.println("motor ini bermerk = " + motor.getmerk());
        System.out.println("motor ini berharga = " + motor.harga(50000000));
    }
}