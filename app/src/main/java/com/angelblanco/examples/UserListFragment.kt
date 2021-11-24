package com.angelblanco.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class UserListFragment: Fragment() {
    private _binding: FragmentUserListBinding? = null
    private val binding
        get() = bindind!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding
    }
}