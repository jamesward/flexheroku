package com.jamesward.flexheroku.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: James Ward <james@jamesward.org>
 * Date: 9/21/11
 * Time: 8:51 AM
 */

@Entity
public class Foo
{
    
    @Id
    @GeneratedValue
    public long id;

    public String name;

}