package comedy24.playup.com.comedy24.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import comedy24.playup.com.comedy24.adapter.ListVideoItemAdapter;
import comedy24.playup.com.comedy24.object.ListViewVideoItem;
import comedy24.playup.com.comedy24.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyListVideoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyListVideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyListVideoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView listView = null;

    private OnFragmentInteractionListener mListener;

    public MyListVideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyListVideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyListVideoFragment newInstance(String param1, String param2) {
        MyListVideoFragment fragment = new MyListVideoFragment();
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
        ListViewVideoItem[] listViewVideoItems = new ListViewVideoItem[4];
        listViewVideoItems[0] = new ListViewVideoItem(10, "10:20", "abc");
        listViewVideoItems[1] = new ListViewVideoItem(20, "10:30", "abc");
        listViewVideoItems[2] = new ListViewVideoItem(30, "10:40", "abc");
        listViewVideoItems[3] = new ListViewVideoItem(40, "10:50", "abc");
        View view = inflater.inflate(R.layout.fragment_my_list_video, container, false);
        listView = (ListView) view.findViewById(R.id.my_video_list);
        listView.setAdapter(new ListVideoItemAdapter(getActivity(), listViewVideoItems));
        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.go_top);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                listView.setSelection(0);
            }
        });
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void goTop(View view) {
        if (listView != null) {
            listView.smoothScrollToPosition(0);
        }
    }


}
