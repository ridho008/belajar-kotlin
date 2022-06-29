package com.ridho.uasmoviecatalog

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ridho.uasmoviecatalog.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_profile.*


//private lateinit var binding: ActivityMainBinding
//private val binding get() = _binding!!
class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
//         Inflate the layout for this fragment
//         my profile


        val image = view?.findViewById<ImageView>(R.id.image)
        val title = view?.findViewById<TextView>(R.id.title)
        val subtitle = view?.findViewById<TextView>(R.id.subtitle)
        val list = view?.findViewById<RecyclerView>(R.id.list)

        if (image != null) {
            image.setImageResource(R.drawable.my_photo)
        }
        title?.text = "Ridha Surya"
        subtitle?.text = "Web Development"

        if (list != null) {
            list.adapter = linkAdapter
        } else {
            list?.adapter = linkAdapter
        }


        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = ResultProfileBinding.inflate(inflater, container, false)
//        val view = binding.root
//        return view
//    }

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? { return inflater.inflate(R.layout.fragment_profile, container, false) }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//            val image = findViewById<ImageView>(R.id.image)
//            val title = findViewById<TextView>(R.id.title)
//            val subtitle = findViewById<TextView>(R.id.subtitle)
//            val list : RecyclerView = findViewById(R.id.list)
//            val image = itemView.findViewById<ImageView>(R.id.image)
//
//            image.setImageResource(R.drawable.my_photo)
//            title.text = "Ridho Surya"
//            subtitle.text = "Web Development"
//
//            list.adapter = linkAdapter
//    }
//
//    private fun <T> findViewById(image: ImageView): Any {
//
//    }

    // Profile
    private val linkAdapter by lazy {
        val items = listOf<LinkModel>(
            LinkModel("WhatsApp", R.drawable.wa, "https://api.whatsapp.com/send?phone=085272773873"),
            LinkModel("Instagram", R.drawable.ig, "https://www.instagram.com/ridho_ssss/"),
            LinkModel("Website", R.drawable.web, "https://inforlajar.blogspot.com/")
        )

        LinkAdapter(items, object : LinkAdapter.AdapterListener {
            override fun onClick(linktree: LinkModel) {
                Log.e("onClick", linktree.url)
                openUrl(linktree.url)
            }

        })
    }

    private fun openUrl(url: String) {
        val openUrl = Intent(Intent.ACTION_VIEW)
        openUrl.data = Uri.parse(url)
        startActivity(openUrl)
    }
}