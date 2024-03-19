interface MainContract {
    interface View {
        fun displayUserDetails(user: UserModel)
    }

    interface Presenter {
        fun getUserDetails()
    }
}