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
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment6.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment6 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    
    Spinner vT_1_1,vT_1_2,vT_1_3,vT_1_4,vT_1_5,vT_1_6,
            vT_2_1,vT_2_2,vT_2_3,vT_2_4,vT_2_5,vT_2_6,
            vT_3_1,vT_3_2,vT_3_3,vT_3_4,vT_3_5,vT_3_6;
    

    public Fragment6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment6.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment6 newInstance(String param1, String param2) {
        Fragment6 fragment = new Fragment6();
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
        View v= inflater.inflate(R.layout.fragment_fragment6, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction6(bundle);
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
        bundle.putString("vT_1_1",vT_1_1.getSelectedItem().toString());
        bundle.putString("vT_1_2",vT_1_2.getSelectedItem().toString());
        bundle.putString("vT_1_3",vT_1_3.getSelectedItem().toString());
        bundle.putString("vT_1_4",vT_1_4.getSelectedItem().toString());
        bundle.putString("vT_1_5",vT_1_5.getSelectedItem().toString());
        bundle.putString("vT_1_6",vT_1_6.getSelectedItem().toString());

        bundle.putString("vT_2_1",vT_2_1.getSelectedItem().toString());
        bundle.putString("vT_2_2",vT_2_2.getSelectedItem().toString());
        bundle.putString("vT_2_3",vT_2_3.getSelectedItem().toString());
        bundle.putString("vT_2_4",vT_2_4.getSelectedItem().toString());
        bundle.putString("vT_2_5",vT_2_5.getSelectedItem().toString());
        bundle.putString("vT_2_6",vT_2_6.getSelectedItem().toString());

        bundle.putString("vT_3_1",vT_3_1.getSelectedItem().toString());
        bundle.putString("vT_3_2",vT_3_2.getSelectedItem().toString());
        bundle.putString("vT_3_3",vT_3_3.getSelectedItem().toString());
        bundle.putString("vT_3_4",vT_3_4.getSelectedItem().toString());
        bundle.putString("vT_3_5",vT_3_5.getSelectedItem().toString());
        bundle.putString("vT_3_6",vT_3_6.getSelectedItem().toString());



        mListener.onFragmentInteraction6(bundle);

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
        void onFragmentInteraction6(Bundle bundle);
    }

    private void initializeElements(View v) {

        

        vT_1_1=(Spinner)v.findViewById(R.id.fT_1_1);
        ArrayAdapter<CharSequence> adapterT_1_1=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_1,android.R.layout.simple_spinner_item);
        adapterT_1_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_1.setAdapter(adapterT_1_1);
        vT_1_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_1_2=(Spinner)v.findViewById(R.id.fT_1_2);
        ArrayAdapter<CharSequence> adapterT_1_2=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_2,android.R.layout.simple_spinner_item);
        adapterT_1_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_2.setAdapter(adapterT_1_2);
        vT_1_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_1_3=(Spinner)v.findViewById(R.id.fT_1_3);
        ArrayAdapter<CharSequence> adapterT_1_3=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_3,android.R.layout.simple_spinner_item);
        adapterT_1_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_3.setAdapter(adapterT_1_3);
        vT_1_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_1_4=(Spinner)v.findViewById(R.id.fT_1_4);
        ArrayAdapter<CharSequence> adapterT_1_4=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_4,android.R.layout.simple_spinner_item);
        adapterT_1_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_4.setAdapter(adapterT_1_4);
        vT_1_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vT_1_5=(Spinner)v.findViewById(R.id.fT_1_5);
        ArrayAdapter<CharSequence> adapterT_1_5=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_5,android.R.layout.simple_spinner_item);
        adapterT_1_5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_5.setAdapter(adapterT_1_5);
        vT_1_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_1_6=(Spinner)v.findViewById(R.id.fT_1_6);
        ArrayAdapter<CharSequence> adapterT_1_6=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_1_6,android.R.layout.simple_spinner_item);
        adapterT_1_6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_1_6.setAdapter(adapterT_1_6);
        vT_1_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_2_1=(Spinner)v.findViewById(R.id.fT_2_1);
        ArrayAdapter<CharSequence> adapterT_2_1=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_1,android.R.layout.simple_spinner_item);
        adapterT_2_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_1.setAdapter(adapterT_2_1);
        vT_2_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_2_2=(Spinner)v.findViewById(R.id.fT_2_2);
        ArrayAdapter<CharSequence> adapterT_2_2=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_2,android.R.layout.simple_spinner_item);
        adapterT_2_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_2.setAdapter(adapterT_2_2);
        vT_2_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_2_3=(Spinner)v.findViewById(R.id.fT_2_3);
        ArrayAdapter<CharSequence> adapterT_2_3=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_3,android.R.layout.simple_spinner_item);
        adapterT_2_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_3.setAdapter(adapterT_2_3);
        vT_2_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_2_4=(Spinner)v.findViewById(R.id.fT_2_4);
        ArrayAdapter<CharSequence> adapterT_2_4=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_4,android.R.layout.simple_spinner_item);
        adapterT_2_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_4.setAdapter(adapterT_2_4);
        vT_2_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vT_2_5=(Spinner)v.findViewById(R.id.fT_2_5);
        ArrayAdapter<CharSequence> adapterT_2_5=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_5,android.R.layout.simple_spinner_item);
        adapterT_2_5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_5.setAdapter(adapterT_2_5);
        vT_2_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_2_6=(Spinner)v.findViewById(R.id.fT_2_6);
        ArrayAdapter<CharSequence> adapterT_2_6=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_2_6,android.R.layout.simple_spinner_item);
        adapterT_2_6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_2_6.setAdapter(adapterT_2_6);
        vT_2_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_3_1=(Spinner)v.findViewById(R.id.fT_3_1);
        ArrayAdapter<CharSequence> adapterT_3_1=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_1,android.R.layout.simple_spinner_item);
        adapterT_3_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_1.setAdapter(adapterT_3_1);
        vT_3_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_3_2=(Spinner)v.findViewById(R.id.fT_3_2);
        ArrayAdapter<CharSequence> adapterT_3_2=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_2,android.R.layout.simple_spinner_item);
        adapterT_3_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_2.setAdapter(adapterT_3_2);
        vT_3_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_3_3=(Spinner)v.findViewById(R.id.fT_3_3);
        ArrayAdapter<CharSequence> adapterT_3_3=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_3,android.R.layout.simple_spinner_item);
        adapterT_3_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_3.setAdapter(adapterT_3_3);
        vT_3_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_3_4=(Spinner)v.findViewById(R.id.fT_3_4);
        ArrayAdapter<CharSequence> adapterT_3_4=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_4,android.R.layout.simple_spinner_item);
        adapterT_3_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_4.setAdapter(adapterT_3_4);
        vT_3_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        vT_3_5=(Spinner)v.findViewById(R.id.fT_3_5);
        ArrayAdapter<CharSequence> adapterT_3_5=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_5,android.R.layout.simple_spinner_item);
        adapterT_3_5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_5.setAdapter(adapterT_3_5);
        vT_3_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(getActivity(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        vT_3_6=(Spinner)v.findViewById(R.id.fT_3_6);
        ArrayAdapter<CharSequence> adapterT_3_6=ArrayAdapter.createFromResource(getActivity(),R.array.arrT_3_6,android.R.layout.simple_spinner_item);
        adapterT_3_6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vT_3_6.setAdapter(adapterT_3_6);
        vT_3_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

