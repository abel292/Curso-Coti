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
                            "https://images.pexels.com/photos/4194623/pexels-photo-4194623.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            list.add(
                    ItemFoodPost(
                            "Bullanga",
                            "https://images.pexels.com/photos/1603901/pexels-photo-1603901.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            list.add(
                    ItemFoodPost(
                            "Hamburguesas",
                            "https://images.pexels.com/photos/2987564/pexels-photo-2987564.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                    )
            )
            list.add(
                ItemFoodPost(
                    "Pizza",
                    "https://images.pexels.com/photos/315755/pexels-photo-315755.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                    "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                )
            )
            list.add(
                ItemFoodPost(
                    "Asado",
                    "https://images.pexels.com/photos/3821692/pexels-photo-3821692.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                    "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati"


                )
            )
            return list

        }

    }

}

