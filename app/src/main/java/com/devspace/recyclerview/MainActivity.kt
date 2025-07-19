package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Set Adapter
        // Lianer layout manager
        //Submeter a lista


        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

        adapter.submitList(contacts)

    }
}

private val contacts = listOf(
    Contact(
        name = "Ana",
        phone = "(55) 11 987479834",
        R.drawable.sample1
    ),
    Contact(
        name = "Rafael",
        phone = "(55) 11 987475284",
        R.drawable.sample2
),
    Contact(
        name = "Maria",
        phone = "(55) 11 987420364",
        R.drawable.sample3
    ),
    Contact(
        name = "Anne",
        phone = "(55) 11 920189834",
        R.drawable.sample4
    ),
    Contact(
        name = "Jaqueline",
        phone = "(55) 11 989479866",
        R.drawable.sample5
    ),
    Contact(
        name = "Dada",
        phone = "(55) 11 987665534",
        R.drawable.sample6
    ),
    Contact(
        name = "Yan",
        phone = "(55) 11 987478877",
        R.drawable.sample7
    ),
    Contact(
        name = "Silva",
        phone = "(55) 11 984479004",
        R.drawable.sample8
    ),
    Contact(
        name = "David",
        phone = "(55) 11 987422843",
        R.drawable.sample9
    ),
    Contact(
        name = "Francisco",
        phone = "(55) 11 987505034",
        R.drawable.sample10
    ),
    Contact(
        name = "keyla",
        phone = "(55) 11 987779830",
        R.drawable.sample11
    ),
    Contact(
        name = "Felipe",
        phone = "(55) 11 987309800",
        R.drawable.sample12
    ),
    Contact(
        name = "Viviane",
        phone = "(55) 11 999479833",
        R.drawable.sample13
    ),
    Contact(
        name = "Douglas",
        phone = "(55) 11 987477775",
        R.drawable.sample14
    ),
    Contact(
        name = "Val",
        phone = "(55) 11 987479955",
        R.drawable.sample15
    ),
    Contact(
        name = "Jessica",
        phone = "(55) 11 989470034",
        R.drawable.sample16
    )

)
