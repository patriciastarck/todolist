package br.com.patriciastarck.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.patriciastarck.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}
