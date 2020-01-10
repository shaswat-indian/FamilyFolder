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
 * {@link Fragment5.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vK,vQ,vS;
    Spinner vI,vJ,vL,vM,vN,vO,vP,vR;

    public Fragment5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment5.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment5 newInstance(String param1, String param2) {
        Fragment5 fragment = new Fragment5();
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
        View v= inflater.inflate(R.layout.fragment_fragment5, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction5(bundle);
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
        bundle.putString("vI",vI.getSelectedItem().toString());
        bundle.putString("vJ",vJ.getSelectedItem().toString());
        bundle.putString("vL",vL.getSelectedItem().toString());
        bundle.putString("vM",vM.getSelectedItem().toString());
        bundle.putString("vN",vN.getSelectedItem().toString());
        bundle.putString("vO",vO.getSelectedItem().toString());
        bundle.putString("vP",vP.getSelectedItem().toString());
        bundle.putString("vR",vR.getSelectedItem().toString());
        

        bundle.putString("vK",vK.getText().toString());
        bundle.putString("vQ",vQ.getText().toString());
        bundle.putString("vS",vS.getText().toString());


        mListener.onFragmentInteraction5(bundle);

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
        void onFragmentInteraction5(Bundle bundle);
    }

    private void initializeElements(View v) {


        vK=v.findViewById(R.id.fK);
        vQ=v.findViewById(R.id.fQ);
        vS=v.findViewById(R.id.fS);


        vI=(Spinner)v.findViewById(R.id.fI);
        ArrayAdapter<CharSequence> adapterI=ArrayAdapter.createFromResource(getActivity(),R.array.arrI,android.R.layout.simple_spinner_item);
        adapterI.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vI.setAdapter(adapterI);
        vI.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vJ=(Spinner)v.findViewById(R.id.fJ);
        ArrayAdapter<CharSequence> adapterJ=ArrayAdapter.createFromResource(getActivity(),R.array.arrJ,android.R.layout.simple_spinner_item);
        adapterJ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vJ.setAdapter(adapterJ);
        vJ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vL=(Spinner)v.findViewById(R.id.fL);
        ArrayAdapter<CharSequence> adapterL=ArrayAdapter.createFromResource(getActivity(),R.array.arrL,android.R.layout.simple_spinner_item);
        adapterL.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vL.setAdapter(adapterL);
        vL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vM=(Spinner)v.findViewById(R.id.fM);
        ArrayAdapter<CharSequence> adapterM=ArrayAdapter.createFromResource(getActivity(),R.array.arrM,android.R.layout.simple_spinner_item);
        adapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vM.setAdapter(adapterM);
        vM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vN=(Spinner)v.findViewById(R.id.fN);
        ArrayAdapter<CharSequence> adapterN=ArrayAdapter.createFromResource(getActivity(),R.array.arrN,android.R.layout.simple_spinner_item);
        adapterN.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vN.setAdapter(adapterN);
        vN.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vO=(Spinner)v.findViewById(R.id.fO);
        ArrayAdapter<CharSequence> adapterO=ArrayAdapter.createFromResource(getActivity(),R.array.arrO,android.R.layout.simple_spinner_item);
        adapterO.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vO.setAdapter(adapterO);
        vO.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vP=(Spinner)v.findViewById(R.id.fP);
        ArrayAdapter<CharSequence> adapterP=ArrayAdapter.createFromResource(getActivity(),R.array.arrP,android.R.layout.simple_spinner_item);
        adapterP.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vP.setAdapter(adapterP);
        vP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vR=(Spinner)v.findViewById(R.id.fR);
        ArrayAdapter<CharSequence> adapterR=ArrayAdapter.createFromResource(getActivity(),R.array.arrR,android.R.layout.simple_spinner_item);
        adapterR.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vR.setAdapter(adapterR);
        vR.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
