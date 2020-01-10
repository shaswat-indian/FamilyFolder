package indian.shaswat.com.familyfolder;

import java.util.HashMap;

/**
 * Created by shaswat on 18/11/18.
 */

public class Child {

    String name, age;
    HashMap<String,Object> atBirth;
    HashMap<String,Object> w6;
    HashMap<String,Object> w10;
    HashMap<String,Object> w14;
    HashMap<String,Object> m9;
    HashMap<String,Object> m16;
    HashMap<String,Object> y5;
    HashMap<String,Object> y10;
    HashMap<String,Object> y16;

    /*
    String bcg,opv0,hepb,
            opv1,penta1,ipv1,
            opv2, penta2,
            opv3,penta3, ipv2,
            mr1,je1,
            mr2,je2,opv,dpt,
            bpt,tt1,tt2;
    */

    public HashMap<String, Object> getAtBirth() {
        return atBirth;
    }

    public void setAtBirth(HashMap<String, Object> atBirth) {
        this.atBirth = atBirth;
    }

    public HashMap<String, Object> getW6() {
        return w6;
    }

    public void setW6(HashMap<String, Object> w6) {
        this.w6 = w6;
    }

    public HashMap<String, Object> getW10() {
        return w10;
    }

    public void setW10(HashMap<String, Object> w10) {
        this.w10 = w10;
    }

    public HashMap<String, Object> getW14() {
        return w14;
    }

    public void setW14(HashMap<String, Object> w14) {
        this.w14 = w14;
    }

    public HashMap<String, Object> getM9() {
        return m9;
    }

    public void setM9(HashMap<String, Object> m9) {
        this.m9 = m9;
    }

    public HashMap<String, Object> getM16() {
        return m16;
    }

    public void setM16(HashMap<String, Object> m16) {
        this.m16 = m16;
    }

    public HashMap<String, Object> getY5() {
        return y5;
    }

    public void setY5(HashMap<String, Object> y5) {
        this.y5 = y5;
    }

    public HashMap<String, Object> getY10() {
        return y10;
    }

    public void setY10(HashMap<String, Object> y10) {
        this.y10 = y10;
    }

    public HashMap<String, Object> getY16() {
        return y16;
    }

    public void setY16(HashMap<String, Object> y16) {
        this.y16 = y16;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Child(String name, String age, String bcg, String opv0, String hepb, String opv1, String penta1, String ipv1, String opv2, String penta2, String opv3, String penta3, String ipv2, String mr1, String je1, String mr2, String je2, String opv, String dpt, String bpt, String tt1, String tt2) {

        this.name=name;
        this.age=age;

        atBirth=new HashMap<>();
        w6=new HashMap<>();
        w10=new HashMap<>();
        w14=new HashMap<>();
        m9=new HashMap<>();
        m16=new HashMap<>();
        y5=new HashMap<>();
        y10=new HashMap<>();
        y16=new HashMap<>();


        atBirth.put("BCG",bcg);
        atBirth.put("OPV",opv0);
        atBirth.put("HEP B",hepb);

        w6.put("OPV 1",opv1);
        w6.put("PENTA 1",penta1);
        w6.put("IPV 1",ipv1);

        w10.put("OPV 2",opv2);
        w10.put("PENTA 2",penta2);

        w14.put("OPV 3",opv3);
        w14.put("PENTA 3",penta3);
        w6.put("IPV 2",ipv2);

        m9.put("MR 1",mr1);
        m9.put("JE 1",je1);

        m16.put("MR 2",mr2);
        m16.put("JE 2",je2);
        m16.put("OPV",opv);
        m16.put("DPT Booster",dpt);

        y5.put("BPT Booster 2",bpt);
        y10.put("TT",tt1);
        y16.put("TT",tt2);


    }
}
