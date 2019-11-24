package com.sternkn.springboot.model;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;
import java.util.Random;

public class StudentGenerator extends SequenceStyleGenerator
{
    private static final String STUDENT_ID_PREFIX = "ST";

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException
    {
        return STUDENT_ID_PREFIX + String.valueOf(generateID());
    }

    public static char[] generateID()
    {
       //Creating object of Random class
       Random obj = new Random();

       char[] otp = new char[5];

       for (int i = 0; i < 5; i++) {
          otp[i] = (char) (obj.nextInt(10) + 48);
       }
       System.out.print("Your OTP is : " + otp.toString());
       return otp;
    }
}