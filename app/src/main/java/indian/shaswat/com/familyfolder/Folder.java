package indian.shaswat.com.familyfolder;

import java.util.HashMap;

/**
 * Created by shaswat on 17/11/18.
 */

public class Folder {

    HashMap<String,Object> Details=new HashMap<>();
    String vFolderNo,vA,vB_1,vB_2,vB_3,vB_4,vC,vD,vE,vF,vG,
            vK,vQ,vS,vI,vJ,vL,vM,vN,vO,vP,vR;

    Person person[]=new Person[8];
    Couple couple[]=new Couple[3];


    public Folder(String vFolderNo, String vA, String vB_1, String vB_2, String vB_3, String vB_4, String vC, String vD, String vE, String vF, String vG,Person p1,Person p2,Person p3,Person p4,Person p5,Person p6,Person p7,Person p8,String vK, String vQ, String vS, String vI, String vJ, String vL, String vM, String vN, String vO, String vP, String vR,Couple c1,Couple c2,Couple c3) {
        //this.Details = Details;
        this.vFolderNo = vFolderNo;
        this.vA = vA;
        this.vB_1 = vB_1;
        this.vB_2 = vB_2;
        this.vB_3 = vB_3;
        this.vB_4 = vB_4;
        this.vC = vC;
        this.vD = vD;
        this.vE = vE;
        this.vF = vF;
        this.vG = vG;
        person[0]=p1;
        person[1]=p2;
        person[2]=p3;
        person[3]=p4;
        person[4]=p5;
        person[5]=p6;
        person[6]=p7;
        person[7]=p8;
        this.vK = vK;
        this.vQ = vQ;
        this.vS = vS;
        this.vI = vI;
        this.vJ = vJ;
        this.vL = vL;
        this.vM = vM;
        this.vN = vN;
        this.vO = vO;
        this.vP = vP;
        this.vR = vR;
        couple[0]=c1;
        couple[1]=c2;
        couple[2]=c3;

    }



    public void pushValues(){
        Details.put("Folder No.",vFolderNo);
        Details.put("A. Name of the head of the family",vA);
        Details.put("B. Address:House No.",vB_1);
        Details.put("Street",vB_2);
        Details.put("Village",vB_3);
        Details.put("Pincode",vB_4);
        Details.put("C. Religion",vC);
        Details.put("D. Caste",vD);
        Details.put("E. Does the family possess",vE);
        Details.put("F. Type of Family",vF);
        Details.put("G. Socio Economic Status:",vG);
        Details.put("H. Family Composition",person);
        Details.put("I. ",vI);
        Details.put("J. ",vJ);
        Details.put("K. Number of  living rooms",vK);
        Details.put("L. House structure",vL);
        Details.put("M. Separate kitchen",vM);
        Details.put("N. Smoke outlet in the kitchen",vN);
        Details.put("O. Overcrowding",vO);
        Details.put("P. Ventilation and lighting",vP);
        Details.put("Q. Water supply",vQ);
        Details.put("R. Waste segregation",vR);
        Details.put("S. Any other observations?",vS);

    }

    public HashMap<String, Object> getResult() {
        return Details;
    }

    public HashMap<String, Object> getDetails() {
        return Details;
    }

    public void setDetails(HashMap<String, Object> details) {
        Details = details;
    }

    public String getvK() {
        return vK;
    }

    public void setvK(String vK) {
        this.vK = vK;
    }

    public String getvQ() {
        return vQ;
    }

    public void setvQ(String vQ) {
        this.vQ = vQ;
    }

    public String getvS() {
        return vS;
    }

    public void setvS(String vS) {
        this.vS = vS;
    }

    public String getvI() {
        return vI;
    }

    public void setvI(String vI) {
        this.vI = vI;
    }

    public String getvJ() {
        return vJ;
    }

    public void setvJ(String vJ) {
        this.vJ = vJ;
    }

    public String getvL() {
        return vL;
    }

    public void setvL(String vL) {
        this.vL = vL;
    }

    public String getvM() {
        return vM;
    }

    public void setvM(String vM) {
        this.vM = vM;
    }

    public String getvN() {
        return vN;
    }

    public void setvN(String vN) {
        this.vN = vN;
    }

    public String getvO() {
        return vO;
    }

    public void setvO(String vO) {
        this.vO = vO;
    }

    public String getvP() {
        return vP;
    }

    public void setvP(String vP) {
        this.vP = vP;
    }

    public String getvR() {
        return vR;
    }

    public void setvR(String vR) {
        this.vR = vR;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public Couple[] getCouple() {
        return couple;
    }

    public void setCouple(Couple[] couple) {
        this.couple = couple;
    }

    public void setResult(HashMap<String, Object> Details) {
        this.Details = Details;
    }

    public String getvFolderNo() {
        return vFolderNo;
    }

    public void setvFolderNo(String vFolderNo) {
        this.vFolderNo = vFolderNo;
    }

    public String getvA() {
        return vA;
    }

    public void setvA(String vA) {
        this.vA = vA;
    }

    public String getvB_1() {
        return vB_1;
    }

    public void setvB_1(String vB_1) {
        this.vB_1 = vB_1;
    }

    public String getvB_2() {
        return vB_2;
    }

    public void setvB_2(String vB_2) {
        this.vB_2 = vB_2;
    }

    public String getvB_3() {
        return vB_3;
    }

    public void setvB_3(String vB_3) {
        this.vB_3 = vB_3;
    }

    public String getvB_4() {
        return vB_4;
    }

    public void setvB_4(String vB_4) {
        this.vB_4 = vB_4;
    }

    public String getvC() {
        return vC;
    }

    public void setvC(String vC) {
        this.vC = vC;
    }

    public String getvD() {
        return vD;
    }

    public void setvD(String vD) {
        this.vD = vD;
    }

    public String getvE() {
        return vE;
    }

    public void setvE(String vE) {
        this.vE = vE;
    }

    public String getvF() {
        return vF;
    }

    public void setvF(String vF) {
        this.vF = vF;
    }

    public String getvG() {
        return vG;
    }

    public void setvG(String vG) {
        this.vG = vG;
    }
}

