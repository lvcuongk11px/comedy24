package comedy24.playup.com.comedy24.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import comedy24.playup.com.comedy24.object.GroupVideoItem;
import comedy24.playup.com.comedy24.adapter.GroupVideoItemAdapter;
import comedy24.playup.com.comedy24.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GroupVideoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GroupVideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GroupVideoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GroupVideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GroupVideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GroupVideoFragment newInstance(String param1, String param2) {
        GroupVideoFragment fragment = new GroupVideoFragment();
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
        GroupVideoItem[] groupVideoItems = new GroupVideoItem[4];
        groupVideoItems[0] = new GroupVideoItem("video 1", R.mipmap.video_icon);
        groupVideoItems[1] = new GroupVideoItem("video 2", R.mipmap.video_icon);
        groupVideoItems[2] = new GroupVideoItem("video 3", R.mipmap.video_icon);
        groupVideoItems[3] = new GroupVideoItem("video 4", R.mipmap.video_icon);

        View view = inflater.inflate(R.layout.fragment_group_video, container, false);
        GridView gv = (GridView) view.findViewById(R.id.my_griview);
        gv.setAdapter(new GroupVideoItemAdapter(getActivity(), groupVideoItems));
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
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
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
