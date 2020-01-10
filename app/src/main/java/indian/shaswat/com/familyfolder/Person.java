package indian.shaswat.com.familyfolder;

import java.util.HashMap;

/**
 * Created by shaswat on 17/11/18.
 */

public class Person {

    public HashMap<String, Object> getHashMap() {
        return Member;
    }

    public void setHashMap(HashMap<String, Object> Member) {
        this.Member = Member;
    }

    //String name,age,rth,ms,edu,occ,inc;
    HashMap<String,Object> Member;


    public Person(String name, String age, String rth, String ms, String edu, String occ, String inc, String hs) {


        Member=new HashMap<>();
        Member.put("Name",name);
        Member.put("Age",age);
        Member.put("Relation to Head",rth);
        Member.put("Marital Status",ms);
        Member.put("Education",edu);
        Member.put("Occupation",occ);
        Member.put("Income",inc);
        Member.put("Health Status",hs);

    }






}
