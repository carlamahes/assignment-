package menu_makanan;

import quiz.makanan;

    class Mie extends makanan {
     String name,jenis;
     int harga;

    public Mie(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getHarga(){
        return this.harga;
    }

    @Override
    public String getJenis(){
        return this.jenis;
    }
    public void food() {
    }
}

