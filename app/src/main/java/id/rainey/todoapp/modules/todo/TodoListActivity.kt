package id.rainey.todoapp.modules.todo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import id.rainey.todoapp.R
import id.rainey.todoapp.models.Todo

class TodoListActivity : AppCompatActivity(), TodoListContract.View {

    override lateinit var presenter: TodoListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        presenter = TodoListPresenter(this)

        presenter.start()
    }

    override fun showData(todos: List<Todo>) {
        //tampilkan data
        findViewById<ListView>(R.id.listView).apply {
            this.adapter = TodoListAdapter(todos, context)
        }
    }
}
