package ru.gb.homework;

public class ReportUser implements Reporter{
    //отвечает только за репорт данных юзеру.
    @Override
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }


//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
