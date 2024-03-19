import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.isatask1.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        presenter.getUserDetails()
    }

    override fun displayUserDetails(user: UserModel) {

    }
}