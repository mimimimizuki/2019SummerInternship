package com.rakuten.internship.entity;

/**
 * このクラスは、タスク管理の対象となるTodoのエンティティーです。
 * エンティティーとして使えるように、コードを記入してください。
 */
@Entity
@Table(name="todo_list")
public class Todo {
    @Id // main key
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title; //todo
    private String description; //detail of todo
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // TODO 必要なコードを記入してください。
}