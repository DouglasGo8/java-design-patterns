package com.udemy.java.design.patterns.main.patterns.behavioral.strategy;

import java.util.Collection;

public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {

        System.out.println("*************** Summary Report ********************");
        //
        var iterator = orders.iterator();
        double total = 0;
        //
        for (int i = 1; iterator.hasNext(); i++) {
            var order = iterator.next();
            System.out.println(i + ". " + order.getId() + "\t" + order.getDate() + "\t"
                    + order.getItems().size() + "\t" + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("*************** End Report ********************");
        System.out.println("\t\t\t Total:" + total);
    }
}
