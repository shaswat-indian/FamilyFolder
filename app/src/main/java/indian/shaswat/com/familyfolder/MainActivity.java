package indian.shaswat.com.familyfolder;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements  Fragment1.OnFragmentInteractionListener, Fragment2.OnFragmentInteractionListener, Fragment3.OnFragmentInteractionListener, Fragment4.OnFragmentInteractionListener, Fragment4_1.OnFragmentInteractionListener,Fragment5.OnFragmentInteractionListener, Fragment6.OnFragmentInteractionListener, Fragment7.OnFragmentInteractionListener, Fragment8.OnFragmentInteractionListener, Fragment9.OnFragmentInteractionListener, Fragment9_1.OnFragmentInteractionListener, Fragment9_2.OnFragmentInteractionListener ,Fragment10.OnFragmentInteractionListener{

    Button next, prev, submit;
    FragmentTransaction ft;
    int i=0;
    ArrayList<Fragment> fragments;

    Fragment1 fragment1=new Fragment1();
    Fragment2 fragment2=new Fragment2();
    Fragment3 fragment3=new Fragment3();
    Fragment4 fragment4=new Fragment4();
    Fragment4_1 fragment4_1=new Fragment4_1();
    Fragment5 fragment5=new Fragment5();
    Fragment6 fragment6=new Fragment6();
    Fragment7 fragment7=new Fragment7();
    Fragment8 fragment8=new Fragment8();
    Fragment9 fragment9=new Fragment9();
    Fragment9_1 fragment9_1=new Fragment9_1();
    Fragment9_2 fragment9_2=new Fragment9_2();
    Fragment10 fragment10=new Fragment10();
    

    DatabaseReference mDatabase;
    
    String vFolderNo,vA,location,vB_1,vB_2,vB_3,vB_4,vC,vD,vE,vF,vG,
            vH_1_Name,vH_1_Age,vH_1_RTH,vH_1_MS,vH_1_Edu,vH_1_Occ,vH_1_Inc,vH_1_HS,
            vH_2_Name,vH_2_Age,vH_2_RTH,vH_2_MS,vH_2_Edu,vH_2_Occ,vH_2_Inc,vH_2_HS,
            vH_3_Name,vH_3_Age,vH_3_RTH,vH_3_MS,vH_3_Edu,vH_3_Occ,vH_3_Inc,vH_3_HS,
            vH_4_Name,vH_4_Age,vH_4_RTH,vH_4_MS,vH_4_Edu,vH_4_Occ,vH_4_Inc,vH_4_HS,
            vH_5_Name,vH_5_Age,vH_5_RTH,vH_5_MS,vH_5_Edu,vH_5_Occ,vH_5_Inc,vH_5_HS,
            vH_6_Name,vH_6_Age,vH_6_RTH,vH_6_MS,vH_6_Edu,vH_6_Occ,vH_6_Inc,vH_6_HS,
            vH_7_Name,vH_7_Age,vH_7_RTH,vH_7_MS,vH_7_Edu,vH_7_Occ,vH_7_Inc,vH_7_HS,
            vH_8_Name,vH_8_Age,vH_8_RTH,vH_8_MS,vH_8_Edu,vH_8_Occ,vH_8_Inc,vH_8_HS,
            vH_9_Name,vH_9_Age,vH_9_RTH,vH_9_MS,vH_9_Edu,vH_9_Occ,vH_9_Inc,vH_9_HS,
            vH_10_Name,vH_10_Age,vH_10_RTH,vH_10_MS,vH_10_Edu,vH_10_Occ,vH_10_Inc,vH_10_HS,
            vH_11_Name,vH_11_Age,vH_11_RTH,vH_11_MS,vH_11_Edu,vH_11_Occ,vH_11_Inc,vH_11_HS,
            vH_12_Name,vH_12_Age,vH_12_RTH,vH_12_MS,vH_12_Edu,vH_12_Occ,vH_12_Inc,vH_12_HS,
            vK,vQ,vS,vI,vJ,vL,vM,vN,vO,vP,vR,
            vT_1_1,vT_1_2,vT_1_3,vT_1_4,vT_1_5,vT_1_6,
            vT_2_1,vT_2_2,vT_2_3,vT_2_4,vT_2_5,vT_2_6,
            vT_3_1,vT_3_2,vT_3_3,vT_3_4,vT_3_5,vT_3_6,
            vU_1_Name, vU_1_Age, vU_1_1_a,vU_1_1_b,vU_1_1_c,vU_1_2_a,vU_1_2_b,vU_1_2_c,vU_1_3_a,vU_1_3_b,vU_1_4_a,vU_1_4_b,vU_1_4_c,vU_1_5_a,vU_1_5_b,vU_1_6_a,vU_1_6_b,vU_1_6_c,vU_1_6_d,vU_1_7_a,vU_1_8_a,vU_1_9_a,
            vU_2_Name, vU_2_Age, vU_2_1_a,vU_2_1_b,vU_2_1_c,vU_2_2_a,vU_2_2_b,vU_2_2_c,vU_2_3_a,vU_2_3_b,vU_2_4_a,vU_2_4_b,vU_2_4_c,vU_2_5_a,vU_2_5_b,vU_2_6_a,vU_2_6_b,vU_2_6_c,vU_2_6_d,vU_2_7_a,vU_2_8_a,vU_2_9_a,
            vU_3_Name, vU_3_Age, vU_3_1_a,vU_3_1_b,vU_3_1_c,vU_3_2_a,vU_3_2_b,vU_3_2_c,vU_3_3_a,vU_3_3_b,vU_3_4_a,vU_3_4_b,vU_3_4_c,vU_3_5_a,vU_3_5_b,vU_3_6_a,vU_3_6_b,vU_3_6_c,vU_3_6_d,vU_3_7_a,vU_3_8_a,vU_3_9_a,
            vU_4_Name, vU_4_Age, vU_4_1_a,vU_4_1_b,vU_4_1_c,vU_4_2_a,vU_4_2_b,vU_4_2_c,vU_4_3_a,vU_4_3_b,vU_4_4_a,vU_4_4_b,vU_4_4_c,vU_4_5_a,vU_4_5_b,vU_4_6_a,vU_4_6_b,vU_4_6_c,vU_4_6_d,vU_4_7_a,vU_4_8_a,vU_4_9_a,
            vU_5_Name, vU_5_Age, vU_5_1_a,vU_5_1_b,vU_5_1_c,vU_5_2_a,vU_5_2_b,vU_5_2_c,vU_5_3_a,vU_5_3_b,vU_5_4_a,vU_5_4_b,vU_5_4_c,vU_5_5_a,vU_5_5_b,vU_5_6_a,vU_5_6_b,vU_5_6_c,vU_5_6_d,vU_5_7_a,vU_5_8_a,vU_5_9_a,
            vV_1,vV_2,vV_3,vV_4,vV_5,vV_6,vV_7;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        initializeButtons();
        initializeFragments();


    }

    private void initializeFragments() {

        fragments=new ArrayList<Fragment>();
        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);
        fragments.add(fragment4);
        fragments.add(fragment4_1);
        fragments.add(fragment5);
        fragments.add(fragment6);
        fragments.add(fragment7);
        fragments.add(fragment8);
        fragments.add(fragment9);
        fragments.add(fragment9_1);
        fragments.add(fragment9_2);
        fragments.add(fragment10);

        ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_frame,fragments.get(0));
        ft.commit();


    }

    private void initializeButtons() {

        next=(Button)findViewById(R.id.next_button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ft= getSupportFragmentManager().beginTransaction();
                if(i==fragments.size()-1)
                {
                    Toast.makeText(MainActivity.this, "Last Fragment", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ft.replace(R.id.main_frame,fragments.get(++i));
                    ft.commit();

                    if(i==fragments.size()-1) {
                        next.setVisibility(View.INVISIBLE);
                        submit.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        next.setVisibility(View.VISIBLE);
                        submit.setVisibility(View.INVISIBLE);
                    }

                    if(i==0) {
                        prev.setVisibility(View.INVISIBLE);


                    }
                    else {
                        prev.setVisibility(View.VISIBLE);

                    }

                }
            }
        });


        prev=(Button)findViewById(R.id.prev_button);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ft= getSupportFragmentManager().beginTransaction();
                if(i==0)
                {
                    Toast.makeText(MainActivity.this, "First Fragment", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ft.replace(R.id.main_frame,fragments.get(--i));
                    ft.commit();

                    if(i==fragments.size()-1) {
                        next.setVisibility(View.INVISIBLE);
                        submit.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        next.setVisibility(View.VISIBLE);
                        submit.setVisibility(View.INVISIBLE);
                    }

                    if(i==0) {
                        prev.setVisibility(View.INVISIBLE);


                    }
                    else {
                        prev.setVisibility(View.VISIBLE);


                    }
                }

            }
        });

        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                
                Fragment f=getSupportFragmentManager().findFragmentById(R.id.main_frame);
                f.onDetach();
                f.onAttach((Context)MainActivity.this);

                //Toast.makeText(MainActivity.this, "Submitted! Loading New Form.", Toast.LENGTH_SHORT).show();
                submitForm();

                /*
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finish();
                startActivity(new Intent(MainActivity.this,MainActivity.class));

                */
            }
        });

    }

    public void submitForm()
    {
        //Implement your submit form method here

        if(vFolderNo.trim().equals("") || vFolderNo==null)
        {
            Toast.makeText(this, "Please fill the Folder No.!", Toast.LENGTH_SHORT).show();
            return;
        }

        DatabaseReference ref=FirebaseDatabase.getInstance().getReference().child("folders");


        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {



                if(dataSnapshot.hasChild(vFolderNo.trim())) {

                    Toast.makeText(MainActivity.this, "Folder No. already Exists!", Toast.LENGTH_SHORT).show();


                    AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Folder No. already Exists!");
                    alertDialog.setMessage("Do you want to overwrite the data?");
                    //alertDialog.setCancelable(false);
                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
                            //mDatabase.child("hri").child(fid.getText().toString()).setValue(result);
                            //subForm=true;
                            confirmSubmit();
                            Toast.makeText(MainActivity.this, "Submitted! Loading New Form.", Toast.LENGTH_SHORT).show();

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }



                            finish();
                            startActivity(new Intent(MainActivity.this, MainActivity.class));

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                            //subForm=false;
                            //FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo.trim()).removeValue();
                            return;
                        }
                    });

                    alertDialog.show();

                    return;


                }
                else{
                    confirmSubmit();
                    return;
                }


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }

    void confirmSubmit(){

        AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Confirmation");
        alertDialog.setMessage("Do you want to Submit the form?");
        //alertDialog.setCancelable(false);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
                //mDatabase.child("hri").child(fid.getText().toString()).setValue(result);
                //subForm=true;
                confirmSubmit();
                Toast.makeText(MainActivity.this, "Submitted! Loading New Form.", Toast.LENGTH_SHORT).show();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                finish();
                startActivity(new Intent(MainActivity.this, MainActivity.class));

            }
        });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                //subForm=false;
                FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo.trim()).removeValue();
                return;
            }
        });

        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo.trim()).removeValue();
                return;
            }
        });




        alertDialog.show();


        Person p1=new Person(vH_1_Name,vH_1_Age,vH_1_RTH,vH_1_MS,vH_1_Edu,vH_1_Occ,vH_1_Inc,vH_1_HS);
        Person p2=new Person(vH_2_Name,vH_2_Age,vH_2_RTH,vH_2_MS,vH_2_Edu,vH_2_Occ,vH_2_Inc,vH_2_HS);
        Person p3=new Person(vH_3_Name,vH_3_Age,vH_3_RTH,vH_3_MS,vH_3_Edu,vH_3_Occ,vH_3_Inc,vH_3_HS);
        Person p4=new Person(vH_4_Name,vH_4_Age,vH_4_RTH,vH_4_MS,vH_4_Edu,vH_4_Occ,vH_4_Inc,vH_4_HS);
        Person p5=new Person(vH_5_Name,vH_5_Age,vH_5_RTH,vH_5_MS,vH_5_Edu,vH_5_Occ,vH_5_Inc,vH_5_HS);
        Person p6=new Person(vH_6_Name,vH_6_Age,vH_6_RTH,vH_6_MS,vH_6_Edu,vH_6_Occ,vH_6_Inc,vH_6_HS);
        Person p7=new Person(vH_7_Name,vH_7_Age,vH_7_RTH,vH_7_MS,vH_7_Edu,vH_7_Occ,vH_7_Inc,vH_7_HS);
        Person p8=new Person(vH_8_Name,vH_8_Age,vH_8_RTH,vH_8_MS,vH_8_Edu,vH_8_Occ,vH_8_Inc,vH_8_HS);
        Person p9=new Person(vH_9_Name,vH_9_Age,vH_9_RTH,vH_9_MS,vH_9_Edu,vH_9_Occ,vH_9_Inc,vH_9_HS);
        Person p10=new Person(vH_10_Name,vH_10_Age,vH_10_RTH,vH_10_MS,vH_10_Edu,vH_10_Occ,vH_10_Inc,vH_10_HS);
        Person p11=new Person(vH_11_Name,vH_11_Age,vH_11_RTH,vH_11_MS,vH_11_Edu,vH_11_Occ,vH_11_Inc,vH_11_HS);
        Person p12=new Person(vH_12_Name,vH_12_Age,vH_12_RTH,vH_12_MS,vH_12_Edu,vH_12_Occ,vH_12_Inc,vH_12_HS);


        Couple c1=new Couple(vT_1_1,vT_1_2,vT_1_3,vT_1_4,vT_1_5,vT_1_6);
        Couple c2=new Couple(vT_2_1,vT_2_2,vT_2_3,vT_2_4,vT_2_5,vT_2_6);
        Couple c3=new Couple(vT_3_1,vT_3_2,vT_3_3,vT_3_4,vT_3_5,vT_3_6);

        Child ch1=new Child(vU_1_Name, vU_1_Age, vU_1_1_a,vU_1_1_b,vU_1_1_c,vU_1_2_a,vU_1_2_b,vU_1_2_c,vU_1_3_a,vU_1_3_b,vU_1_4_a,vU_1_4_b,vU_1_4_c,vU_1_5_a,vU_1_5_b,vU_1_6_a,vU_1_6_b,vU_1_6_c,vU_1_6_d,vU_1_7_a,vU_1_8_a,vU_1_9_a);
        Child ch2=new Child(vU_2_Name, vU_2_Age, vU_2_1_a,vU_2_1_b,vU_2_1_c,vU_2_2_a,vU_2_2_b,vU_2_2_c,vU_2_3_a,vU_2_3_b,vU_2_4_a,vU_2_4_b,vU_2_4_c,vU_2_5_a,vU_2_5_b,vU_2_6_a,vU_2_6_b,vU_2_6_c,vU_2_6_d,vU_2_7_a,vU_2_8_a,vU_2_9_a);
        Child ch3=new Child(vU_3_Name, vU_3_Age, vU_3_1_a,vU_3_1_b,vU_3_1_c,vU_3_2_a,vU_3_2_b,vU_3_2_c,vU_3_3_a,vU_3_3_b,vU_3_4_a,vU_3_4_b,vU_3_4_c,vU_3_5_a,vU_3_5_b,vU_3_6_a,vU_3_6_b,vU_3_6_c,vU_3_6_d,vU_3_7_a,vU_3_8_a,vU_3_9_a);
        Child ch4=new Child(vU_4_Name, vU_4_Age, vU_4_1_a,vU_4_1_b,vU_4_1_c,vU_4_2_a,vU_4_2_b,vU_4_2_c,vU_4_3_a,vU_4_3_b,vU_4_4_a,vU_4_4_b,vU_4_4_c,vU_4_5_a,vU_4_5_b,vU_4_6_a,vU_4_6_b,vU_4_6_c,vU_4_6_d,vU_4_7_a,vU_4_8_a,vU_4_9_a);
        Child ch5=new Child(vU_5_Name, vU_5_Age, vU_5_1_a,vU_5_1_b,vU_5_1_c,vU_5_2_a,vU_5_2_b,vU_5_2_c,vU_5_3_a,vU_5_3_b,vU_5_4_a,vU_5_4_b,vU_5_4_c,vU_5_5_a,vU_5_5_b,vU_5_6_a,vU_5_6_b,vU_5_6_c,vU_5_6_d,vU_5_7_a,vU_5_8_a,vU_5_9_a);

        //Folder folder=new Folder(vFolderNo,vA,vB_1,vB_2,vB_3,vB_4,vC,vD,vE,vF,vG,p1,p2,p3,p4,p5,p6,p7,p8,vK,vQ,vS,vI,vJ,vL,vM,vN,vO,vP,vR,c1,c2,c3);

        //folder.pushValues();


        //mDatabase.child("folders").child(vFolderNo).child("Couple 1").setValue(c1);
        mDatabase=mDatabase.child("folders").child(vFolderNo);

        mDatabase.child("Folder No").setValue(vFolderNo);

        mDatabase=mDatabase.child("SOCIO DEMOGRAPHIC DETAILS");
        mDatabase.child("A-Name of the head of the family").setValue(vA);

        mDatabase=mDatabase.child("B-Address");
        mDatabase.child("location").setValue(location);
        mDatabase.child("House No").setValue(vB_1);

        if(location.equalsIgnoreCase("Urban"))
            mDatabase.child("Street").setValue(vB_2);
        else if(location.equalsIgnoreCase("Rural"))
            mDatabase.child("Village").setValue(vB_3);

        mDatabase.child("Pincode").setValue(vB_4);

        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("SOCIO DEMOGRAPHIC DETAILS");

        mDatabase.child("C-Religion").setValue(vC);
        mDatabase.child("D-Caste").setValue(vD);
        mDatabase.child("E-Does the family possess").setValue(vE);
        mDatabase.child("F-Type of Family").setValue(vF);
        mDatabase.child("G-Socio Economic Status:").setValue(vG);

        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("SOCIO DEMOGRAPHIC DETAILS").child("H-Family Composition");
        mDatabase.child("Person 1").setValue(p1.getHashMap());
        mDatabase.child("Person 2").setValue(p2.getHashMap());
        mDatabase.child("Person 3").setValue(p3.getHashMap());
        mDatabase.child("Person 4").setValue(p4.getHashMap());
        mDatabase.child("Person 5").setValue(p5.getHashMap());
        mDatabase.child("Person 6").setValue(p6.getHashMap());
        mDatabase.child("Person 7").setValue(p7.getHashMap());
        mDatabase.child("Person 8").setValue(p8.getHashMap());
        mDatabase.child("Person 9").setValue(p9.getHashMap());
        mDatabase.child("Person 10").setValue(p10.getHashMap());
        mDatabase.child("Person 11").setValue(p11.getHashMap());
        mDatabase.child("Person 12").setValue(p12.getHashMap());


        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("ENVIRONMENTAL DETAILS");
        mDatabase.child("I-").setValue(vI);
        mDatabase.child("J-").setValue(vJ);
        mDatabase.child("K-Number of  living rooms").setValue(vK);
        mDatabase.child("L-House structure").setValue(vL);
        mDatabase.child("M-Separate kitchen").setValue(vM);
        mDatabase.child("N-Smoke outlet in the kitchen").setValue(vN);
        mDatabase.child("O-Overcrowding").setValue(vO);
        mDatabase.child("P-Ventilation and lighting").setValue(vP);
        mDatabase.child("Q-Water supply").setValue(vQ);
        mDatabase.child("R-Waste segregation").setValue(vR);
        mDatabase.child("S-Any other observations?").setValue(vS);


        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("T-Contraceptive Status");

        mDatabase.child("Couple 1").setValue(c1.getContraceptive());
        mDatabase.child("Couple 2").setValue(c2.getContraceptive());
        mDatabase.child("Couple 3").setValue(c3.getContraceptive());

        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("U-Vaccination Status").child("Child 1");
        mDatabase.child("Name").setValue(ch1.getName());
        mDatabase.child("Age").setValue(ch1.getAge());
        mDatabase.child("At Birth").setValue(ch1.getAtBirth());
        mDatabase.child("6 wks").setValue(ch1.getW6());
        mDatabase.child("10 wks").setValue(ch1.getW10());
        mDatabase.child("14 wks").setValue(ch1.getW14());
        mDatabase.child("9 mnt").setValue(ch1.getM9());
        mDatabase.child("16-24 mnt").setValue(ch1.getM16());
        mDatabase.child("5-6 yrs").setValue(ch1.getY5());
        mDatabase.child("10 yrs").setValue(ch1.getY10());
        mDatabase.child("16 yrs").setValue(ch1.getY16());


        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("U-Vaccination Status").child("Child 2");
        mDatabase.child("Name").setValue(ch2.getName());
        mDatabase.child("Age").setValue(ch2.getAge());
        mDatabase.child("At Birth").setValue(ch2.getAtBirth());
        mDatabase.child("6 wks").setValue(ch2.getW6());
        mDatabase.child("10 wks").setValue(ch2.getW10());
        mDatabase.child("14 wks").setValue(ch2.getW14());
        mDatabase.child("9 mnt").setValue(ch2.getM9());
        mDatabase.child("16-24 mnt").setValue(ch2.getM16());
        mDatabase.child("5-6 yrs").setValue(ch2.getY5());
        mDatabase.child("10 yrs").setValue(ch2.getY10());
        mDatabase.child("16 yrs").setValue(ch2.getY16());


        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("U-Vaccination Status").child("Child 3");
        mDatabase.child("Name").setValue(ch3.getName());
        mDatabase.child("Age").setValue(ch3.getAge());
        mDatabase.child("At Birth").setValue(ch3.getAtBirth());
        mDatabase.child("6 wks").setValue(ch3.getW6());
        mDatabase.child("10 wks").setValue(ch3.getW10());
        mDatabase.child("14 wks").setValue(ch3.getW14());
        mDatabase.child("9 mnt").setValue(ch3.getM9());
        mDatabase.child("16-24 mnt").setValue(ch3.getM16());
        mDatabase.child("5-6 yrs").setValue(ch3.getY5());
        mDatabase.child("10 yrs").setValue(ch3.getY10());
        mDatabase.child("16 yrs").setValue(ch3.getY16());

        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("U-Vaccination Status").child("Child 4");
        mDatabase.child("Name").setValue(ch4.getName());
        mDatabase.child("Age").setValue(ch4.getAge());
        mDatabase.child("At Birth").setValue(ch4.getAtBirth());
        mDatabase.child("6 wks").setValue(ch4.getW6());
        mDatabase.child("10 wks").setValue(ch4.getW10());
        mDatabase.child("14 wks").setValue(ch4.getW14());
        mDatabase.child("9 mnt").setValue(ch4.getM9());
        mDatabase.child("16-24 mnt").setValue(ch4.getM16());
        mDatabase.child("5-6 yrs").setValue(ch4.getY5());
        mDatabase.child("10 yrs").setValue(ch4.getY10());
        mDatabase.child("16 yrs").setValue(ch4.getY16());

        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("FAMILY WELFARE DETAILS");
        mDatabase=mDatabase.child("U-Vaccination Status").child("Child 5");
        mDatabase.child("Name").setValue(ch5.getName());
        mDatabase.child("Age").setValue(ch5.getAge());
        mDatabase.child("At Birth").setValue(ch5.getAtBirth());
        mDatabase.child("6 wks").setValue(ch5.getW6());
        mDatabase.child("10 wks").setValue(ch5.getW10());
        mDatabase.child("14 wks").setValue(ch5.getW14());
        mDatabase.child("9 mnt").setValue(ch5.getM9());
        mDatabase.child("16-24 mnt").setValue(ch5.getM16());
        mDatabase.child("5-6 yrs").setValue(ch5.getY5());
        mDatabase.child("10 yrs").setValue(ch5.getY10());
        mDatabase.child("16 yrs").setValue(ch5.getY16());


        mDatabase=FirebaseDatabase.getInstance().getReference().child("folders").child(vFolderNo).child("Summary of Family Members");
        mDatabase.child("Infants").setValue(vV_1);
        mDatabase.child("Under Five").setValue(vV_2);
        mDatabase.child("ANC").setValue(vV_3);
        mDatabase.child("PNC").setValue(vV_4);
        mDatabase.child("Elderly").setValue(vV_5);
        mDatabase.child("Eligible Couple").setValue(vV_6);
        mDatabase.child("Chronic Morbidity: ").setValue(vV_7);

        mDatabase=FirebaseDatabase.getInstance().getReference();


        //Toast.makeText(this, "Submitted!", Toast.LENGTH_SHORT).show();

    }

    

    

    

    

    
    
    @Override
    public void onFragmentInteraction1(Bundle bundle) {

        //vFolderNo=bundle.getString("vFolderNo");
        location=bundle.getString("location");
        vC=bundle.getString("vC",vC);
        vD=bundle.getString("vD",vD);
        vE=bundle.getString("vE",vE);
        vF=bundle.getString("vF",vF);


        vFolderNo=bundle.getString("vFolderNo",vFolderNo);
        vA=bundle.getString("vA",vA);
        vB_1=bundle.getString("vB_1",vB_1);
        vB_2=bundle.getString("vB_2",vB_2);
        vB_3=bundle.getString("vB_3",vB_3);
        vB_4=bundle.getString("vB_4",vB_4);
        vG=bundle.getString("vG",vG);

    }
    
    @Override
    public void onFragmentInteraction2(Bundle bundle) {

        vH_1_Name=bundle.getString("vH_1_Name",vH_1_Name);
        vH_1_Age=bundle.getString("vH_1_Age",vH_1_Age);
        vH_1_RTH=bundle.getString("vH_1_RTH",vH_1_RTH);
        vH_1_MS=bundle.getString("vH_1_MS",vH_1_MS);
        vH_1_Edu=bundle.getString("vH_1_Edu",vH_1_Edu);
        vH_1_Occ=bundle.getString("vH_1_Occ",vH_1_Occ);
        vH_1_Inc=bundle.getString("vH_1_Inc",vH_1_Inc);
        vH_1_HS=bundle.getString("vH_1_HS",vH_1_HS);

        vH_2_Name=bundle.getString("vH_2_Name",vH_2_Name);
        vH_2_Age=bundle.getString("vH_2_Age",vH_2_Age);
        vH_2_RTH=bundle.getString("vH_2_RTH",vH_2_RTH);
        vH_2_MS=bundle.getString("vH_2_MS",vH_2_MS);
        vH_2_Edu=bundle.getString("vH_2_Edu",vH_2_Edu);
        vH_2_Occ=bundle.getString("vH_2_Occ",vH_2_Occ);
        vH_2_Inc=bundle.getString("vH_2_Inc",vH_2_Inc);
        vH_2_HS=bundle.getString("vH_2_HS",vH_2_HS);

        vH_3_Name=bundle.getString("vH_3_Name",vH_3_Name);
        vH_3_Age=bundle.getString("vH_3_Age",vH_3_Age);
        vH_3_RTH=bundle.getString("vH_3_RTH",vH_3_RTH);
        vH_3_MS=bundle.getString("vH_3_MS",vH_3_MS);
        vH_3_Edu=bundle.getString("vH_3_Edu",vH_3_Edu);
        vH_3_Occ=bundle.getString("vH_3_Occ",vH_3_Occ);
        vH_3_Inc=bundle.getString("vH_3_Inc",vH_3_Inc);
        vH_3_HS=bundle.getString("vH_3_HS",vH_3_HS);

    }

    @Override
    public void onFragmentInteraction3(Bundle bundle) {

        vH_4_Name=bundle.getString("vH_4_Name",vH_4_Name);
        vH_4_Age=bundle.getString("vH_4_Age",vH_4_Age);
        vH_4_RTH=bundle.getString("vH_4_RTH",vH_4_RTH);
        vH_4_MS=bundle.getString("vH_4_MS",vH_4_MS);
        vH_4_Edu=bundle.getString("vH_4_Edu",vH_4_Edu);
        vH_4_Occ=bundle.getString("vH_4_Occ",vH_4_Occ);
        vH_4_Inc=bundle.getString("vH_4_Inc",vH_4_Inc);
        vH_4_HS=bundle.getString("vH_4_HS",vH_4_HS);

        vH_5_Name=bundle.getString("vH_5_Name",vH_5_Name);
        vH_5_Age=bundle.getString("vH_5_Age",vH_5_Age);
        vH_5_RTH=bundle.getString("vH_5_RTH",vH_5_RTH);
        vH_5_MS=bundle.getString("vH_5_MS",vH_5_MS);
        vH_5_Edu=bundle.getString("vH_5_Edu",vH_5_Edu);
        vH_5_Occ=bundle.getString("vH_5_Occ",vH_5_Occ);
        vH_5_Inc=bundle.getString("vH_5_Inc",vH_5_Inc);
        vH_5_HS=bundle.getString("vH_5_HS",vH_5_HS);

        vH_6_Name=bundle.getString("vH_6_Name",vH_6_Name);
        vH_6_Age=bundle.getString("vH_6_Age",vH_6_Age);
        vH_6_RTH=bundle.getString("vH_6_RTH",vH_6_RTH);
        vH_6_MS=bundle.getString("vH_6_MS",vH_6_MS);
        vH_6_Edu=bundle.getString("vH_6_Edu",vH_6_Edu);
        vH_6_Occ=bundle.getString("vH_6_Occ",vH_6_Occ);
        vH_6_Inc=bundle.getString("vH_6_Inc",vH_6_Inc);
        vH_6_HS=bundle.getString("vH_6_HS",vH_6_HS);

    }

    @Override
    public void onFragmentInteraction4(Bundle bundle) {

        vH_7_Name=bundle.getString("vH_7_Name",vH_7_Name);
        vH_7_Age=bundle.getString("vH_7_Age",vH_7_Age);
        vH_7_RTH=bundle.getString("vH_7_RTH",vH_7_RTH);
        vH_7_MS=bundle.getString("vH_7_MS",vH_7_MS);
        vH_7_Edu=bundle.getString("vH_7_Edu",vH_7_Edu);
        vH_7_Occ=bundle.getString("vH_7_Occ",vH_7_Occ);
        vH_7_Inc=bundle.getString("vH_7_Inc",vH_7_Inc);
        vH_7_HS=bundle.getString("vH_7_HS",vH_7_HS);

        vH_8_Name=bundle.getString("vH_8_Name",vH_8_Name);
        vH_8_Age=bundle.getString("vH_8_Age",vH_8_Age);
        vH_8_RTH=bundle.getString("vH_8_RTH",vH_8_RTH);
        vH_8_MS=bundle.getString("vH_8_MS",vH_8_MS);
        vH_8_Edu=bundle.getString("vH_8_Edu",vH_8_Edu);
        vH_8_Occ=bundle.getString("vH_8_Occ",vH_8_Occ);
        vH_8_Inc=bundle.getString("vH_8_Inc",vH_8_Inc);
        vH_8_HS=bundle.getString("vH_1_HS",vH_8_HS);

        vH_9_Name=bundle.getString("vH_9_Name",vH_9_Name);
        vH_9_Age=bundle.getString("vH_9_Age",vH_9_Age);
        vH_9_RTH=bundle.getString("vH_9_RTH",vH_9_RTH);
        vH_9_MS=bundle.getString("vH_9_MS",vH_9_MS);
        vH_9_Edu=bundle.getString("vH_9_Edu",vH_9_Edu);
        vH_9_Occ=bundle.getString("vH_9_Occ",vH_9_Occ);
        vH_9_Inc=bundle.getString("vH_9_Inc",vH_9_Inc);
        vH_9_HS=bundle.getString("vH_9_HS",vH_9_HS);

    }

    @Override
    public void onFragmentInteraction4_1(Bundle bundle) {

        vH_10_Name=bundle.getString("vH_10_Name",vH_10_Name);
        vH_10_Age=bundle.getString("vH_10_Age",vH_10_Age);
        vH_10_RTH=bundle.getString("vH_10_RTH",vH_10_RTH);
        vH_10_MS=bundle.getString("vH_10_MS",vH_10_MS);
        vH_10_Edu=bundle.getString("vH_10_Edu",vH_10_Edu);
        vH_10_Occ=bundle.getString("vH_10_Occ",vH_10_Occ);
        vH_10_Inc=bundle.getString("vH_10_Inc",vH_10_Inc);
        vH_10_HS=bundle.getString("vH_10_HS",vH_10_HS);

        vH_11_Name=bundle.getString("vH_11_Name",vH_11_Name);
        vH_11_Age=bundle.getString("vH_11_Age",vH_11_Age);
        vH_11_RTH=bundle.getString("vH_11_RTH",vH_11_RTH);
        vH_11_MS=bundle.getString("vH_11_MS",vH_11_MS);
        vH_11_Edu=bundle.getString("vH_11_Edu",vH_11_Edu);
        vH_11_Occ=bundle.getString("vH_11_Occ",vH_11_Occ);
        vH_11_Inc=bundle.getString("vH_11_Inc",vH_11_Inc);
        vH_11_HS=bundle.getString("vH_11_HS",vH_11_HS);

        vH_12_Name=bundle.getString("vH_12_Name",vH_12_Name);
        vH_12_Age=bundle.getString("vH_12_Age",vH_12_Age);
        vH_12_RTH=bundle.getString("vH_12_RTH",vH_12_RTH);
        vH_12_MS=bundle.getString("vH_12_MS",vH_12_MS);
        vH_12_Edu=bundle.getString("vH_12_Edu",vH_12_Edu);
        vH_12_Occ=bundle.getString("vH_12_Occ",vH_12_Occ);
        vH_12_Inc=bundle.getString("vH_12_Inc",vH_12_Inc);
        vH_12_HS=bundle.getString("vH_12_HS",vH_12_HS);


    }

    @Override
    public void onFragmentInteraction5(Bundle bundle) {

        vI=bundle.getString("vI",vI);
        vJ=bundle.getString("vJ",vJ);
        vL=bundle.getString("vL",vL);
        vM=bundle.getString("vM",vM);
        vN=bundle.getString("vN",vN);
        vO=bundle.getString("vO",vO);
        vP=bundle.getString("vP",vP);
        vR=bundle.getString("vR",vR);


        vK=bundle.getString("vK",vK);
        vQ=bundle.getString("vQ",vQ);
        vS=bundle.getString("vS",vS);
        
    }

    @Override
    public void onFragmentInteraction6(Bundle bundle) {

        vT_1_1=bundle.getString("vT_1_1",vT_1_1);
        vT_1_2=bundle.getString("vT_1_2",vT_1_2);
        vT_1_3=bundle.getString("vT_1_3",vT_1_3);
        vT_1_4=bundle.getString("vT_1_4",vT_1_4);
        vT_1_5=bundle.getString("vT_1_5",vT_1_5);
        vT_1_6=bundle.getString("vT_1_6",vT_1_6);

        vT_2_1=bundle.getString("vT_2_1",vT_2_1);
        vT_2_2=bundle.getString("vT_2_2",vT_2_2);
        vT_2_3=bundle.getString("vT_2_3",vT_2_3);
        vT_2_4=bundle.getString("vT_2_4",vT_2_4);
        vT_2_5=bundle.getString("vT_2_5",vT_2_5);
        vT_2_6=bundle.getString("vT_2_6",vT_2_6);

        vT_3_1=bundle.getString("vT_3_1",vT_3_1);
        vT_3_2=bundle.getString("vT_3_2",vT_3_2);
        vT_3_3=bundle.getString("vT_3_3",vT_3_3);
        vT_3_4=bundle.getString("vT_3_4",vT_3_4);
        vT_3_5=bundle.getString("vT_3_5",vT_3_5);
        vT_3_6=bundle.getString("vT_3_6",vT_3_6);



    }

    @Override
    public void onFragmentInteraction7(Bundle bundle) {

        vU_1_Name=bundle.getString("vU_1_Name");
        vU_1_Age=bundle.getString("vU_1_Age");

        vU_1_1_a=bundle.getString("vU_1_1_a");
        vU_1_1_b=bundle.getString("vU_1_1_b");
        vU_1_1_c=bundle.getString("vU_1_1_c");

        vU_1_2_a=bundle.getString("vU_1_2_a");
        vU_1_2_b=bundle.getString("vU_1_2_b");
        vU_1_2_c=bundle.getString("vU_1_2_c");

        vU_1_3_a=bundle.getString("vU_1_3_a");
        vU_1_3_b=bundle.getString("vU_1_3_b");

        vU_1_4_a=bundle.getString("vU_1_4_a");
        vU_1_4_b=bundle.getString("vU_1_4_b");
        vU_1_4_c=bundle.getString("vU_1_4_c");

        vU_1_5_a=bundle.getString("vU_1_5_a");
        vU_1_5_b=bundle.getString("vU_1_5_b");

        vU_1_6_a=bundle.getString("vU_1_6_a");
        vU_1_6_b=bundle.getString("vU_1_6_b");
        vU_1_6_c=bundle.getString("vU_1_6_c");
        vU_1_6_d=bundle.getString("vU_1_6_d");

        vU_1_7_a=bundle.getString("vU_1_7_a");
        vU_1_8_a=bundle.getString("vU_1_8_a");
        vU_1_9_a=bundle.getString("vU_1_9_a");

    }

    @Override
    public void onFragmentInteraction8(Bundle bundle) {

        vU_2_Name=bundle.getString("vU_2_Name");
        vU_2_Age=bundle.getString("vU_2_Age");

        vU_2_1_a=bundle.getString("vU_2_1_a");
        vU_2_1_b=bundle.getString("vU_2_1_b");
        vU_2_1_c=bundle.getString("vU_2_1_c");

        vU_2_2_a=bundle.getString("vU_2_2_a");
        vU_2_2_b=bundle.getString("vU_2_2_b");
        vU_2_2_c=bundle.getString("vU_2_2_c");

        vU_2_3_a=bundle.getString("vU_2_3_a");
        vU_2_3_b=bundle.getString("vU_2_3_b");

        vU_2_4_a=bundle.getString("vU_2_4_a");
        vU_2_4_b=bundle.getString("vU_2_4_b");
        vU_2_4_c=bundle.getString("vU_2_4_c");

        vU_2_5_a=bundle.getString("vU_2_5_a");
        vU_2_5_b=bundle.getString("vU_2_5_b");

        vU_2_6_a=bundle.getString("vU_2_6_a");
        vU_2_6_b=bundle.getString("vU_2_6_b");
        vU_2_6_c=bundle.getString("vU_2_6_c");
        vU_2_6_d=bundle.getString("vU_2_6_d");

        vU_2_7_a=bundle.getString("vU_2_7_a");
        vU_2_8_a=bundle.getString("vU_2_8_a");
        vU_2_9_a=bundle.getString("vU_2_9_a");


    }

    @Override
    public void onFragmentInteraction9(Bundle bundle) {

        vU_3_Name=bundle.getString("vU_3_Name");
        vU_3_Age=bundle.getString("vU_3_Age");

        vU_3_1_a=bundle.getString("vU_3_1_a");
        vU_3_1_b=bundle.getString("vU_3_1_b");
        vU_3_1_c=bundle.getString("vU_3_1_c");

        vU_3_2_a=bundle.getString("vU_3_2_a");
        vU_3_2_b=bundle.getString("vU_3_2_b");
        vU_3_2_c=bundle.getString("vU_3_2_c");

        vU_3_3_a=bundle.getString("vU_3_3_a");
        vU_3_3_b=bundle.getString("vU_3_3_b");

        vU_3_4_a=bundle.getString("vU_3_4_a");
        vU_3_4_b=bundle.getString("vU_3_4_b");
        vU_3_4_c=bundle.getString("vU_3_4_c");

        vU_3_5_a=bundle.getString("vU_3_5_a");
        vU_3_5_b=bundle.getString("vU_3_5_b");

        vU_3_6_a=bundle.getString("vU_3_6_a");
        vU_3_6_b=bundle.getString("vU_3_6_b");
        vU_3_6_c=bundle.getString("vU_3_6_c");
        vU_3_6_d=bundle.getString("vU_3_6_d");

        vU_3_7_a=bundle.getString("vU_3_7_a");
        vU_3_8_a=bundle.getString("vU_3_8_a");
        vU_3_9_a=bundle.getString("vU_3_9_a");


    }

    @Override
    public void onFragmentInteraction9_1(Bundle bundle) {

        vU_4_Name=bundle.getString("vU_4_Name");
        vU_4_Age=bundle.getString("vU_4_Age");

        vU_4_1_a=bundle.getString("vU_4_1_a");
        vU_4_1_b=bundle.getString("vU_4_1_b");
        vU_4_1_c=bundle.getString("vU_4_1_c");

        vU_4_2_a=bundle.getString("vU_4_2_a");
        vU_4_2_b=bundle.getString("vU_4_2_b");
        vU_4_2_c=bundle.getString("vU_4_2_c");

        vU_4_3_a=bundle.getString("vU_4_3_a");
        vU_4_3_b=bundle.getString("vU_4_3_b");

        vU_4_4_a=bundle.getString("vU_4_4_a");
        vU_4_4_b=bundle.getString("vU_4_4_b");
        vU_4_4_c=bundle.getString("vU_4_4_c");

        vU_4_5_a=bundle.getString("vU_4_5_a");
        vU_4_5_b=bundle.getString("vU_4_5_b");

        vU_4_6_a=bundle.getString("vU_4_6_a");
        vU_4_6_b=bundle.getString("vU_4_6_b");
        vU_4_6_c=bundle.getString("vU_4_6_c");
        vU_4_6_d=bundle.getString("vU_4_6_d");

        vU_4_7_a=bundle.getString("vU_4_7_a");
        vU_4_8_a=bundle.getString("vU_4_8_a");
        vU_4_9_a=bundle.getString("vU_4_9_a");


    }

    @Override
    public void onFragmentInteraction9_2(Bundle bundle) {

        vU_5_Name=bundle.getString("vU_5_Name");
        vU_5_Age=bundle.getString("vU_5_Age");

        vU_5_1_a=bundle.getString("vU_5_1_a");
        vU_5_1_b=bundle.getString("vU_5_1_b");
        vU_5_1_c=bundle.getString("vU_5_1_c");

        vU_5_2_a=bundle.getString("vU_5_2_a");
        vU_5_2_b=bundle.getString("vU_5_2_b");
        vU_5_2_c=bundle.getString("vU_5_2_c");

        vU_5_3_a=bundle.getString("vU_5_3_a");
        vU_5_3_b=bundle.getString("vU_5_3_b");

        vU_5_4_a=bundle.getString("vU_5_4_a");
        vU_5_4_b=bundle.getString("vU_5_4_b");
        vU_5_4_c=bundle.getString("vU_5_4_c");

        vU_5_5_a=bundle.getString("vU_5_5_a");
        vU_5_5_b=bundle.getString("vU_5_5_b");

        vU_5_6_a=bundle.getString("vU_5_6_a");
        vU_5_6_b=bundle.getString("vU_5_6_b");
        vU_5_6_c=bundle.getString("vU_5_6_c");
        vU_5_6_d=bundle.getString("vU_5_6_d");

        vU_5_7_a=bundle.getString("vU_5_7_a");
        vU_5_8_a=bundle.getString("vU_5_8_a");
        vU_5_9_a=bundle.getString("vU_5_9_a");


    }

    @Override
    public void onFragmentInteraction10(Bundle bundle) {

        vV_1=bundle.getString("vV_1",vV_1);
        vV_2=bundle.getString("vV_2",vV_2);
        vV_3=bundle.getString("vV_3",vV_3);
        vV_4=bundle.getString("vV_4",vV_4);
        vV_5=bundle.getString("vV_5",vV_5);
        vV_6=bundle.getString("vV_6",vV_6);
        vV_7=bundle.getString("vV_7",vV_7);

    }



}
