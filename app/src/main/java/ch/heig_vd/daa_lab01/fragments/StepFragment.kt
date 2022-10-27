package ch.heig_vd.daa_lab01.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import ch.heig_vd.daa_lab01.R

class StepFragment : Fragment() {

    private var stackCounter: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            stackCounter = it.getInt(STACK_COUNT);
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frament_step, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.step_number).text = "Step\n$stackCounter"
    }

    companion object {
        private const val STACK_COUNT = "stack_count"

        @JvmStatic
        fun newInstance(stackCount: Int = 0) =
            StepFragment().apply {
                arguments = Bundle().apply {
                    putInt(STACK_COUNT, stackCount)
                }
            }
    }
}