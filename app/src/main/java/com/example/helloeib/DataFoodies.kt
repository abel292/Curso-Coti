package com.example.helloeib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DataFoodies {
    companion object {
        fun createDataFoodSet(): ArrayList<ItemFoodPost> {
            val list = ArrayList<ItemFoodPost>()
            list.add(
                    ItemFoodPost(
                            "Guiso de arroz",
                            "https://www.flaticon.com/free-icon/cooking_186146?term=stew&page=1&position=15&related_item_id=186146",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            list.add(
                    ItemFoodPost(
                            "Bullanga",
                            "https://www.flaticon.com/free-icon/cooking_186146?term=stew&page=1&position=15&related_item_id=186146",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            list.add(
                    ItemFoodPost(
                            "Hamburguesas",
                            "https://www.flaticon.com/free-icon/cooking_186146?term=stew&page=1&position=15&related_item_id=186146",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            return list

        }

    }

}

