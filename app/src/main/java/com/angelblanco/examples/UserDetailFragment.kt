package com.angelblanco.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso
import com.angelblanco.examples.databinding.FragmentUserDetailBinding

class UserDetailFragment : Fragment() {

    private var _binding: FragmentUserDetailBinding? = null
    private val binding
        get() = _binding!!

    private val args: UserDetailFragmentArgs by navArgs()
    private var firstName: String? = null
    private var surname: String? = null
    private var birthDate: String? = null
    private var age: String? = null
    private var country: String? = null
    private var picture: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Toast.makeText(context, "UserId: ${args.userId}", Toast.LENGTH_SHORT).show()

        binding.tvFirstNameShow.text = firstName
        binding.tvSubnameShow.text = surname
        binding.tvBirthdateShow.text = birthDate
        binding.tvAgeShow.text = age
        binding.tvCountryShow.text = country
        Picasso.get()
            .load(args.picture)
            .into(binding.ivAvatarDetail)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            firstName = it.getString("firstName")
            surname = it.getString("surname")
            birthDate = it.getString("birthDate")
            age = it.getString("age")
            country = it.getString("country")
            picture = it.getString("picture")
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}