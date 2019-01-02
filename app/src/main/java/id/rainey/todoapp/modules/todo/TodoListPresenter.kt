package id.rainey.todoapp.modules.todo

import id.rainey.todoapp.models.Todo

class TodoListPresenter(val view: TodoListContract.View) : TodoListContract.Presenter {


    init {
        view.presenter = this
    }

    override fun loadData() {
        // ambil data dari server
        val todos = ArrayList<Todo>()
        view.showData(todos)
    }

    override fun start() {
        loadData()
    }

    fun getRepo() {

    }
}