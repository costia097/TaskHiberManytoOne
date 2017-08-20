package net;

import net.models.Person;
import net.models.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class Logic {

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public void method() {
        Session currentSession = sessionFactory.getCurrentSession();
        Person personA = new Person();
        Phone phone1 = new Phone(111);
        Phone phone2 = new Phone(222);
        Phone phone3 = new Phone(333);
        personA.getGetPhone().add(phone1);
        personA.getGetPhone().add(phone2);
        personA.getGetPhone().add(phone3);

        currentSession.save(personA);
    }
}
