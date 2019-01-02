package id.rainey.todoapp.modules.todo

import id.rainey.todoapp.BasePresenter
import id.rainey.todoapp.BaseView
import id.rainey.todoapp.models.Todo

interface TodoListContract {

    interface Presenter: BasePresenter {

        fun loadData()

    }

    interface View: BaseView<Presenter> {

        fun showData(todos: List<Todo>)

    }
}