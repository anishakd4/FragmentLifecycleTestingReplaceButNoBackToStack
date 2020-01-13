package com.developer.anishakd4.fragmenlifecycletesting


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentA : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FragmentA: ", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i("FragmentA: ", "onCreateView")
        return inflater.inflate(R.layout.fragment_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentA: ", "onViewCreated")
        go_to_fragmentb.setOnClickListener {
            val fragmentB: FragmentB = FragmentB()
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.container, fragmentB, "fragmentb")
                ?.commitAllowingStateLoss()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FragmentA: ", "onAttach")
    }

    override fun onResume() {
        super.onResume()
        Log.i("FragmentA: ", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("FragmentA: ", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentA: ", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("FragmentA: ", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentA: ", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FragmentA: ", "onDestroyView")
    }

}
