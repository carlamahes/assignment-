package menu_minuman;

import quiz.minuman;

    class dingin extends minuman {
     String name, jenis;
     int harga;

    public dingin(String name, int harga) {
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


    public void drinks() {
    }
}

