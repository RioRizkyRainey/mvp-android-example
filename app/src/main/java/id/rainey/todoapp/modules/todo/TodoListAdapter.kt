package id.rainey.todoapp.modules.todo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import id.rainey.todoapp.R
import id.rainey.todoapp.models.Todo

class TodoListAdapter(val todos: List<Todo>, val context: Context) : BaseAdapter() {

    val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {
        var view = inflater.inflate(R.layout.item_todo, viewGroup, false)
        view.findViewById<TextView>(R.id.text).apply {
            this.text = getItem(index).text
        }
        return view
    }

    override fun getItem(index: Int): Todo {
        return todos.get(index)
    }

    override fun getItemId(index: Int): Long {
        return index.toLong()
    }

    override fun getCount(): Int {
        return todos.size
    }

}