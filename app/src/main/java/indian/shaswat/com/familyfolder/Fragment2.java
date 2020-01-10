package indian.shaswat.com.familyfolder;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vH_1_Name,vH_1_Age,vH_1_Edu,vH_1_Occ,vH_1_Inc,vH_1_HS,
            vH_2_Name,vH_2_Age,vH_2_Edu,vH_2_Occ,vH_2_Inc,vH_2_HS,
            vH_3_Name,vH_3_Age,vH_3_Edu,vH_3_Occ,vH_3_Inc,vH_3_HS;

    Spinner vH_1_MS,vH_2_MS,vH_3_MS,vH_1_RTH,vH_2_RTH,vH_3_RTH;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment2, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction2(bundle);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        Bundle bundle=new Bundle();


        bundle.putString("vH_1_Name",vH_1_Name.getText().toString());
        bundle.putString("vH_1_Age",vH_1_Age.getText().toString());
        bundle.putString("vH_1_RTH",vH_1_RTH.getSelectedItem().toString());
        bundle.putString("vH_1_MS",vH_1_MS.getSelectedItem().toString());
        bundle.putString("vH_1_Edu",vH_1_Edu.getText().toString());
        bundle.putString("vH_1_Occ",vH_1_Occ.getText().toString());
        bundle.putString("vH_1_Inc",vH_1_Inc.getText().toString());
        bundle.putString("vH_1_HS",vH_1_HS.getText().toString());


        bundle.putString("vH_2_Name",vH_2_Name.getText().toString());
        bundle.putString("vH_2_Age",vH_2_Age.getText().toString());
        bundle.putString("vH_2_RTH",vH_2_RTH.getSelectedItem().toString());
        bundle.putString("vH_2_MS",vH_2_MS.getSelectedItem().toString());
        bundle.putString("vH_2_Edu",vH_2_Edu.getText().toString());
        bundle.putString("vH_2_Occ",vH_2_Occ.getText().toString());
        bundle.putString("vH_2_Inc",vH_2_Inc.getText().toString());
        bundle.putString("vH_2_HS",vH_2_HS.getText().toString());

        bundle.putString("vH_3_Name",vH_3_Name.getText().toString());
        bundle.putString("vH_3_Age",vH_3_Age.getText().toString());
        bundle.putString("vH_3_RTH",vH_3_RTH.getSelectedItem().toString());
        bundle.putString("vH_3_MS",vH_3_MS.getSelectedItem().toString());
        bundle.putString("vH_3_Edu",vH_3_Edu.getText().toString());
        bundle.putString("vH_3_Occ",vH_3_Occ.getText().toString());
        bundle.putString("vH_3_Inc",vH_3_Inc.getText().toString());
        bundle.putString("vH_3_HS",vH_3_HS.getText().toString());


        mListener.onFragmentInteraction2(bundle);

        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction2(Bundle bundle);
    }

    private void initializeElements(View v) {

        vH_1_Name = v.findViewById(R.id.fH_1_Name);
        vH_1_Age = v.findViewById(R.id.fH_1_Age);

        vH_1_Edu = v.findViewById(R.id.fH_1_Edu);
        vH_1_Occ = v.findViewById(R.id.fH_1_Occ);
        vH_1_Inc = v.findViewById(R.id.fH_1_Inc);
        vH_1_HS = v.findViewById(R.id.fH_1_HS);

        vH_1_MS = v.findViewById(R.id.fH_1_MS);
        ArrayAdapter<CharSequence> adapterH_1_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_1_MS,android.R.layout.simple_spinner_item);
        adapterH_1_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_1_MS.setAdapter(adapterH_1_MS);
        vH_1_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_1_RTH=v.findViewById(R.id.fH_1_RTH);
        ArrayAdapter<CharSequence> adapterH_1_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_1_RTH,android.R.layout.simple_spinner_item);
        adapterH_1_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_1_RTH.setAdapter(adapterH_1_RTH);
        vH_1_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vH_2_Name = v.findViewById(R.id.fH_2_Name);
        vH_2_Age = v.findViewById(R.id.fH_2_Age);
        vH_2_Edu = v.findViewById(R.id.fH_2_Edu);
        vH_2_Occ = v.findViewById(R.id.fH_2_Occ);
        vH_2_Inc = v.findViewById(R.id.fH_2_Inc);
        vH_2_HS = v.findViewById(R.id.fH_2_HS);

        vH_2_MS = v.findViewById(R.id.fH_2_MS);
        ArrayAdapter<CharSequence> adapterH_2_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_2_MS,android.R.layout.simple_spinner_item);
        adapterH_2_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_2_MS.setAdapter(adapterH_2_MS);
        vH_2_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_2_RTH=v.findViewById(R.id.fH_2_RTH);
        ArrayAdapter<CharSequence> adapterH_2_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_2_RTH,android.R.layout.simple_spinner_item);
        adapterH_2_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_2_RTH.setAdapter(adapterH_2_RTH);
        vH_2_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_3_Name = v.findViewById(R.id.fH_3_Name);
        vH_3_Age = v.findViewById(R.id.fH_3_Age);
        vH_3_Edu = v.findViewById(R.id.fH_3_Edu);
        vH_3_Occ = v.findViewById(R.id.fH_3_Occ);
        vH_3_Inc = v.findViewById(R.id.fH_3_Inc);
        vH_3_HS = v.findViewById(R.id.fH_3_HS);

        vH_3_MS = v.findViewById(R.id.fH_3_MS);
        ArrayAdapter<CharSequence> adapterH_3_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_3_MS,android.R.layout.simple_spinner_item);
        adapterH_3_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_3_MS.setAdapter(adapterH_3_MS);
        vH_3_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_3_RTH=v.findViewById(R.id.fH_3_RTH);
        ArrayAdapter<CharSequence> adapterH_3_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_3_RTH,android.R.layout.simple_spinner_item);
        adapterH_3_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_3_RTH.setAdapter(adapterH_3_RTH);
        vH_3_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    }
