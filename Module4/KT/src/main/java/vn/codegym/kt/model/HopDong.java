package vn.codegym.kt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class HopDong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHopDong;
    private String name;
    private String idCard;
    private String date;
    private String thoiGianThue;
    private String tongTien;

    @OneToMany(mappedBy = "hopDong")
    private Set<Hotel> hotels;

    public HopDong() {
    }

    public HopDong(int idHopDong, String name, String idCard, String date, String thoiGianThue, String tongTien, Set<Hotel> hotels) {
        this.idHopDong = idHopDong;
        this.name = name;
        this.idCard = idCard;
        this.date = date;
        this.thoiGianThue = thoiGianThue;
        this.tongTien = tongTien;
        this.hotels = hotels;
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(String thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public Set<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(Set<Hotel> hotels) {
        this.hotels = hotels;
    }
}
