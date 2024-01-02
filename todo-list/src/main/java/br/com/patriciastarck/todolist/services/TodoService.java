package br.com.patriciastarck.todolist.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.patriciastarck.todolist.entities.Todo;
import br.com.patriciastarck.todolist.repositories.TodoRepository;

@Service
public class TodoService {
	//não vou colocar o autowired pq ele está implicito no constructor
	private TodoRepository todoRepository;
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> create(Todo todo){
		todoRepository.save(todo);	
		return list();
	}
	
	public List<Todo> list() {
		Sort sort = Sort.by("prioridade").descending().and(
			Sort.by("nome").ascending()
		);
		return todoRepository.findAll(sort);		
	}
	
	public List <Todo> update(Todo todo) {
		todoRepository.save(todo);
		return list();		
	}
	
	public List <Todo> delete(Long id) {
		todoRepository.deleteById(id);
		return list();		
	}
}
