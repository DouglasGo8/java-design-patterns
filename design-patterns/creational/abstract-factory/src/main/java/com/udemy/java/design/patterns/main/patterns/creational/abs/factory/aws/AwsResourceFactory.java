package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.aws;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.factories.ResourceFactory;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.EC2Instance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.Instance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.S3Storage;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }
}
