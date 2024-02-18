package ru.gb.homework;

public class User { // User отвечает только за представление полей пользователя,
    // в нем метод getName помогает получить имени пользователя
    private final String name;
    private Saver saver;//добавлено переменная типа Saver, который хранит ссылку
    // на объект класса SaveUser.
    private Reporter reporter;//добавлено переменная типа Reporter, который хранит ссылку
    // на объект класса ReportUser.

    public User(String name) {
        this.name = name;
        this.saver = new SaveUser();
        this.reporter = new ReportUser();
    }

    public String getName() {
        return name;
    }

//    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }
/**
 * класс User отвечает за представление полей пользователя и обеспечивает методом getName,
 * который используется для получения имени пользователя.
 */


}
