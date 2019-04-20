package entity;

public class Hp{

    private String id;
    private String nama;
    private String merk;
    private String nohp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() { return merk; }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Hp(String id, String nama, String merk, String nohp) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.nohp = nohp;
    }


    public boolean equals(Object object) {
        Hp temp = (Hp) object;
        return id.equals(temp.getId());
    }

}