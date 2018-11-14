package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.jnlp.PersistenceService;
import java.util.Objects;

@SuppressWarnings("unused")
public class PersonForEquals {
    private final String name;
    private final short yearOfBirth;
    private PersonForEquals obj;

    public PersonForEquals(String name, short yearOfBirth) {
        if (name == null) {
            throw new IllegalArgumentException("name is mandatory.");
        }

        if (yearOfBirth <= 1900 || yearOfBirth >= 2019) {
            throw new IllegalArgumentException("year of birth is out of range.");
        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    @SuppressWarnings("Contract")
    @Override
    public boolean equals (Object obj) {
        // TODO: please modify the following code to pass the test
        // <--start
        if (obj != null) {
            if (!PersonForEquals.class.isAssignableFrom(obj.getClass())) {
                return false;
            }
            PersonForEquals another = (PersonForEquals) obj;
            if (another.getName() != null && another.getYearOfBirth() != 0 &&
                    another.getName() == this.name && another.getYearOfBirth() == this.yearOfBirth)
                return true;
            else
                return false;
        }
        else
            return false;
        //throw new NotImplementedException();
        // --end-->
    }

    @Override
    public int hashCode() {
        // TODO: please modify the following code to pass the test
        // <--start
        int hash = 0;
        for (int i=0; i<this.getName().toString().length();i++)
            hash += this.getName().toString().charAt(i);
        return hash*this.getYearOfBirth();
        //throw new NotImplementedException();
        // --end-->
    }
}
