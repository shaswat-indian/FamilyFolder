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
import android.widget.RadioButton;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    RadioButton vRural, vUrban;
    String location="Rural";
    EditText vFolderNo,vA,vB_1,vB_2,vB_3,vB_4,vG;
    Spinner vC,vD,vE,vF;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
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
        View v= inflater.inflate(R.layout.fragment_fragment1, container, false);

        initializeElements(v);

        return  v;
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction1(bundle);
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

        bundle.putString("location",location);
        bundle.putString("vC",vC.getSelectedItem().toString());
        bundle.putString("vD",vD.getSelectedItem().toString());
        bundle.putString("vE",vE.getSelectedItem().toString());
        bundle.putString("vF",vF.getSelectedItem().toString());

        bundle.putString("vFolderNo",vFolderNo.getText().toString());
        bundle.putString("vA",vA.getText().toString());
        bundle.putString("vB_1",vB_1.getText().toString());
        bundle.putString("vB_2",vB_2.getText().toString());
        bundle.putString("vB_3",vB_3.getText().toString());
        bundle.putString("vB_4",vB_4.getText().toString());
        bundle.putString("vG",vG.getText().toString());


        mListener.onFragmentInteraction1(bundle);

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
        void onFragmentInteraction1(Bundle bundle);
    }

    private void initializeElements(View v) {

        vFolderNo=v.findViewById(R.id.fFolderNo);
        vA=v.findViewById(R.id.fA);
        vRural=v.findViewById(R.id.fRural);
        vUrban=v.findViewById(R.id.fUrban);
        vB_1=v.findViewById(R.id.fB_1);
        vB_2=v.findViewById(R.id.fB_2);
        vB_3=v.findViewById(R.id.fB_3);
        vB_4=v.findViewById(R.id.fB_4);
        vG=v.findViewById(R.id.fG);

        vRural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vB_2.setText("");
                vB_2.setEnabled(false);
                vB_2.setBackgroundResource(R.color.grey);

                vB_3.setEnabled(true);
                vB_3.setBackgroundResource(R.drawable.spinner_style);

                location="Rural";
            }
        });

        vUrban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vB_3.setText("");
                vB_3.setEnabled(false);
                vB_3.setBackgroundResource(R.color.grey);


                vB_2.setEnabled(true);
                vB_2.setBackgroundResource(R.drawable.spinner_style);

                location="Urban";
            }
        });


        vC=(Spinner)v.findViewById(R.id.fC);
        ArrayAdapter<CharSequence> adapterC=ArrayAdapter.createFromResource(getActivity(),R.array.arrC,android.R.layout.simple_spinner_item);
        adapterC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vC.setAdapter(adapterC);
        vC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vD=(Spinner)v.findViewById(R.id.fD);
        ArrayAdapter<CharSequence> adapterD=ArrayAdapter.createFromResource(getActivity(),R.array.arrD,android.R.layout.simple_spinner_item);
        adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vD.setAdapter(adapterD);
        vD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vE=(Spinner)v.findViewById(R.id.fE);
        ArrayAdapter<CharSequence> adapterE=ArrayAdapter.createFromResource(getActivity(),R.array.arrE,android.R.layout.simple_spinner_item);
        adapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vE.setAdapter(adapterE);
        vE.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vF=(Spinner)v.findViewById(R.id.fF);
        ArrayAdapter<CharSequence> adapterF=ArrayAdapter.createFromResource(getActivity(),R.array.arrF,android.R.layout.simple_spinner_item);
        adapterF.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vF.setAdapter(adapterF);
        vF.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
