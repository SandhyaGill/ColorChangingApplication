package com.sandhyagill.colorchangingapplication

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.sandhyagill.colorchangingapplication.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment(), ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentFirstBinding
    lateinit var mainActivity: MainActivity
    var clFragment: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        mainActivity.activityInterface = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRed.setOnClickListener {
            Toast.makeText(requireContext(),"This is red Button", Toast.LENGTH_SHORT).show()
        }
        binding.btnBlue.setOnClickListener {
            Toast.makeText(requireContext(),"This is blue Button", Toast.LENGTH_SHORT).show()
        }
        binding.btnGreen.setOnClickListener {
            Toast.makeText(requireContext(),"This is green Button", Toast.LENGTH_SHORT).show()
        }

    }
    override fun getColorRed() {
        clFragment?.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.red))
    }

    override fun getColorBlue() {
        clFragment?.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.blue))
    }

    override fun getColorGreen() {
        clFragment?.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.green))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}