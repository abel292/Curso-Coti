package com.example.helloeib

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.TRANSPARENT
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.RequiresApi
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_fragment_recycler_food.*
import kotlinx.android.synthetic.main.dialog_fragment_recycler_food.view.*

class RecyclerFoodImageDialogFragment(var itemFoodPost: ItemFoodPost) : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        super.onCreateDialog(savedInstanceState)

        val view =
            LayoutInflater.from(context).inflate(R.layout.dialog_fragment_recycler_food, null)

        view.buttonGoImage.setOnClickListener {
            val uri = Uri.parse(itemFoodPost.imageDrawable)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
            dismiss()
        }
        view.buttonDontGoImage.setOnClickListener {
            dismiss()
        }

        return AlertDialog.Builder(context).setView(view).create()
    }
}