package com.udemy.java.design.patterns.main.patterns.creational.abs.factory;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.aws.AwsResourceFactory;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.google.GoogleResourceFactory;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.Instance;

public class App {

    public static void main(String... args) {


        var aws = new Client(new AwsResourceFactory());
        var gcp = new Client(new GoogleResourceFactory());

        var awsIns1 = aws.createServer(Instance.Capacity.micro, 20480);
        awsIns1.start();
        awsIns1.stop();

        System.out.println("***********************");

        var gcpInst1 = gcp.createServer(Instance.Capacity.large, 5000210);
        gcpInst1.start();
        gcpInst1.stop();



    }
}
