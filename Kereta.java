public class Kereta {
    private Ticket[] tiket;
    private int kapasitas;
    private int jumlahTiket;

    public Kereta() {
        this.kapasitas = 10; // Kapasitas default
        this.tiket = new Ticket[this.kapasitas];
        this.jumlahTiket = 0;
    }

    public Kereta(String namaKereta, int jumlahTiket) {
        this.kapasitas = jumlahTiket;
        this.tiket = new Ticket[this.kapasitas];
        this.jumlahTiket = 0;
    }

    public void tambahTiket(String namaPenumpang) {
        if (this.jumlahTiket < this.kapasitas) {
            this.tiket[this.jumlahTiket] = new Ticket();
            this.tiket[this.jumlahTiket].setNamaPenumpang(new String[]{namaPenumpang});
            this.jumlahTiket++;
        } else {
            System.out.println("Kereta sudah penuh!");
        }
    }

    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        if (this.jumlahTiket < this.kapasitas) {
            this.tiket[this.jumlahTiket] = new Ticket();
            this.tiket[this.jumlahTiket].setNamaPenumpang(new String[]{namaPenumpang});
            this.tiket[this.jumlahTiket].setAsal(new String[]{asal});
            this.tiket[this.jumlahTiket].setTujuan(new String[]{tujuan});
            this.jumlahTiket++;
        } else {
            System.out.println("Kereta sudah penuh!");
        }
    }

    public void tampilkanTiket() {
        for (int i = 0; i < this.jumlahTiket; i++) {
            System.out.println("Nama Penumpang: " + String.join(", ", this.tiket[i].getNamaPenumpang()));
            if (this.tiket[i].getAsal() != null && this.tiket[i].getTujuan() != null) {
                System.out.println("Asal: " + String.join(", ", this.tiket[i].getAsal()));
                System.out.println("Tujuan: " + String.join(", ", this.tiket[i].getTujuan()));
            }
            System.out.println();
        }
    }
}
