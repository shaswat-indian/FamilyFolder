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
public class Fragment4_1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vH_10_Name,vH_10_Age,vH_10_Edu,vH_10_Occ,vH_10_Inc,vH_10_HS,
            vH_11_Name,vH_11_Age,vH_11_Edu,vH_11_Occ,vH_11_Inc,vH_11_HS,
            vH_12_Name,vH_12_Age,vH_12_Edu,vH_12_Occ,vH_12_Inc,vH_12_HS;

    Spinner vH_10_MS,vH_11_MS,vH_12_MS,vH_10_RTH,vH_11_RTH,vH_12_RTH;

    public Fragment4_1() {
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
        View v= inflater.inflate(R.layout.fragment_fragment4_1, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction4_1(bundle);
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


        bundle.putString("vH_10_Name",vH_10_Name.getText().toString());
        bundle.putString("vH_10_Age",vH_10_Age.getText().toString());
        bundle.putString("vH_10_RTH",vH_10_RTH.getSelectedItem().toString());
        bundle.putString("vH_10_MS",vH_10_MS.getSelectedItem().toString());
        bundle.putString("vH_10_Edu",vH_10_Edu.getText().toString());
        bundle.putString("vH_10_Occ",vH_10_Occ.getText().toString());
        bundle.putString("vH_10_Inc",vH_10_Inc.getText().toString());
        bundle.putString("vH_10_HS",vH_10_HS.getText().toString());

        bundle.putString("vH_11_Name",vH_11_Name.getText().toString());
        bundle.putString("vH_11_Age",vH_11_Age.getText().toString());
        bundle.putString("vH_11_RTH",vH_11_RTH.getSelectedItem().toString());
        bundle.putString("vH_11_MS",vH_11_MS.getSelectedItem().toString());
        bundle.putString("vH_11_Edu",vH_11_Edu.getText().toString());
        bundle.putString("vH_11_Occ",vH_11_Occ.getText().toString());
        bundle.putString("vH_11_Inc",vH_11_Inc.getText().toString());
        bundle.putString("vH_11_HS",vH_11_HS.getText().toString());

        bundle.putString("vH_12_Name",vH_12_Name.getText().toString());
        bundle.putString("vH_12_Age",vH_12_Age.getText().toString());
        bundle.putString("vH_12_RTH",vH_12_RTH.getSelectedItem().toString());
        bundle.putString("vH_12_MS",vH_12_MS.getSelectedItem().toString());
        bundle.putString("vH_12_Edu",vH_12_Edu.getText().toString());
        bundle.putString("vH_12_Occ",vH_12_Occ.getText().toString());
        bundle.putString("vH_12_Inc",vH_12_Inc.getText().toString());
        bundle.putString("vH_12_HS",vH_12_HS.getText().toString());


        mListener.onFragmentInteraction4_1(bundle);

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
        void onFragmentInteraction4_1(Bundle bundle);
    }

    private void initializeElements(View v) {

        vH_10_Name = v.findViewById(R.id.fH_10_Name);
        vH_10_Age = v.findViewById(R.id.fH_10_Age);
        vH_10_Edu = v.findViewById(R.id.fH_10_Edu);
        vH_10_Occ = v.findViewById(R.id.fH_10_Occ);
        vH_10_Inc = v.findViewById(R.id.fH_10_Inc);
        vH_10_HS = v.findViewById(R.id.fH_10_HS);

        vH_10_MS = v.findViewById(R.id.fH_10_MS);
        ArrayAdapter<CharSequence> adapterH_10_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_10_MS,android.R.layout.simple_spinner_item);
        adapterH_10_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_10_MS.setAdapter(adapterH_10_MS);
        vH_10_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_10_RTH=v.findViewById(R.id.fH_10_RTH);
        ArrayAdapter<CharSequence> adapterH_10_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_10_RTH,android.R.layout.simple_spinner_item);
        adapterH_10_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_10_RTH.setAdapter(adapterH_10_RTH);
        vH_10_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_11_Name = v.findViewById(R.id.fH_11_Name);
        vH_11_Age = v.findViewById(R.id.fH_11_Age);
        vH_11_Edu = v.findViewById(R.id.fH_11_Edu);
        vH_11_Occ = v.findViewById(R.id.fH_11_Occ);
        vH_11_Inc = v.findViewById(R.id.fH_11_Inc);
        vH_11_HS = v.findViewById(R.id.fH_11_HS);

        vH_11_MS = v.findViewById(R.id.fH_11_MS);
        ArrayAdapter<CharSequence> adapterH_11_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_11_MS,android.R.layout.simple_spinner_item);
        adapterH_11_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_11_MS.setAdapter(adapterH_11_MS);
        vH_11_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_11_RTH=v.findViewById(R.id.fH_11_RTH);
        ArrayAdapter<CharSequence> adapterH_11_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_11_RTH,android.R.layout.simple_spinner_item);
        adapterH_11_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_11_RTH.setAdapter(adapterH_11_RTH);
        vH_11_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vH_12_Name = v.findViewById(R.id.fH_12_Name);
        vH_12_Age = v.findViewById(R.id.fH_12_Age);
        vH_12_Edu = v.findViewById(R.id.fH_12_Edu);
        vH_12_Occ = v.findViewById(R.id.fH_12_Occ);
        vH_12_Inc = v.findViewById(R.id.fH_12_Inc);
        vH_12_HS = v.findViewById(R.id.fH_12_HS);

        vH_12_MS = v.findViewById(R.id.fH_12_MS);
        ArrayAdapter<CharSequence> adapterH_12_MS=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_12_MS,android.R.layout.simple_spinner_item);
        adapterH_12_MS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_12_MS.setAdapter(adapterH_12_MS);
        vH_12_MS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vH_12_RTH=v.findViewById(R.id.fH_12_RTH);
        ArrayAdapter<CharSequence> adapterH_12_RTH=ArrayAdapter.createFromResource(getActivity(),R.array.arrH_12_RTH,android.R.layout.simple_spinner_item);
        adapterH_12_RTH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vH_12_RTH.setAdapter(adapterH_12_RTH);
        vH_12_RTH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
