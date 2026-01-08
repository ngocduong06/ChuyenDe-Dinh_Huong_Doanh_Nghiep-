package model;

public class NhanVien {
    protected String Name;
    protected long luong;
public NhanVien(){

}
public NhanVien(String Name){
    this.Name=Name;
    
}
protected String loaiNhanVien(){
    return "";
};
public void xuatThongTin(){
System.out.print("tên Nhân Viên "+Name);
System.out.print("loại nhân viên "+loaiNhanVien());
System.out.print("lương "+luong+"Vnd");
}
}
