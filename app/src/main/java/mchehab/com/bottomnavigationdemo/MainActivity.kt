package mchehab.com.bottomnavigationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {

    val homeFragment = HomeFragment()
    val recentFragment = RecentFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuHome -> replaceFragment(homeFragment)
                R.id.menuRecent -> replaceFragment(recentFragment)
            }
            true
        }
        bottomNavigationView.selectedItemId = R.id.menuHome
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}