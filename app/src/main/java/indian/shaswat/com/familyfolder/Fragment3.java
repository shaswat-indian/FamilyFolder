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
 * {@link Fragment3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vH_4_Name,vH_4_Age,vH_4_Edu,vH_4_Occ,vH_4_Inc,vH_4_HS,
            vH_5_Name,vH_5_Age,vH_5_Edu,vH_5_Occ,vH_5_Inc,vH_5_HS,
            vH_6_Name,vH_6_Age,vH_6_Edu,vH_6_Occ,vH_6_Inc,vH_6_HS;

    Spinner vH_4_MS,vH_5_MS,vH_6_MS,vH_4_RTH,vH_5_RTH,vH_6_RTH;
    
    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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
        View v= inflater.inflate(R.layout.fragment_fragment3, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction3(bundle);
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


        bundle.putString("vH_4_Name",vH_4_Name.getText().toString());
        bundle.putString("vH_4_Age",vH_4_Age.getText().toString());
        bundle.putString("vH_4_RTH",vH_4_RTH.getSelectedItem().toString());
        bundle.putString("vH_4_MS",vH_4_MS.getSelectedItem().toString());
        bundle.putString("vH_4_Edu",vH_4_Edu.getText().toString());
        bundle.putString("vH_4_Occ",vH_4_Occ.getText().toString());
        bundle.putString("vH_4_Inc",vH_4_Inc.getText().toString());
        bundle.putString("vH_4_HS",vH_4_HS.getText().toString());

        bundle.putString("vH_5_Name",vH_5_Name.getText().toString());
        bundle.putString("vH_5_Age",vH_5_Age.getText().toString());
        bundle.putString("vH_5_RTH",vH_5_RTH.getSelectedItem().toString());
        bundle.putString("vH_5_MS",vH_5_MS.getSelectedItem().toString());
        bundle.putString("vH_5_Edu",vH_5_Edu.getText().toString());
        bundle.putString("vH_5_Occ",vH_5_Occ.getText().toString());
        bundle.putString("vH_5_Inc",vH_5_Inc.getText().toString());
        bundle.putString("vH_5_HS",vH_5_HS.getText().toString());

        bundle.putString("vH_6_Name",vH_6_Name.getText().toString());
        bundle.putString("vH_6_Age",vH_6_Age.getText().toString());
        bundle.putString("vH_6_RTH",vH_6_RTH.getSelectedItem().toString());
        bundle.putString("vH_6_MS",vH_6_MS.getSelectedItem().toString());
        bundle.putString("vH_6_Edu",vH_6_Edu.getText().toString());
        bundle.putString("vH_6_Occ",vH_6_Occ.getText().toString());
        bundle.putString("vH_6_Inc",vH_6_Inc.getText().toString());
        bundle.putString("vH_6_HS",vH_6_HS.getText().toString());


        mListener.onFragmentInteraction3(bundle);

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
        void onFragmentInteraction3(Bundle bundle);
    }

    private void initializeElements(View v) {

        vH_4_Name = v.findViewById(R.id.fH_4_Name);
        vH_4_Age = v.findViewById(R.id.fH_4_Age);
        vH_4_Edu = v.findViewById(R.id.fH_4_Edu);
        vH_4_Occ = v.findViewById(R.id.fH_4_Occ);
        vH_4_Inc = v.findViewById(R.id.fH_4_Inc);
        vH_4_HS = v.findViewById(R.id.fH_4_HS);

        vH_4_MS = v.findViewById(R.id.fH_4_MS);
        ArrayAdapter<CharSequence> adapterH_4_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_4_MS,android.R.layout.simple_spinner_item);
        adapterH_4_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_4_MS.setAdapter(adapterH_4_MS);
        vH_4_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_4_RTH=v.findViewById(R.id.fH_4_RTH);
        ArrayAdapter<CharSequence> adapterH_4_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_4_RTH,android.R.layout.simple_spinner_item);
        adapterH_4_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_4_RTH.setAdapter(adapterH_4_RTH);
        vH_4_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vH_5_Name = v.findViewById(R.id.fH_5_Name);
        vH_5_Age = v.findViewById(R.id.fH_5_Age);
        vH_5_Edu = v.findViewById(R.id.fH_5_Edu);
        vH_5_Occ = v.findViewById(R.id.fH_5_Occ);
        vH_5_Inc = v.findViewById(R.id.fH_5_Inc);
        vH_5_HS = v.findViewById(R.id.fH_5_HS);

        vH_5_MS = v.findViewById(R.id.fH_5_MS);
        ArrayAdapter<CharSequence> adapterH_5_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_5_MS,android.R.layout.simple_spinner_item);
        adapterH_5_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_5_MS.setAdapter(adapterH_5_MS);
        vH_5_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_5_RTH=v.findViewById(R.id.fH_5_RTH);
        ArrayAdapter<CharSequence> adapterH_5_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_5_RTH,android.R.layout.simple_spinner_item);
        adapterH_5_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_5_RTH.setAdapter(adapterH_5_RTH);
        vH_5_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_6_Name = v.findViewById(R.id.fH_6_Name);
        vH_6_Age = v.findViewById(R.id.fH_6_Age);
        vH_6_Edu = v.findViewById(R.id.fH_6_Edu);
        vH_6_Occ = v.findViewById(R.id.fH_6_Occ);
        vH_6_Inc = v.findViewById(R.id.fH_6_Inc);
        vH_6_HS = v.findViewById(R.id.fH_6_HS);

        vH_6_MS = v.findViewById(R.id.fH_6_MS);
        ArrayAdapter<CharSequence> adapterH_6_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_6_MS,android.R.layout.simple_spinner_item);
        adapterH_6_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_6_MS.setAdapter(adapterH_6_MS);
        vH_6_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_6_RTH=v.findViewById(R.id.fH_6_RTH);
        ArrayAdapter<CharSequence> adapterH_6_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_6_RTH,android.R.layout.simple_spinner_item);
        adapterH_6_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_6_RTH.setAdapter(adapterH_6_RTH);
        vH_6_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
