class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun getUserDetails() {

        val user = UserModel("John Doe", "john@example.com")


        view.displayUserDetails(user)
    }
}