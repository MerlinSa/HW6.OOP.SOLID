package ru.gb.homework;

public class Main {
    public static void main(String[] args){

        Saver saver = new SaveUser(); //объект тип Saver = экземпляр класса SaveUser,
        // использовали абстрактный класс и полиморфизм для реал-ции OCP.
        ReportUser reporter = new ReportUser(); ////объект типа ReportUser = экземпляр класса ReportUser
        User user = new User("Bob"); //новый объект User и далее передаем его в качестве аргумента
        // методам report и save объектов ReportUser и SaveUser
        reporter.report(user); //вызываем метод report() для объекта-reporter кладем туда юзера т.е.передаем его в качестве аргумента
        saver.save(user);
        //user.report(); // здесь метод вызывается только для для объекта User.
        //user.save(); // для объекта User.
        //
    }
}

/**
 *  созданы два объекта классов SaveUser и ReportUser, а затем создан новый объект User и передала его в качестве
 *  аргумента методам report и save объектов ReportUser и SaveUser, соответственно.
 * Закомментированные строки кода являются вызовами методов report и save непосредственно для объекта User.
 */
