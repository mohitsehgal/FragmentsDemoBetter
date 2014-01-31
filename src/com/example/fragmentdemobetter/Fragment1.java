package com.example.fragmentdemobetter;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass. Activities that
 * contain this fragment must implement the
 * {@link Fragment1.OnFragmentInteractionListener} interface to handle
 * interaction events. Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 * 
 */
public class Fragment1 extends Fragment {

	String list[]={"item1","item2","item3","item4","item5"};

	public Fragment1() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_1, container, false);
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		ListView lv=(ListView)getActivity().findViewById(R.id.listView1);
		lv.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1, android.R.id.text1 ,list ));
		
	}
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated to
	 * the activity and potentially other fragments contained in that activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
	public interface OnFragmentInteractionListener {
		// TODO: Update argument type and name
		public void onFragmentInteraction(Uri uri);
	}

}
