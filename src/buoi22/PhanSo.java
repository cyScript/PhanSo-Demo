package buoi22;

import java.util.Scanner;

public class PhanSo {
    private int TuSo;
    private int MauSo;

    public PhanSo()
    {
        TuSo = 0; MauSo = 1;
    }

    public PhanSo(int t, int m) {
        TuSo=t; MauSo =m;
    }
    public PhanSo(PhanSo PS)
    {
        this.TuSo = PS.TuSo;
        this.MauSo = PS.MauSo;
    }
    public void NhapPS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        TuSo = sc.nextInt();
        System.out.println("Nhap mau so:");
        MauSo = sc.nextInt();

    }
    public void XuatPS()
    {
        System.out.println(TuSo + "/" + MauSo);
    }
    public int ucln(int a, int b)
    {
        if(a < 0)
            a = -a;
        if(b < 0)
            b = -b;
        while(a != b)
        {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;
    }
    public void RutGon() {
        int t = ucln(TuSo, MauSo);
        TuSo = TuSo / t;
        MauSo = MauSo / t;
    }
    public PhanSo CongPS(PhanSo PS)
    {
        PhanSo kq = new PhanSo();
        kq.TuSo = this.TuSo*PS.MauSo + this.MauSo *TuSo;
        kq.MauSo = this.MauSo *PS.MauSo;
        kq.RutGon();
        return kq;
    }
    public PhanSo TruPS(PhanSo PS) {
        PhanSo kq = new PhanSo();
        kq.TuSo = this.TuSo*PS.MauSo - this.MauSo*PS.TuSo;
        kq.MauSo = this.MauSo * PS.MauSo;
        kq.RutGon();
        return kq;
    }

    public PhanSo NhanPS(PhanSo PS) {
        PhanSo kq = new PhanSo();
        kq.TuSo = this.TuSo * PS.TuSo;
        kq.MauSo = this.MauSo * PS.MauSo;
        kq.RutGon();
        return kq;
    }

    public PhanSo ChiaPS(PhanSo PS) {
        PhanSo kq = new PhanSo();
        kq.TuSo = this.TuSo * PS.MauSo;
        kq.MauSo = this.MauSo * PS.TuSo;
        kq.RutGon();
        return kq;
    }

}
class Demo {
    public static void main (String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        System.out.println("Nhap phan so thu nhat:");
        p1.NhapPS();
        System.out.println("Phan so thu nhat:");
        p1.XuatPS();
        System.out.println("Phan so thu nhat sau khi rut gon:");
        p1.RutGon();
        p1.XuatPS();
        System.out.println("Nhap phan so thu hai:");
        p2.NhapPS();
        System.out.println("Phan so thu hai:");
        p2.XuatPS();
        System.out.println("Phan so thu hai sau khi rut gon:");
        p2.RutGon();
        p2.XuatPS();
        System.out.println("Cong 2 phan so:");
        p1.CongPS(p2).XuatPS();
        System.out.println("Tru 2 phan so:");
        p1.TruPS(p2).XuatPS();
        System.out.println("Nhan 2 phan so:");
        p1.NhanPS(p2).XuatPS();
        System.out.println("Chia 2 phan so:");
        p1.ChiaPS(p2).XuatPS();
    }
}

