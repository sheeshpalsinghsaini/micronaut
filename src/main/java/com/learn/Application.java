package com.learn;

import com.learn.dto.model.Student;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = Micronaut.run(Application.class, args);

        Student studentBean = applicationContext.getBean(Student.class);
        studentBean.setName("Sheeshpal Singh Saini");
        studentBean.setRollNo(38);
        System.out.println(studentBean);
    }
}