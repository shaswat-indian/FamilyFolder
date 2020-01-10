package indian.shaswat.com.familyfolder;

import java.util.HashMap;

/**
 * Created by shaswat on 17/11/18.
 */

public class Couple {

    public HashMap<String, Object> getContraceptive() {
        return Contraceptive;
    }

    public void setContraceptive(HashMap<String, Object> contraceptive) {
        Contraceptive = contraceptive;
    }

    //String condom,ocp,iucd,others,sterMale,sterFemale;
    HashMap<String,Object> Contraceptive;

    public Couple(String condom, String ocp, String iucd, String others, String sterMale, String sterFemale) {

        Contraceptive=new HashMap<>();
        Contraceptive.put("Condom",condom);
        Contraceptive.put("OCP",ocp);
        Contraceptive.put("IUCD",iucd);
        Contraceptive.put("Others",others);
        Contraceptive.put("Sterlization: 1-Male",sterMale);
        Contraceptive.put("Sterlization: 2-Female",sterFemale);


    }


}
