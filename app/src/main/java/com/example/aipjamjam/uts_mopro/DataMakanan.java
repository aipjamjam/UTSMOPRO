package com.example.aipjamjam.uts_mopro;

import java.util.ArrayList;

public class DataMakanan {
    public static String[][] data = new String [][]{
            {"Mie Aceh",
                    "Makanan Khas Banda Aceh",
                    "https://cdn.brilio.net/news/2016/05/25/62159/750xauto-tak-perlu-ke-restoran-mie-aceh-ternyata-resepnya-gampang-yuk-bikin-1605253.jpg"},
            {"Baso",
                    "Makanan Khas Solo",
                    "https://basojeletot.com/wp-content/uploads/2017/05/MIE-BASO-HALUS-1.jpg"},
            {"Cuanki",
                    "Makanan Khas Bandung",
                    "https://cf.shopee.co.id/file/4096846562e4400f12db5d12ff0979fb"},
            {"Sate Madura",
                    "Makanan Khas Madura",
                    "https://i1.wp.com/resepkoki.id/wp-content/uploads/2017/02/Resep-Sate-Ayam-Madura.jpg?fit=2399%2C2254&ssl=1"},
            {"Seblak",
                    "Makanan Khas Bandung",
                    "http://www.dapurkobe.co.id/wp-content/uploads/seblak-poll-pedas-1.jpg"},
            {"Tahu Gejrot",
                    "Makanan Khas Cirebon",
                    "https://media.travelingyuk.com/wp-content/uploads/2018/01/Tahu-Gejrot-Kanoman-Cirebon.jpg"},
            {"Tahu Sumedang",
                    "Makanan Khas Sumedang",
                    "https://i2.wp.com/resepkoki.id/wp-content/uploads/2016/10/kuliner-tahu-sumedang.jpg?fit=1080%2C1080&ssl=1"},
            {"Sempol",
                    "Makanan Khas Malang",
                    "https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/03/Resep-Sempol-ayam.jpg?fit=2322%2C2322&ssl=1"},
            {"Telor Asin",
                    "Makanan Khas Brebes",
                    "http://sahabatdapur.com/wp-content/uploads/2016/06/membuat-telur-asin-sendiri-sajiansedap1.jpg"}
    };
    public static ArrayList<Makanan> getListData(){
        Makanan khas = null;
        ArrayList<Makanan> list = new ArrayList<>();for (int i = 0; i <data.length; i++){
            khas = new Makanan();
            khas.setName(data[i][0]);
            khas.setRemarks(data[i][1]);
            khas.setPhoto(data[i][2]);
            list.add(khas);
        }
        return list;
    }
}
