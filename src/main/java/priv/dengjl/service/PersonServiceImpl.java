package priv.dengjl.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import priv.dengjl.bean.Person;

public class PersonServiceImpl implements IPersonService{

    @Override
    public Person queryStudent(long id) {
        Person Person=new Person();
        Person.setBirthday(new Date());
        Person.setId(id); 
        Person.setName("王五");
        return Person;
    }
    @Override
    public List<Person> queryStudentList() {
        // 使用静态数据
        List<Person> list = new ArrayList<Person>();
        Person student1 = new Person();
        student1.setId(1000l);
        student1.setName("张三");
        student1.setBirthday(new Date());

		Person student2 = new Person();
        student2.setId(1000l);
        student2.setName("张三");
        student2.setBirthday(new Date());

        list.add(student1);
        list.add(student2);
        return list;
    }
}