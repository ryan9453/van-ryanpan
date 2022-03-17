package com.example.ryanpan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ryanpan.databinding.FragmentFirstBinding
import com.example.ryanpan.databinding.FragmentRoomBinding

class RoomFragment : Fragment() {
    companion object {
        val TAG = RoomFragment::class.java.simpleName
    }
    lateinit var binding: FragmentRoomBinding

    // 測試用 直播室網址（圖片版
    val mapOfRoomId = mapOf(
        "5015" to "https://i.imgur.com/bou4Cag.jpg", // 水水
        "5013" to "https://i.imgur.com/WbSlIAX.jpg", // 可比
        "5019" to "https://i.imgur.com/SdsqyXM.jpg", // 乐乐
        "5018" to "https://i.imgur.com/fPeogox.jpg", // 跳跳
        "5011" to "https://i.imgur.com/DUFDOxV.jpg", // Bee
        "5007" to "https://i.imgur.com/P5HmYNP.jpg", // 凌晨🌛
        "5016" to "https://i.imgur.com/dBnoHFo.jpg", // 妍淨
        "5014" to "https://i.imgur.com/NMG1Bf3.jpg", // 佳佳
        "5010" to "https://i.imgur.com/sb2J0TF.jpg", // 燕子
        "5012" to "https://i.imgur.com/VqtHiV6.jpg", // 肉肉
        "4971" to "https://i.imgur.com/viHyLC0.jpg", // 直播小帮手
        "5020" to "https://i.imgur.com/0QucvHy.jpg", // 小檸檬
        "5003" to "https://i.imgur.com/eI8KK9I.jpg", // 暖暖
        "5008" to "https://i.imgur.com/D1r3OYl.jpg", // 安苡萱
        "4972" to "https://i.imgur.com/BLUSgdg.jpg", // 直播小帮手
        "5017" to "https://i.imgur.com/jRv6i92.jpg", // 錢錢
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRoomBinding.inflate(inflater)
//        return super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 由此處開始寫 code
    }
}