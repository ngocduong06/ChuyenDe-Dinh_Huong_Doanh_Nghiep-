package model;

import until.configs;

public class nhanVienPartTime extends NhanVien {
    public int gioLamViec;
    nhanVienPartTime(String Name,int gioLamViec){
        this.Name=Name;
        this.gioLamViec=gioLamViec;

    }
    @Override
    public String loaiNhanVien(){
        return "Nhân Viên PartTime";
    }
    public void tinhLuong(){
        luong = configs.luongLamThemMoiGio * gioLamViec;
    }
}
