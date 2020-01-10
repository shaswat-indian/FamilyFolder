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
 * {@link Fragment4.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment4 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vH_7_Name,vH_7_Age,vH_7_Edu,vH_7_Occ,vH_7_Inc,vH_7_HS,
            vH_8_Name,vH_8_Age,vH_8_Edu,vH_8_Occ,vH_8_Inc,vH_8_HS,
            vH_9_Name,vH_9_Age,vH_9_Edu,vH_9_Occ,vH_9_Inc,vH_9_HS;

    Spinner vH_7_MS,vH_8_MS,vH_9_MS,vH_7_RTH,vH_8_RTH,vH_9_RTH;
    
    public Fragment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
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
        View v= inflater.inflate(R.layout.fragment_fragment4, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction4(bundle);
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


        bundle.putString("vH_7_Name",vH_7_Name.getText().toString());
        bundle.putString("vH_7_Age",vH_7_Age.getText().toString());
        bundle.putString("vH_7_RTH",vH_7_RTH.getSelectedItem().toString());
        bundle.putString("vH_7_MS",vH_7_MS.getSelectedItem().toString());
        bundle.putString("vH_7_Edu",vH_7_Edu.getText().toString());
        bundle.putString("vH_7_Occ",vH_7_Occ.getText().toString());
        bundle.putString("vH_7_Inc",vH_7_Inc.getText().toString());
        bundle.putString("vH_7_HS",vH_7_HS.getText().toString());

        bundle.putString("vH_8_Name",vH_8_Name.getText().toString());
        bundle.putString("vH_8_Age",vH_8_Age.getText().toString());
        bundle.putString("vH_8_RTH",vH_8_RTH.getSelectedItem().toString());
        bundle.putString("vH_8_MS",vH_8_MS.getSelectedItem().toString());
        bundle.putString("vH_8_Edu",vH_8_Edu.getText().toString());
        bundle.putString("vH_8_Occ",vH_8_Occ.getText().toString());
        bundle.putString("vH_8_Inc",vH_8_Inc.getText().toString());
        bundle.putString("vH_8_HS",vH_8_HS.getText().toString());

        bundle.putString("vH_9_Name",vH_9_Name.getText().toString());
        bundle.putString("vH_9_Age",vH_9_Age.getText().toString());
        bundle.putString("vH_9_RTH",vH_9_RTH.getSelectedItem().toString());
        bundle.putString("vH_9_MS",vH_9_MS.getSelectedItem().toString());
        bundle.putString("vH_9_Edu",vH_9_Edu.getText().toString());
        bundle.putString("vH_9_Occ",vH_9_Occ.getText().toString());
        bundle.putString("vH_9_Inc",vH_9_Inc.getText().toString());
        bundle.putString("vH_9_HS",vH_9_HS.getText().toString());


        mListener.onFragmentInteraction4(bundle);

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
        void onFragmentInteraction4(Bundle bundle);
    }

    private void initializeElements(View v) {

        vH_7_Name = v.findViewById(R.id.fH_7_Name);
        vH_7_Age = v.findViewById(R.id.fH_7_Age);
        vH_7_Edu = v.findViewById(R.id.fH_7_Edu);
        vH_7_Occ = v.findViewById(R.id.fH_7_Occ);
        vH_7_Inc = v.findViewById(R.id.fH_7_Inc);
        vH_7_HS = v.findViewById(R.id.fH_7_HS);

        vH_7_MS = v.findViewById(R.id.fH_7_MS);
        ArrayAdapter<CharSequence> adapterH_7_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_7_MS,android.R.layout.simple_spinner_item);
        adapterH_7_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_7_MS.setAdapter(adapterH_7_MS);
        vH_7_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_7_RTH=v.findViewById(R.id.fH_7_RTH);
        ArrayAdapter<CharSequence> adapterH_7_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_7_RTH,android.R.layout.simple_spinner_item);
        adapterH_7_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_7_RTH.setAdapter(adapterH_7_RTH);
        vH_7_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_8_Name = v.findViewById(R.id.fH_8_Name);
        vH_8_Age = v.findViewById(R.id.fH_8_Age);
        vH_8_Edu = v.findViewById(R.id.fH_8_Edu);
        vH_8_Occ = v.findViewById(R.id.fH_8_Occ);
        vH_8_Inc = v.findViewById(R.id.fH_8_Inc);
        vH_8_HS = v.findViewById(R.id.fH_8_HS);

        vH_8_MS = v.findViewById(R.id.fH_8_MS);
        ArrayAdapter<CharSequence> adapterH_8_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_8_MS,android.R.layout.simple_spinner_item);
        adapterH_8_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_8_MS.setAdapter(adapterH_8_MS);
        vH_8_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_8_RTH=v.findViewById(R.id.fH_8_RTH);
        ArrayAdapter<CharSequence> adapterH_8_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_8_RTH,android.R.layout.simple_spinner_item);
        adapterH_8_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_8_RTH.setAdapter(adapterH_8_RTH);
        vH_8_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        
        vH_9_Name = v.findViewById(R.id.fH_9_Name);
        vH_9_Age = v.findViewById(R.id.fH_9_Age);
        vH_9_Edu = v.findViewById(R.id.fH_9_Edu);
        vH_9_Occ = v.findViewById(R.id.fH_9_Occ);
        vH_9_Inc = v.findViewById(R.id.fH_9_Inc);
        vH_9_HS = v.findViewById(R.id.fH_9_HS);

        vH_9_MS = v.findViewById(R.id.fH_9_MS);
        ArrayAdapter<CharSequence> adapterH_9_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_9_MS,android.R.layout.simple_spinner_item);
        adapterH_9_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_9_MS.setAdapter(adapterH_9_MS);
        vH_9_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vH_9_RTH=v.findViewById(R.id.fH_9_RTH);
        ArrayAdapter<CharSequence> adapterH_9_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_9_RTH,android.R.layout.simple_spinner_item);
        adapterH_9_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_9_RTH.setAdapter(adapterH_9_RTH);
        vH_9_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
