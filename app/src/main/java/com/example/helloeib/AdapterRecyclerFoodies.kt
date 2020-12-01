import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.helloeib.ItemFoodPost
import com.example.helloeib.R
import com.example.helloeib.RecyclerFoodImageDialogFragment


class AdapterRecyclerFoodies(var context: Context, var fragmentActivity: FragmentActivity) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<ItemFoodPost> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FoodViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_favorite_food, parent, false),
            context, fragmentActivity
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FoodViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }


    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(foodList: List<ItemFoodPost>) {
        items = foodList

    }

    class FoodViewHolder constructor(
        itemView: View, var context: Context, var fragmentActivity: FragmentActivity
    ) : RecyclerView.ViewHolder(itemView) {

        val textViewTituloFavFood = itemView.findViewById(R.id.textViewTituloFavFood) as TextView?
        val textViewContentRecycler =
            itemView.findViewById(R.id.textViewContentRecycler) as TextView?
        val imageButtonRecycler = itemView.findViewById(R.id.imageButtonRecycler) as ImageView?


        interface OnItemClickFood {
            fun onItemClickFood(item: ItemFoodPost, position: Int)
        }

        fun bind(itemFoodPost: ItemFoodPost) {

            textViewTituloFavFood?.setText(itemFoodPost.foodTitle)
            textViewContentRecycler?.setText(itemFoodPost.contentFood)
            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_guiso)
                .error(R.drawable.ic_guiso)
            if (imageButtonRecycler != null) {

                Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOption)
                    .load(itemFoodPost.imageDrawable)
                    .into(imageButtonRecycler)


            }
            itemView.setOnClickListener {
                var recyclerFoodImageDialogFragment = RecyclerFoodImageDialogFragment(itemFoodPost)
                recyclerFoodImageDialogFragment.show(fragmentActivity.supportFragmentManager, "TAG")
                recyclerFoodImageDialogFragment.setCancelable(true);

            }

        }
    }

    interface OnItemClickFood {

    }
}







