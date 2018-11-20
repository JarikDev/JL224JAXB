package com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Jarik");
        customer.setAge(18);

        File file=new File("myxml.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(customer,file);
        marshaller.marshal(customer,System.out);


    }
}



































