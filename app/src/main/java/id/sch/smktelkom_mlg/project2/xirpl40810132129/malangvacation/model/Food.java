package id.sch.smktelkom_mlg.project2.xirpl40810132129.malangvacation.model;

import java.io.Serializable;

/**
 * Created by SUPER USER on 28/03/2017.
 */

public class Food implements Serializable {
    public String judul;
    public String deskripsi;
    public String foto;


    public Food(String judul, String deskripsi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
