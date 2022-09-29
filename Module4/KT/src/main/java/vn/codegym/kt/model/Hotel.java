package vn.codegym.kt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHotel;
    private int dienTich;
    private int giaThue;
    private int status;


    @ManyToOne
    @JoinColumn(name = "id_hop_dong", referencedColumnName = "idHopDong")
    private HopDong hopDong;

    public Hotel() {
    }

    public Hotel(int idHotel, int dienTich, int giaThue, int status, HopDong hopDong) {
        this.idHotel = idHotel;
        this.dienTich = dienTich;
        this.giaThue = giaThue;
        this.status = status;
        this.hopDong = hopDong;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }
}
