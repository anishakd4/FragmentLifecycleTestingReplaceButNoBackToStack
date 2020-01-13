package com.developer.anishakd4.fragmenlifecycletesting


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class FragmentC : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FragmentC: ", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i("FragmentC: ", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentC: ", "onViewCreated")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FragmentC: ", "onAttach")
    }

    override fun onResume() {
        super.onResume()
        Log.i("FragmentC: ", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("FragmentC: ", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentC: ", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("FragmentC: ", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentC: ", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FragmentC: ", "onDestroyView")
    }


}
