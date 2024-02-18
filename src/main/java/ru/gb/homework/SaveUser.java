package ru.gb.homework;

public class SaveUser implements Saver{
//класс отвечает только за сохраниене данных пользователя т.е. имени.
@Override
    public void save(User user){ //переопределение метода из интерфейса как нам надо
        System.out.println("Save user: " + user.getName());
    }
}
