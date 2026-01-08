package model;

import until.configs;

public class nhanVienFullTime extends NhanVien {
    public int ngayLamThem;
    public int loaiChucVu;
     public nhanVienFullTime(String Name){
 this.Name=Name;
    }
     public nhanVienFullTime(String Name,int ngayLamThem){
        this.Name=Name;
        this.ngayLamThem=ngayLamThem;
     }
  public void setLoaiChucVu(int loaiChucVu){
    this.loaiChucVu=loaiChucVu;
  }
  @Override
  public String loaiNhanVien(){
    return " Nhân Viên FullTime";
  }
  public void tinhLuong(){
    if(loaiChucVu==configs.NhanVienSep){
        luong=configs.luongNhanVienFullTimeSep +ngayLamThem*configs.luongLamThemMoiNgay;
    }
    else{
        luong=configs.luongNhanVienFullTimeLinh+ngayLamThem*configs.luongLamThemMoiNgay;
    }
  }
}
