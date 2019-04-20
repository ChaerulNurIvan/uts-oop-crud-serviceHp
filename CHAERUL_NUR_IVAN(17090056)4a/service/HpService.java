package service;

import java.util.*;
import entity.*;

public class ServiceHp {

    private static List<Hp> data = new LinkedList<Hp>();

    public void addData(Hp hp) {
        data.add(hp);
        System.out.println("--------------------");
        System.out.println("Data telah tersimpan");
        System.out.println("--------------------");
    }

    public void updateData(Hp hp) {
        int index = data.indexOf(hp);
        if(index >= 0) {
            data.set(index, hp);
            System.out.println("--------------------");
            System.out.println("Data telah berubah");
            System.out.println("--------------------");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Hp(id, "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("--------------------");
            System.out.println("Data telah terhapus");
            System.out.println("--------------------");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("--------------------");
        System.out.println("Data Anda Kosong :");
        System.out.println("--------------------");
        for(Hp hp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID   : " + hp.getId());
            System.out.println("  NAMA : " + hp.getNama());
            System.out.println("  MERK : " + hp.getMerk());
            System.out.println("  NOHP : " + hp.getNohp());
        }
    }

}