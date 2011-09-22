package com.jamesward.flexheroku.services;

import com.jamesward.flexheroku.models.Foo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: James Ward <james@jamesward.org>
 * Date: 9/21/11
 * Time: 8:51 AM
 */

@RemotingDestination
@Transactional
@Repository
public class FooService
{
    @Autowired
    private SessionFactory sessionFactory;

    public Foo createFoo(Foo foo)
    {
        sessionFactory.getCurrentSession().save(foo);
        return foo;
    }

    public List<Foo> getAllFoos()
    {
        return sessionFactory.getCurrentSession().createCriteria(Foo.class).list();
    }

}