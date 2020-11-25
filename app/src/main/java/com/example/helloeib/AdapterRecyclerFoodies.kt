import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.helloeib.DataFoodies
import com.example.helloeib.ItemFoodPost
import com.example.helloeib.R
import kotlinx.android.synthetic.main.item_favorite_food.view.*

class AdapterRecyclerFoodies (var context:Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<ItemFoodPost> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FoodViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_favorite_food, parent, false), context

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
            itemView: View, var context: Context
    ) : RecyclerView.ViewHolder(itemView) {

        val textViewTituloFavFood = itemView.findViewById(R.id.textViewTituloFavFood) as TextView?
        val textViewContentRecycler = itemView.findViewById(R.id.textViewContentRecycler) as TextView?
        val imageButtonRecycler = itemView.findViewById(R.id.imageButtonRecycler) as ImageView?

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


        }

    }
}





