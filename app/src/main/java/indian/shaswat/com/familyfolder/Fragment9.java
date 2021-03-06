package indian.shaswat.com.familyfolder;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment9.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment9#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment9 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    EditText vU_3_Name, vU_3_Age;
    CheckBox vU_3_1_a,vU_3_1_b,vU_3_1_c,vU_3_2_a,vU_3_2_b,vU_3_2_c,vU_3_3_a,vU_3_3_b,vU_3_4_a,vU_3_4_b,vU_3_4_c,vU_3_5_a,vU_3_5_b,vU_3_6_a,vU_3_6_b,vU_3_6_c,vU_3_6_d,vU_3_7_a,vU_3_8_a,vU_3_9_a;

    public Fragment9() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment9.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment9 newInstance(String param1, String param2) {
        Fragment9 fragment = new Fragment9();
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
        View v= inflater.inflate(R.layout.fragment_fragment9, container, false);

        initializeElements(v);

        return  v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle bundle) {
        if (mListener != null) {
            mListener.onFragmentInteraction9(bundle);
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

        bundle.putString("vU_3_Name",vU_3_Name.getText().toString());
        bundle.putString("vU_3_Age",vU_3_Age.getText().toString());

        bundle.putString("vU_3_1_a",String.valueOf(vU_3_1_a.isChecked()));
        bundle.putString("vU_3_1_b",String.valueOf(vU_3_1_b.isChecked()));
        bundle.putString("vU_3_1_c",String.valueOf(vU_3_1_c.isChecked()));

        bundle.putString("vU_3_2_a",String.valueOf(vU_3_2_a.isChecked()));
        bundle.putString("vU_3_2_b",String.valueOf(vU_3_2_b.isChecked()));
        bundle.putString("vU_3_2_c",String.valueOf(vU_3_2_c.isChecked()));

        bundle.putString("vU_3_3_a",String.valueOf(vU_3_3_a.isChecked()));
        bundle.putString("vU_3_3_b",String.valueOf(vU_3_3_b.isChecked()));

        bundle.putString("vU_3_4_a",String.valueOf(vU_3_4_a.isChecked()));
        bundle.putString("vU_3_4_b",String.valueOf(vU_3_4_b.isChecked()));
        bundle.putString("vU_3_4_c",String.valueOf(vU_3_4_c.isChecked()));

        bundle.putString("vU_3_5_a",String.valueOf(vU_3_5_a.isChecked()));
        bundle.putString("vU_3_5_b",String.valueOf(vU_3_5_b.isChecked()));

        bundle.putString("vU_3_6_a",String.valueOf(vU_3_6_a.isChecked()));
        bundle.putString("vU_3_6_b",String.valueOf(vU_3_6_b.isChecked()));
        bundle.putString("vU_3_6_c",String.valueOf(vU_3_6_c.isChecked()));
        bundle.putString("vU_3_6_d",String.valueOf(vU_3_6_c.isChecked()));

        bundle.putString("vU_3_7_a",String.valueOf(vU_3_7_a.isChecked()));
        bundle.putString("vU_3_8_a",String.valueOf(vU_3_8_a.isChecked()));
        bundle.putString("vU_3_9_a",String.valueOf(vU_3_9_a.isChecked()));



        mListener.onFragmentInteraction9(bundle);

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
        void onFragmentInteraction9(Bundle bundle);
    }

    private void initializeElements(View v) {

        vU_3_Name=v.findViewById(R.id.fU_3_Name);
        vU_3_Age=v.findViewById(R.id.fU_3_Age);

        vU_3_1_a=v.findViewById(R.id.fU_3_1_a);
        vU_3_1_b=v.findViewById(R.id.fU_3_1_b);
        vU_3_1_c=v.findViewById(R.id.fU_3_1_c);

        vU_3_2_a=v.findViewById(R.id.fU_3_2_a);
        vU_3_2_b=v.findViewById(R.id.fU_3_2_b);
        vU_3_2_c=v.findViewById(R.id.fU_3_2_c);

        vU_3_3_a=v.findViewById(R.id.fU_3_3_a);
        vU_3_3_b=v.findViewById(R.id.fU_3_3_b);

        vU_3_4_a=v.findViewById(R.id.fU_3_4_a);
        vU_3_4_b=v.findViewById(R.id.fU_3_4_b);
        vU_3_4_c=v.findViewById(R.id.fU_3_4_c);

        vU_3_5_a=v.findViewById(R.id.fU_3_5_a);
        vU_3_5_b=v.findViewById(R.id.fU_3_5_b);


        vU_3_6_a=v.findViewById(R.id.fU_3_6_a);
        vU_3_6_b=v.findViewById(R.id.fU_3_6_b);
        vU_3_6_c=v.findViewById(R.id.fU_3_6_c);
        vU_3_6_d=v.findViewById(R.id.fU_3_6_d);

        vU_3_7_a=v.findViewById(R.id.fU_3_9_a);

        vU_3_8_a=v.findViewById(R.id.fU_3_9_a);

        vU_3_9_a=v.findViewById(R.id.fU_3_9_a);


    }
    
}
