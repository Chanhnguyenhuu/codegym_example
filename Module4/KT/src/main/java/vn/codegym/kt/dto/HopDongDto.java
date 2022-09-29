package vn.codegym.kt.dto;

import vn.codegym.kt.model.Hotel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class HopDongDto {
    private int idHopDong;
    @NotBlank
    private String name;
    @NotBlank
    private String idCard;

    private String date;
    private String thoiGianThue;
    private String tongTien;
    private Set<Hotel> hotels;

    public HopDongDto() {
    }

    public HopDongDto(int idHopDong, String name, String idCard, String date, String thoiGianThue, String tongTien, Set<Hotel> hotels) {
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
