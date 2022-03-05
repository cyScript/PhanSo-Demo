package buoi22;

import java.util.Scanner;

public class PhanSo {
    private int tuso;
    private int mauso;

    public PhanSo()
    {
        tuso = 0; mauso = 1;
    }

    public PhanSo(int t, int m) {
        tuso=t; mauso=m;
    }
    public PhanSo(PhanSo p)
    {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public void nhapPS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        tuso = sc.nextInt();
        System.out.println("Nhap mau so:");
        mauso = sc.nextInt();

    }
    public void xuatPS()
    {
        System.out.println(tuso + "/" + mauso);
    }
    public int ucln(int a, int b)
    {
        int ucln = 0;
        while(a != b)
        {
            if(a>b)
                a = a-b;
            b = b - a;
            ucln = a;
        }
        return ucln;
    }
    public void rutGon(){
        int tmp = ucln(tuso,mauso);

    }

}
