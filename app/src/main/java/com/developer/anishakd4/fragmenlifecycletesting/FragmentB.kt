package com.developer.anishakd4.fragmenlifecycletesting


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fragment_b.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentB : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FragmentB: ", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i("FragmentB: ", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FragmentB: ", "onViewCreated")
        go_to_fragmentc.setOnClickListener {
            val fragmentC: FragmentC = FragmentC()
            activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.container, fragmentC, "fragmentc")
                    ?.commitAllowingStateLoss()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FragmentB: ", "onAttach")
    }

    override fun onResume() {
        super.onResume()
        Log.i("FragmentB: ", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("FragmentB: ", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FragmentB: ", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("FragmentB: ", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FragmentB: ", "onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FragmentB: ", "onDestroyView")
    }


}
