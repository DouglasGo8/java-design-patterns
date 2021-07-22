package com.udemy.java.design.patterns.main.patterns.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class App {

  public static void main(String... args) {


    new App().start();


        /*var order = new Order("100");
        var price = new PriceObserver();
        //
        order.attach(price);
        order.addItem(50);
        order.addItem(179);
        //
        System.out.println(order);*/

  }


  private void start() {
    var listOf = List.of(
            new MyClass("Emergência", ""),
            new MyClass("Emer/Isola", "Valter Arantes/ Nasc:07/06/1944/ Idade:77/ Sexo: M/ Conv:Particular"),
            new MyClass("UTI/PS.01", ""),
            new MyClass("UTI/PS.02", "Jair Nunes Pereira/ Nasc:15/09/1940/ Idade:80/ Sexo: M/ Conv:Bradesco Saúde Sa"),
            new MyClass("UTI/PS.03", "Barboooooooosa Nunes Pereira/ Nasc:15/09/1940/ Idade:80/ Sexo: M/ Conv:Bradesco Saúde Sa"));

    var f = listOf.stream().collect(Collectors.groupingBy(s -> s.getSetor().substring(0, 3))); //.forEach((v, k)-> out.println(v));


    var listOf2 = new ArrayList<MyDtoClass>();

    f.forEach((k, v) -> {
      var dto = new MyDtoClass(v.size(), v);
      listOf2.add(dto);
    });

  }

  @Getter
  @AllArgsConstructor
  final class MyDtoClass {
    private final int rowspan;
    private final List<MyClass> data;

    @Override
    public String toString() {
      return "MyDtoClass{" +
              "rowspan=" + rowspan +
              ", data=" + data +
              '}';
    }
  }


  @Getter
  @AllArgsConstructor
  final class MyClass {
    private final String setor;
    private final String paciente;
  }
}
